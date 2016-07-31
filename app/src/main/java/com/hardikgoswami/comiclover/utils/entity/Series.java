
package com.hardikgoswami.comiclover.utils.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Series {

    private Integer available;
    private String collectionURI;
    private List<Item_> items = new ArrayList<Item_>();
    private Integer returned;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The available
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    public void setAvailable(Integer available) {
        this.available = available;
    }

    /**
     * 
     * @return
     *     The collectionURI
     */
    public String getCollectionURI() {
        return collectionURI;
    }

    /**
     * 
     * @param collectionURI
     *     The collectionURI
     */
    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item_> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item_> items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The returned
     */
    public Integer getReturned() {
        return returned;
    }

    /**
     * 
     * @param returned
     *     The returned
     */
    public void setReturned(Integer returned) {
        this.returned = returned;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
