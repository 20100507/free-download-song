package com.besjon.kugou.search.pojo;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2017-10-12 22:53:31
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
@JsonIgnoreProperties(ignoreUnknown = true)   
public class JsonsRootBeanSearch implements Serializable{

	
    public JsonsRootBeanSearch() {
		super();
	}
	private int status;
    @JsonProperty("error_code")
    private int errorCode;
    private Data data;
    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setErrorCode(int errorCode) {
         this.errorCode = errorCode;
     }
     public int getErrorCode() {
         return errorCode;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

}