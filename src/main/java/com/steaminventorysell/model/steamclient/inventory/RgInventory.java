package com.steaminventorysell.model.steamclient.inventory;

/**
 * Created by Gustavo on 12/07/2016.
 */
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "InventoryID"
})
public class RgInventory {

    @JsonProperty("InventoryID")
    private InventoryID inventoryID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The inventoryID
     */
    @JsonProperty("InventoryID")
    public InventoryID getInventoryID() {
        return inventoryID;
    }

    /**
     *
     * @param inventoryID
     * The InventoryID
     */
    @JsonProperty("InventoryID")
    public void setInventoryID(InventoryID inventoryID) {
        this.inventoryID = inventoryID;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}