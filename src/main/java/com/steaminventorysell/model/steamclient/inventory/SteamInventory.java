package com.steaminventorysell.model.steamclient.inventory;

/**
 * Created by Gustavo on 12/07/2016.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        "success",
        "rgInventory",
        "rgCurrency",
        "rgDescriptions",
        "more",
        "more_start"
})
public class SteamInventory {

    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("rgInventory")
    private RgInventory rgInventory;
    @JsonProperty("rgCurrency")
    private List<Object> rgCurrency = new ArrayList<Object>();
    @JsonProperty("rgDescriptions")
    private RgDescriptions rgDescriptions;
    @JsonProperty("more")
    private Boolean more;
    @JsonProperty("more_start")
    private Boolean moreStart;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The success
     */
    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    /**
     *
     * @param success
     * The success
     */
    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     *
     * @return
     * The rgInventory
     */
    @JsonProperty("rgInventory")
    public RgInventory getRgInventory() {
        return rgInventory;
    }

    /**
     *
     * @param rgInventory
     * The rgInventory
     */
    @JsonProperty("rgInventory")
    public void setRgInventory(RgInventory rgInventory) {
        this.rgInventory = rgInventory;
    }

    /**
     *
     * @return
     * The rgCurrency
     */
    @JsonProperty("rgCurrency")
    public List<Object> getRgCurrency() {
        return rgCurrency;
    }

    /**
     *
     * @param rgCurrency
     * The rgCurrency
     */
    @JsonProperty("rgCurrency")
    public void setRgCurrency(List<Object> rgCurrency) {
        this.rgCurrency = rgCurrency;
    }

    /**
     *
     * @return
     * The rgDescriptions
     */
    @JsonProperty("rgDescriptions")
    public RgDescriptions getRgDescriptions() {
        return rgDescriptions;
    }

    /**
     *
     * @param rgDescriptions
     * The rgDescriptions
     */
    @JsonProperty("rgDescriptions")
    public void setRgDescriptions(RgDescriptions rgDescriptions) {
        this.rgDescriptions = rgDescriptions;
    }

    /**
     *
     * @return
     * The more
     */
    @JsonProperty("more")
    public Boolean getMore() {
        return more;
    }

    /**
     *
     * @param more
     * The more
     */
    @JsonProperty("more")
    public void setMore(Boolean more) {
        this.more = more;
    }

    /**
     *
     * @return
     * The moreStart
     */
    @JsonProperty("more_start")
    public Boolean getMoreStart() {
        return moreStart;
    }

    /**
     *
     * @param moreStart
     * The more_start
     */
    @JsonProperty("more_start")
    public void setMoreStart(Boolean moreStart) {
        this.moreStart = moreStart;
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