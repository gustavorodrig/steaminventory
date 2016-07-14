package com.steaminventorysell.controller.internal;

import com.steaminventorysell.model.Inventory;
import com.steaminventorysell.model.Search;
import com.steaminventorysell.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/inventory")
public class InventoryController {

	private static final String INVENTORY_VIEW = "Inventory";

	@Autowired
	InventoryService service;

	@RequestMapping("/")
	@ModelAttribute("items")
	public ModelAndView index() {

		List<Inventory> items = new ArrayList<>();
		ModelAndView mv = new ModelAndView(INVENTORY_VIEW);
		mv.addObject("items", items);
		mv.addObject("search", new Search());
		return mv;
	}


	@RequestMapping(value="/search", method=RequestMethod.POST)
	@ModelAttribute("items")
	public ModelAndView search(@ModelAttribute Search search) {

		List<Inventory> items = service.searchInventoryBySteamId(search.getId());

		ModelAndView mv = new ModelAndView(INVENTORY_VIEW);
		mv.addObject("items", items);
		return mv;
	}

}
