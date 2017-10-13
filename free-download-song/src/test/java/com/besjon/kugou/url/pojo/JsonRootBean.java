/**
  * Copyright 2017 bejson.com 
  */
package com.besjon.kugou.url.pojo;

/**
 * Auto-generated: 2017-10-12 22:2:43
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    private int status;
    private int err_code;
    private Data data;
    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setErr_code(int err_code) {
         this.err_code = err_code;
     }
     public int getErr_code() {
         return err_code;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

}