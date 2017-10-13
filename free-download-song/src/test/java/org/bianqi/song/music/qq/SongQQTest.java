package org.bianqi.song.music.qq;

import java.io.IOException;
import java.util.Calendar;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.junit.Test;

import com.besjon.qq.pojo.Items;
import com.besjon.qq.pojo.JsonRootBean;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SongQQTest {

	@Test
	public void test1() throws Exception {
		String url = "https://y.qq.com/n/yqq/song/000YU69H3N55rZ.html";
		int lastIndexOf1 = url.lastIndexOf(".");
		int lastIndexOf2 = url.lastIndexOf("/") + 1;
		String songmid = url.substring(lastIndexOf2, lastIndexOf1);
		String filename = "C400" + songmid + ".m4a";
		long guid = (long)(Math.random() * 2147483647L) * (Calendar.getInstance().getTimeInMillis()) % 10000000000L;
		Response execute = Jsoup.connect("https://c.y.qq.com/base/fcgi-bin/fcg_music_express_mobile3.fcg?"
				+ "g_tk=5381&" + "jsonpCallback=MusicJsonCallback22739237633237863&" + "loginUin=0&" + "hostUin=0&"
				+ "format=json&" + "inCharset=utf8&" + "outCharset=utf-8&" + "notice=0&" + "platform=yqq&"
				+ "needNewCode=0&" + "cid=205361747&" + "callback=MusicJsonCallback22739237633237863&" + "uin=0&"
				+ "songmid=" + songmid + "&" + "filename=" + filename + "&" + "guid=" + guid).ignoreContentType(true)
				.execute();
		String string2 = execute.body().toString();
		string2 = string2.substring(35, string2.length());
		System.out.println(string2);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonRootBean readValue = objectMapper.readValue(string2.getBytes(), JsonRootBean.class);
		Items items = readValue.getData().getItems().get(0);
		String vkey = items.getVkey();
		Response execute2 = Jsoup
				.connect("http://dl.stream.qqmusic.qq.com/"+filename+"?vkey=" + vkey + "&guid=" + guid+"&uin=0&fromtag=66")
				.method(Method.GET).ignoreContentType(true).execute();
		System.out.println(execute2.body().toString());
	}

	@Test
	public void test2() throws IOException {
		// 关键俩个参数
		// 拿到 vkey
		Response execute = Jsoup
				.connect("https://c.y.qq.com/base/fcgi-bin/fcg_music_express_mobile3.fcg?" + "g_tk=5381&"
						+ "jsonpCallback=MusicJsonCallback22739237633237863&" + "loginUin=0&" + "hostUin=0&"
						+ "format=json&" + "inCharset=utf8&" + "outCharset=utf-8&" + "notice=0&" + "platform=yqq&"
						+ "needNewCode=0&" + "cid=205361747&" + "callback=MusicJsonCallback22739237633237863&"
						+ "uin=0&" + "songmid=002vO6Cl3PE0R5&" + "filename=C400000kXzBg1m4Q8w.m4a&" + "guid=2926675255")
				.ignoreContentType(true).execute();
		String string = execute.body().toString();
		System.out.println(string);
	}

	@Test
	public void test3() throws IOException {
		// 关键俩个参数
		// vkey
		// guid
		Response execute = Jsoup
				.connect(
						"http://dl.stream.qqmusic.qq.com/C400000kXzBg1m4Q8w.m4a?vkey=19767E497FD625779DF55F67D046B5CD8E16634708E9A23257D1FC983822594533E6058B7CF0219DAC66EE2CD5253179468718D169A8EAC0&guid=2926675255&uin=0&fromtag=66")
				.method(Method.GET).ignoreContentType(true).execute();
		System.out.println(execute.body().toString());
	}
}
