package org.bianqi.song.music.baidu;

import org.jsoup.Jsoup;


import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.junit.Test;

public class SongBaiduTest {
	
	@Test
	public void test3() throws Exception{
		Response execute = Jsoup
				.connect("http://music.baidu.com/search?key=%E8%88%8D%E4%B8%8D%E5%BE%97")
				.method(Method.GET).ignoreContentType(true).execute();
		System.out.println(execute.body().toString());
	}
	
	
	@Test
	public void test2() throws Exception{
		Response execute = Jsoup
				.connect("http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.song.play&format=jsonp&songid=704086")
				.method(Method.GET).ignoreContentType(true).execute();
		System.out.println(execute.body().toString());
	}
	
	
	@Test
	public void test1() throws Exception{
		Response execute = Jsoup
				.connect("http://yinyueshiting.baidu.com/data2/music/2aa0aa17ae0407aba70c842158019868/555872668/555872668.mp3?xcode=97ea82ad53a5089537ff48ca31f559c2")
				.method(Method.GET).ignoreContentType(true).execute();
		System.out.println(execute.body().toString());
	}
}
