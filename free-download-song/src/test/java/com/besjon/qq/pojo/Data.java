/**
  * Copyright 2017 bejson.com 
  */
package com.besjon.qq.pojo;
import java.util.List;

/**
 * Auto-generated: 2017-10-12 20:8:13
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private int expiration;
    private List<Items> items;
    public void setExpiration(int expiration) {
         this.expiration = expiration;
     }
     public int getExpiration() {
         return expiration;
     }

    public void setItems(List<Items> items) {
         this.items = items;
     }
     public List<Items> getItems() {
         return items;
     }

}