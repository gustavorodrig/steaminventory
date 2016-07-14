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
        "id",
        "classid",
        "instanceid",
        "amount",
        "pos"
})
public class InventoryID {

    @JsonProperty("id")
    private String id;
    @JsonProperty("classid")
    private String classid;
    @JsonProperty("instanceid")
    private String instanceid;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("pos")
    private Integer pos;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The classid
     */
    @JsonProperty("classid")
    public String getClassid() {
        return classid;
    }

    /**
     *
     * @param classid
     * The classid
     */
    @JsonProperty("classid")
    public void setClassid(String classid) {
        this.classid = classid;
    }

    /**
     *
     * @return
     * The instanceid
     */
    @JsonProperty("instanceid")
    public String getInstanceid() {
        return instanceid;
    }

    /**
     *
     * @param instanceid
     * The instanceid
     */
    @JsonProperty("instanceid")
    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid;
    }

    /**
     *
     * @return
     * The amount
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    /**
     *
     * @param amount
     * The amount
     */
    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     *
     * @return
     * The pos
     */
    @JsonProperty("pos")
    public Integer getPos() {
        return pos;
    }

    /**
     *
     * @param pos
     * The pos
     */
    @JsonProperty("pos")
    public void setPos(Integer pos) {
        this.pos = pos;
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