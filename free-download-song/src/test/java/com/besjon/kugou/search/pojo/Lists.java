package com.besjon.kugou.search.pojo;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
/**
 * Auto-generated: 2017-10-12 22:53:31
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
@JsonIgnoreProperties(ignoreUnknown = true)   
public class Lists implements Serializable{
	
    public Lists() {
	}

	@JsonProperty("SongName")
    private String songname;
    @JsonProperty("OwnerCount")
    private int ownercount;
    @JsonProperty("MvType")
    private int mvtype;
    @JsonProperty("TopicRemark")
    private String topicremark;
    @JsonProperty("SQFailProcess")
    private int sqfailprocess;
    @JsonProperty("Source")
    private String source;
    @JsonProperty("Bitrate")
    private int bitrate;
    @JsonProperty("HQExtName")
    private String hqextname;
    @JsonProperty("SQFileSize")
    private int sqfilesize;
    @JsonProperty("ResFileSize")
    private int resfilesize;
    @JsonProperty("Duration")
    private int duration;
    @JsonProperty("MvTrac")
    private int mvtrac;
    @JsonProperty("SQDuration")
    private int sqduration;
    @JsonProperty("ExtName")
    private String extname;
    @JsonProperty("Auxiliary")
    private String auxiliary;
    @JsonProperty("SongLabel")
    private String songlabel;
    @JsonProperty("Scid")
    private int scid;
    @JsonProperty("FailProcess")
    private int failprocess;
    @JsonProperty("SQBitrate")
    private int sqbitrate;
    @JsonProperty("HQBitrate")
    private int hqbitrate;
    @JsonProperty("Audioid")
    private int audioid;
    @JsonProperty("HiFiQuality")
    private int hifiquality;
    @JsonProperty("AlbumPrivilege")
    private int albumprivilege;
    @JsonProperty("TopicUrl")
    private String topicurl;
    @JsonProperty("SuperFileHash")
    private String superfilehash;
    @JsonProperty("ASQPrivilege")
    private int asqprivilege;
    @JsonProperty("M4aSize")
    private int m4asize;
    @JsonProperty("AlbumName")
    private String albumname;
    @JsonProperty("Privilege")
    private int privilege;
    @JsonProperty("ResBitrate")
    private int resbitrate;
    @JsonProperty("HQFailProcess")
    private int hqfailprocess;
    @JsonProperty("SQPayType")
    private int sqpaytype;
    @JsonProperty("HQPrice")
    private int hqprice;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("SourceID")
    private int sourceid;
    @JsonProperty("FileName")
    private String filename;
    @JsonProperty("ID")
    private String id;
    @JsonProperty("SuperFileSize")
    private int superfilesize;
    @JsonProperty("QualityLevel")
    private int qualitylevel;
    @JsonProperty("SQFileHash")
    private String sqfilehash;
    @JsonProperty("A320Privilege")
    private int a320privilege;
    @JsonProperty("HQPrivilege")
    private int hqprivilege;
    @JsonProperty("SuperBitrate")
    private int superbitrate;
    @JsonProperty("SuperDuration")
    private int superduration;
    @JsonProperty("AlbumID")
    private String albumid;
    @JsonProperty("ResFileHash")
    private String resfilehash;
    @JsonProperty("PublishAge")
    private int publishage;
    @JsonProperty("MixSongID")
    private String mixsongid;
    @JsonProperty("HQFileHash")
    private String hqfilehash;
    @JsonProperty("SuperExtName")
    private String superextname;
    @JsonProperty("HQPayType")
    private int hqpaytype;
    @JsonProperty("PayType")
    private int paytype;
    @JsonProperty("Accompany")
    private int accompany;
    @JsonProperty("SQExtName")
    private String sqextname;
    @JsonProperty("PkgPrice")
    private int pkgprice;
    @JsonProperty("HQFileSize")
    private int hqfilesize;
    @JsonProperty("FileSize")
    private int filesize;
    @JsonProperty("Publish")
    private int publish;
    @JsonProperty("AudioCdn")
    private int audiocdn;
    @JsonProperty("SQPrice")
    private int sqprice;
    @JsonProperty("ResDuration")
    private int resduration;
    @JsonProperty("OldCpy")
    private int oldcpy;
    @JsonProperty("Price")
    private int price;
    @JsonProperty("HQPkgPrice")
    private int hqpkgprice;
    @JsonProperty("SingerName")
    private String singername;
    @JsonProperty("SQPrivilege")
    private int sqprivilege;
    @JsonProperty("MvHash")
    private String mvhash;
    @JsonProperty("SQPkgPrice")
    private int sqpkgprice;
    @JsonProperty("HQDuration")
    private int hqduration;
    @JsonProperty("OtherName")
    private String othername;
    @JsonProperty("HasAlbum")
    private int hasalbum;
    @JsonProperty("mvTotal")
    private int mvtotal;
    @JsonProperty("FileHash")
    private String filehash;
    public void setSongname(String songname) {
         this.songname = songname;
     }
     public String getSongname() {
         return songname;
     }

    public void setOwnercount(int ownercount) {
         this.ownercount = ownercount;
     }
     public int getOwnercount() {
         return ownercount;
     }

    public void setMvtype(int mvtype) {
         this.mvtype = mvtype;
     }
     public int getMvtype() {
         return mvtype;
     }

    public void setTopicremark(String topicremark) {
         this.topicremark = topicremark;
     }
     public String getTopicremark() {
         return topicremark;
     }

    public void setSqfailprocess(int sqfailprocess) {
         this.sqfailprocess = sqfailprocess;
     }
     public int getSqfailprocess() {
         return sqfailprocess;
     }

    public void setSource(String source) {
         this.source = source;
     }
     public String getSource() {
         return source;
     }

    public void setBitrate(int bitrate) {
         this.bitrate = bitrate;
     }
     public int getBitrate() {
         return bitrate;
     }

    public void setHqextname(String hqextname) {
         this.hqextname = hqextname;
     }
     public String getHqextname() {
         return hqextname;
     }

    public void setSqfilesize(int sqfilesize) {
         this.sqfilesize = sqfilesize;
     }
     public int getSqfilesize() {
         return sqfilesize;
     }

    public void setResfilesize(int resfilesize) {
         this.resfilesize = resfilesize;
     }
     public int getResfilesize() {
         return resfilesize;
     }

    public void setDuration(int duration) {
         this.duration = duration;
     }
     public int getDuration() {
         return duration;
     }

    public void setMvtrac(int mvtrac) {
         this.mvtrac = mvtrac;
     }
     public int getMvtrac() {
         return mvtrac;
     }

    public void setSqduration(int sqduration) {
         this.sqduration = sqduration;
     }
     public int getSqduration() {
         return sqduration;
     }

    public void setExtname(String extname) {
         this.extname = extname;
     }
     public String getExtname() {
         return extname;
     }

    public void setAuxiliary(String auxiliary) {
         this.auxiliary = auxiliary;
     }
     public String getAuxiliary() {
         return auxiliary;
     }

    public void setSonglabel(String songlabel) {
         this.songlabel = songlabel;
     }
     public String getSonglabel() {
         return songlabel;
     }

    public void setScid(int scid) {
         this.scid = scid;
     }
     public int getScid() {
         return scid;
     }

    public void setFailprocess(int failprocess) {
         this.failprocess = failprocess;
     }
     public int getFailprocess() {
         return failprocess;
     }

    public void setSqbitrate(int sqbitrate) {
         this.sqbitrate = sqbitrate;
     }
     public int getSqbitrate() {
         return sqbitrate;
     }

    public void setHqbitrate(int hqbitrate) {
         this.hqbitrate = hqbitrate;
     }
     public int getHqbitrate() {
         return hqbitrate;
     }

    public void setAudioid(int audioid) {
         this.audioid = audioid;
     }
     public int getAudioid() {
         return audioid;
     }

    public void setHifiquality(int hifiquality) {
         this.hifiquality = hifiquality;
     }
     public int getHifiquality() {
         return hifiquality;
     }

    public void setAlbumprivilege(int albumprivilege) {
         this.albumprivilege = albumprivilege;
     }
     public int getAlbumprivilege() {
         return albumprivilege;
     }

    public void setTopicurl(String topicurl) {
         this.topicurl = topicurl;
     }
     public String getTopicurl() {
         return topicurl;
     }

    public void setSuperfilehash(String superfilehash) {
         this.superfilehash = superfilehash;
     }
     public String getSuperfilehash() {
         return superfilehash;
     }

    public void setAsqprivilege(int asqprivilege) {
         this.asqprivilege = asqprivilege;
     }
     public int getAsqprivilege() {
         return asqprivilege;
     }

    public void setM4asize(int m4asize) {
         this.m4asize = m4asize;
     }
     public int getM4asize() {
         return m4asize;
     }

    public void setAlbumname(String albumname) {
         this.albumname = albumname;
     }
     public String getAlbumname() {
         return albumname;
     }

    public void setPrivilege(int privilege) {
         this.privilege = privilege;
     }
     public int getPrivilege() {
         return privilege;
     }

    public void setResbitrate(int resbitrate) {
         this.resbitrate = resbitrate;
     }
     public int getResbitrate() {
         return resbitrate;
     }

    public void setHqfailprocess(int hqfailprocess) {
         this.hqfailprocess = hqfailprocess;
     }
     public int getHqfailprocess() {
         return hqfailprocess;
     }

    public void setSqpaytype(int sqpaytype) {
         this.sqpaytype = sqpaytype;
     }
     public int getSqpaytype() {
         return sqpaytype;
     }

    public void setHqprice(int hqprice) {
         this.hqprice = hqprice;
     }
     public int getHqprice() {
         return hqprice;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setSourceid(int sourceid) {
         this.sourceid = sourceid;
     }
     public int getSourceid() {
         return sourceid;
     }

    public void setFilename(String filename) {
         this.filename = filename;
     }
     public String getFilename() {
         return filename;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setSuperfilesize(int superfilesize) {
         this.superfilesize = superfilesize;
     }
     public int getSuperfilesize() {
         return superfilesize;
     }

    public void setQualitylevel(int qualitylevel) {
         this.qualitylevel = qualitylevel;
     }
     public int getQualitylevel() {
         return qualitylevel;
     }

    public void setSqfilehash(String sqfilehash) {
         this.sqfilehash = sqfilehash;
     }
     public String getSqfilehash() {
         return sqfilehash;
     }

    public void setA320privilege(int a320privilege) {
         this.a320privilege = a320privilege;
     }
     public int getA320privilege() {
         return a320privilege;
     }

    public void setHqprivilege(int hqprivilege) {
         this.hqprivilege = hqprivilege;
     }
     public int getHqprivilege() {
         return hqprivilege;
     }

    public void setSuperbitrate(int superbitrate) {
         this.superbitrate = superbitrate;
     }
     public int getSuperbitrate() {
         return superbitrate;
     }

    public void setSuperduration(int superduration) {
         this.superduration = superduration;
     }
     public int getSuperduration() {
         return superduration;
     }

    public void setAlbumid(String albumid) {
         this.albumid = albumid;
     }
     public String getAlbumid() {
         return albumid;
     }

    public void setResfilehash(String resfilehash) {
         this.resfilehash = resfilehash;
     }
     public String getResfilehash() {
         return resfilehash;
     }

    public void setPublishage(int publishage) {
         this.publishage = publishage;
     }
     public int getPublishage() {
         return publishage;
     }

    public void setMixsongid(String mixsongid) {
         this.mixsongid = mixsongid;
     }
     public String getMixsongid() {
         return mixsongid;
     }

    public void setHqfilehash(String hqfilehash) {
         this.hqfilehash = hqfilehash;
     }
     public String getHqfilehash() {
         return hqfilehash;
     }

    public void setSuperextname(String superextname) {
         this.superextname = superextname;
     }
     public String getSuperextname() {
         return superextname;
     }

    public void setHqpaytype(int hqpaytype) {
         this.hqpaytype = hqpaytype;
     }
     public int getHqpaytype() {
         return hqpaytype;
     }

    public void setPaytype(int paytype) {
         this.paytype = paytype;
     }
     public int getPaytype() {
         return paytype;
     }

    public void setAccompany(int accompany) {
         this.accompany = accompany;
     }
     public int getAccompany() {
         return accompany;
     }

    public void setSqextname(String sqextname) {
         this.sqextname = sqextname;
     }
     public String getSqextname() {
         return sqextname;
     }

    public void setPkgprice(int pkgprice) {
         this.pkgprice = pkgprice;
     }
     public int getPkgprice() {
         return pkgprice;
     }

    public void setHqfilesize(int hqfilesize) {
         this.hqfilesize = hqfilesize;
     }
     public int getHqfilesize() {
         return hqfilesize;
     }

    public void setFilesize(int filesize) {
         this.filesize = filesize;
     }
     public int getFilesize() {
         return filesize;
     }

    public void setPublish(int publish) {
         this.publish = publish;
     }
     public int getPublish() {
         return publish;
     }

    public void setAudiocdn(int audiocdn) {
         this.audiocdn = audiocdn;
     }
     public int getAudiocdn() {
         return audiocdn;
     }

    public void setSqprice(int sqprice) {
         this.sqprice = sqprice;
     }
     public int getSqprice() {
         return sqprice;
     }

    public void setResduration(int resduration) {
         this.resduration = resduration;
     }
     public int getResduration() {
         return resduration;
     }

    public void setOldcpy(int oldcpy) {
         this.oldcpy = oldcpy;
     }
     public int getOldcpy() {
         return oldcpy;
     }

    public void setPrice(int price) {
         this.price = price;
     }
     public int getPrice() {
         return price;
     }

    public void setHqpkgprice(int hqpkgprice) {
         this.hqpkgprice = hqpkgprice;
     }
     public int getHqpkgprice() {
         return hqpkgprice;
     }

    public void setSingername(String singername) {
         this.singername = singername;
     }
     public String getSingername() {
         return singername;
     }

    public void setSqprivilege(int sqprivilege) {
         this.sqprivilege = sqprivilege;
     }
     public int getSqprivilege() {
         return sqprivilege;
     }

    public void setMvhash(String mvhash) {
         this.mvhash = mvhash;
     }
     public String getMvhash() {
         return mvhash;
     }

    public void setSqpkgprice(int sqpkgprice) {
         this.sqpkgprice = sqpkgprice;
     }
     public int getSqpkgprice() {
         return sqpkgprice;
     }

    public void setHqduration(int hqduration) {
         this.hqduration = hqduration;
     }
     public int getHqduration() {
         return hqduration;
     }

    public void setOthername(String othername) {
         this.othername = othername;
     }
     public String getOthername() {
         return othername;
     }

    public void setHasalbum(int hasalbum) {
         this.hasalbum = hasalbum;
     }
     public int getHasalbum() {
         return hasalbum;
     }

    public void setMvtotal(int mvtotal) {
         this.mvtotal = mvtotal;
     }
     public int getMvtotal() {
         return mvtotal;
     }

    public void setFilehash(String filehash) {
         this.filehash = filehash;
     }
     public String getFilehash() {
         return filehash;
     }

}