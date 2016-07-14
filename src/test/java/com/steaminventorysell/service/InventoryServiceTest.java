package com.steaminventorysell.service;

import com.steaminventorysell.Application;
import com.steaminventorysell.model.Inventory;
import org.hibernate.validator.cfg.defs.AssertTrueDef;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.validation.constraints.AssertTrue;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Gustavo on 13/07/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@Ignore
public class InventoryServiceTest {

    @Autowired
    InventoryService inventoryService;

    @Test
    public void testSearchInventoryBySteamId() throws Exception {


        List<Inventory> items = inventoryService.searchInventoryBySteamId("ins4nnnobr");

        Assert.assertTrue(!items.isEmpty());


    }
}