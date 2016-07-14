package com.steaminventorysell.controller.external;

import com.steaminventorysell.model.steamclient.inventory.SteamInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gustavo on 11/07/2016.
 */

@Component
public class InventoryComponent {

    @Autowired
    private RestTemplate restTemplate;

    private final String UrlUser = "http://steamcommunity.com/id/{id}/inventory/json/570/2/";
    private final String UrlSteamId = "http://steamcommunity.com/profiles/{id}/inventory/json/570/2/";


    public SteamInventory searchbySteamUrlUser(String steamID){

        UriComponentsBuilder componentBuilder = UriComponentsBuilder.fromUriString(UrlUser);
        Map<String, String> parameters = new HashMap<>();
        parameters.put("id", steamID);
        URI uri = componentBuilder.buildAndExpand(parameters).toUri();

        SteamInventory steamInventory = restTemplate.getForObject(uri, SteamInventory.class);

        return steamInventory;

    }

}

//id/ins4nnnobr/inventory/json/753/1/ CS
//id/ins4nnnobr/inventory/json/570/2/ Dota2
//http://www.leveluplunch.com/java/examples/construct-build-uri/