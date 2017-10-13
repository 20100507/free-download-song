package com.besjon.kugou.search.pojo;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Auto-generated: 2017-10-12 22:53:31
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
@JsonIgnoreProperties(ignoreUnknown = true)   
public class Data implements Serializable{
	
    public Data() {
		super();
	}
	private int page;
    private String tab;
    private List<Lists> lists;
    private int chinesecount;
    private int searchfull;
    private int correctiontype;
    private int subjecttype;
    private List<Aggregation> aggregation;
    private int allowerr;
    private String correctionsubject;
    private int correctionforce;
    private int total;
    private int istagresult;
    private int istag;
    private String correctiontip;
    private int pagesize;
    public void setPage(int page) {
         this.page = page;
     }
     public int getPage() {
         return page;
     }

    public void setTab(String tab) {
         this.tab = tab;
     }
     public String getTab() {
         return tab;
     }

    public void setLists(List<Lists> lists) {
         this.lists = lists;
     }
     public List<Lists> getLists() {
         return lists;
     }

    public void setChinesecount(int chinesecount) {
         this.chinesecount = chinesecount;
     }
     public int getChinesecount() {
         return chinesecount;
     }

    public void setSearchfull(int searchfull) {
         this.searchfull = searchfull;
     }
     public int getSearchfull() {
         return searchfull;
     }

    public void setCorrectiontype(int correctiontype) {
         this.correctiontype = correctiontype;
     }
     public int getCorrectiontype() {
         return correctiontype;
     }

    public void setSubjecttype(int subjecttype) {
         this.subjecttype = subjecttype;
     }
     public int getSubjecttype() {
         return subjecttype;
     }

    public void setAggregation(List<Aggregation> aggregation) {
         this.aggregation = aggregation;
     }
     public List<Aggregation> getAggregation() {
         return aggregation;
     }

    public void setAllowerr(int allowerr) {
         this.allowerr = allowerr;
     }
     public int getAllowerr() {
         return allowerr;
     }

    public void setCorrectionsubject(String correctionsubject) {
         this.correctionsubject = correctionsubject;
     }
     public String getCorrectionsubject() {
         return correctionsubject;
     }

    public void setCorrectionforce(int correctionforce) {
         this.correctionforce = correctionforce;
     }
     public int getCorrectionforce() {
         return correctionforce;
     }

    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setIstagresult(int istagresult) {
         this.istagresult = istagresult;
     }
     public int getIstagresult() {
         return istagresult;
     }

    public void setIstag(int istag) {
         this.istag = istag;
     }
     public int getIstag() {
         return istag;
     }

    public void setCorrectiontip(String correctiontip) {
         this.correctiontip = correctiontip;
     }
     public String getCorrectiontip() {
         return correctiontip;
     }

    public void setPagesize(int pagesize) {
         this.pagesize = pagesize;
     }
     public int getPagesize() {
         return pagesize;
     }

}