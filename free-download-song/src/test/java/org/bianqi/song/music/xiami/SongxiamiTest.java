package org.bianqi.song.music.xiami;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.junit.Test;

public class SongxiamiTest {
	
	/**
	 * 搜索歌曲
	 * <p>Title: test1</p>
	 * <p>Description: </p>
	 * @throws IOException
	 */
	@Test
	public void test1() throws IOException {
		Response execute = Jsoup.connect("http://www.xiami.com/search?key=%E7%89%B9%E5%88%AB%E7%9A%84%E4%BA%BA")
				.ignoreContentType(true).execute();
		String string = execute.body().toString();
		System.out.println(string);
	}
	
	/**
	 * 针对某一首歌 返回JSON 数据 JSON 数据中就有我们想要的 location 地址
	 * <p>Title: test2</p>
	 * <p>Description: </p>
	 * @throws IOException 
	 */
	@Test
	public void test2() throws IOException{
		Response execute = Jsoup.connect("http://www.xiami.com/song/playlist/id/148274")
				.ignoreContentType(true).execute();
		String string = execute.body().toString();
		System.out.println(string);
	}
	
	
	
}





