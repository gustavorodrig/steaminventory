package com.steaminventorysell.model.steamclient.inventory;

/**
 * Created by Gustavo on 12/07/2016.
 */

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "DescriptionID"
})
public class RgDescriptions {

    @JsonIgnore
    private  Map<String, DescriptionID> descriptionID = new HashMap<String, DescriptionID>();

        /**
     *
     * @return
     * The descriptionID
     */
    @JsonAnyGetter
    public Map<String, DescriptionID> getDescriptionID() {
        return descriptionID;
    }

    /**
     *
     * @param descriptionID
     * The DescriptionID
     */
    @JsonAnySetter
    public void setDescriptionID(String name, DescriptionID descriptionID) {
        this.descriptionID.put(name, descriptionID);
    }
}