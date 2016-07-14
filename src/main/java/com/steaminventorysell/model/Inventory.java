package com.steaminventorysell.model;

import java.math.BigDecimal;

/**
 * Created by Gustavo on 13/07/2016.
 */
public class Inventory {

    private String imageURL;
    private String name;
    private BigDecimal price;

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
