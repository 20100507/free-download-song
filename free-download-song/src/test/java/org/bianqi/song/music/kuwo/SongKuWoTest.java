package org.bianqi.song.music.kuwo;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.junit.Test;

/**
 * 酷我
 * <p>Title: SongKuWoTest</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月13日下午8:03:40
 * @version 1.0.0
 */
public class SongKuWoTest {

	// 酷我最简单 rid = MUSIC_ + 歌曲的路径
	@Test
	public void test1() throws Exception{
		Response execute = Jsoup
				.connect("http://antiserver.kuwo.cn/anti.s?format=aac|mp3&rid=MUSIC_7149583&type=convert_url&response=res")
				.method(Method.GET).ignoreContentType(true).execute();
		System.out.println(execute.body().toString());
	}
	
	
	//搜索
	@Test
	public void test2() throws Exception{
		Response execute = Jsoup
				.connect("http://sou.kuwo.cn/ws/NSearch?key=%E6%88%91%E4%BB%AC%E7%9A%84%E7%88%B1")
				.method(Method.GET).ignoreContentType(true).execute();
		System.out.println(execute.body().toString());
	}
	
	//MV 真实地址
	@Test
	public void test3() throws Exception{
		Response execute = Jsoup
				.connect("http://www.kuwo.cn/yy/st/mvurl?rid=MUSIC_27489050")
				.method(Method.GET).ignoreContentType(true).execute();
		System.out.println(execute.body().toString());
	}
	
	
	
}





