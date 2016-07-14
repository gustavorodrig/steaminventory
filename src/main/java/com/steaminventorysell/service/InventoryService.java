package com.steaminventorysell.service;

import com.steaminventorysell.controller.external.InventoryComponent;
import com.steaminventorysell.model.Inventory;
import com.steaminventorysell.model.steamclient.inventory.DescriptionID;
import com.steaminventorysell.model.steamclient.inventory.SteamInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Gustavo on 13/07/2016.
 */
@Service
public class InventoryService {

    @Autowired
    InventoryComponent inventoryComponent;

    public List<Inventory> searchInventoryBySteamId(String steamId){

        SteamInventory steamInventory = inventoryComponent.searchbySteamUrlUser(steamId);
        return this.convertSteamInventoryToInventory(steamInventory);

    }

    private List<Inventory> convertSteamInventoryToInventory(SteamInventory steamInventory) {

        String imageUrl = "http://cdn.steamcommunity.com/economy/image/";

        List<Inventory> inventoryList = new ArrayList<>();

        Map<String, DescriptionID> descriptionID = steamInventory.getRgDescriptions().getDescriptionID();

        for (Map.Entry<String, DescriptionID> key : descriptionID.entrySet()) {

            DescriptionID value = key.getValue();

            Inventory inv = new Inventory();

            inv.setImageURL(imageUrl + value.getIconUrl());
            inv.setName(value.getMarketName());
            inv.setPrice(new BigDecimal("0.00"));

            inventoryList.add(inv);

            if(inventoryList.size() == 10){
                break;
            }
        }

        return inventoryList;

    }


}
