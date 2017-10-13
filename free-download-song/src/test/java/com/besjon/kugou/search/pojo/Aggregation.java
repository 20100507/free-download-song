package com.besjon.kugou.search.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Auto-generated: 2017-10-12 22:53:31
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
@JsonIgnoreProperties(ignoreUnknown = true)   
public class Aggregation implements Serializable{
	
    public Aggregation() {
		super();
	}
	private String key;
    private int count;
    public void setKey(String key) {
         this.key = key;
     }
     public String getKey() {
         return key;
     }

    public void setCount(int count) {
         this.count = count;
     }
     public int getCount() {
         return count;
     }

}