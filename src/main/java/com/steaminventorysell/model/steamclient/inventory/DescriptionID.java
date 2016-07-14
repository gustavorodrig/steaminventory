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
        "appid",
        "classid",
        "instanceid",
        "icon_url",
        "icon_url_large",
        "icon_drag_url",
        "name",
        "market_name",
        "name_color",
        "background_color",
        "type",
        "tradable",
        "marketable",
        "commodity",
        "descriptions",
        "actions"
})
public class DescriptionID {

    @JsonProperty("appid")
    private String appid;
    @JsonProperty("classid")
    private String classid;
    @JsonProperty("instanceid")
    private String instanceid;
    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("icon_url_large")
    private String iconUrlLarge;
    @JsonProperty("icon_drag_url")
    private String iconDragUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("market_name")
    private String marketName;
    @JsonProperty("name_color")
    private String nameColor;
    @JsonProperty("background_color")
    private String backgroundColor;
    @JsonProperty("type")
    private String type;
    @JsonProperty("tradable")
    private Integer tradable;
    @JsonProperty("marketable")
    private Integer marketable;
    @JsonProperty("commodity")
    private Integer commodity;

    //FIXME Ajustar pois esta dando erro quando no json vem "".. verificar getters e setters
    @JsonProperty("descriptionsX")
    private List<Description> descriptions = new ArrayList<Description>();

    @JsonProperty("actions")
    private List<Action> actions = new ArrayList<Action>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The appid
     */
    @JsonProperty("appid")
    public String getAppid() {
        return appid;
    }

    /**
     *
     * @param appid
     * The appid
     */
    @JsonProperty("appid")
    public void setAppid(String appid) {
        this.appid = appid;
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
     * The iconUrl
     */
    @JsonProperty("icon_url")
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     *
     * @param iconUrl
     * The icon_url
     */
    @JsonProperty("icon_url")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     *
     * @return
     * The iconUrlLarge
     */
    @JsonProperty("icon_url_large")
    public String getIconUrlLarge() {
        return iconUrlLarge;
    }

    /**
     *
     * @param iconUrlLarge
     * The icon_url_large
     */
    @JsonProperty("icon_url_large")
    public void setIconUrlLarge(String iconUrlLarge) {
        this.iconUrlLarge = iconUrlLarge;
    }

    /**
     *
     * @return
     * The iconDragUrl
     */
    @JsonProperty("icon_drag_url")
    public String getIconDragUrl() {
        return iconDragUrl;
    }

    /**
     *
     * @param iconDragUrl
     * The icon_drag_url
     */
    @JsonProperty("icon_drag_url")
    public void setIconDragUrl(String iconDragUrl) {
        this.iconDragUrl = iconDragUrl;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The marketName
     */
    @JsonProperty("market_name")
    public String getMarketName() {
        return marketName;
    }

    /**
     *
     * @param marketName
     * The market_name
     */
    @JsonProperty("market_name")
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    /**
     *
     * @return
     * The nameColor
     */
    @JsonProperty("name_color")
    public String getNameColor() {
        return nameColor;
    }

    /**
     *
     * @param nameColor
     * The name_color
     */
    @JsonProperty("name_color")
    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    /**
     *
     * @return
     * The backgroundColor
     */
    @JsonProperty("background_color")
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     *
     * @param backgroundColor
     * The background_color
     */
    @JsonProperty("background_color")
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     *
     * @return
     * The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The tradable
     */
    @JsonProperty("tradable")
    public Integer getTradable() {
        return tradable;
    }

    /**
     *
     * @param tradable
     * The tradable
     */
    @JsonProperty("tradable")
    public void setTradable(Integer tradable) {
        this.tradable = tradable;
    }

    /**
     *
     * @return
     * The marketable
     */
    @JsonProperty("marketable")
    public Integer getMarketable() {
        return marketable;
    }

    /**
     *
     * @param marketable
     * The marketable
     */
    @JsonProperty("marketable")
    public void setMarketable(Integer marketable) {
        this.marketable = marketable;
    }

    /**
     *
     * @return
     * The commodity
     */
    @JsonProperty("commodity")
    public Integer getCommodity() {
        return commodity;
    }

    /**
     *
     * @param commodity
     * The commodity
     */
    @JsonProperty("commodity")
    public void setCommodity(Integer commodity) {
        this.commodity = commodity;
    }

    /**
     *
     * @return
     * The descriptions
     */
    @JsonProperty("descriptionsX")
    public List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     *
     * @param descriptions
     * The descriptions
     */
    @JsonProperty("descriptionsX")
    @JsonIgnore
    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     *
     * @return
     * The actions
     */
    @JsonProperty("actions")
    public List<Action> getActions() {
        return actions;
    }

    /**
     *
     * @param actions
     * The actions
     */
    @JsonProperty("actions")
    public void setActions(List<Action> actions) {
        this.actions = actions;
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