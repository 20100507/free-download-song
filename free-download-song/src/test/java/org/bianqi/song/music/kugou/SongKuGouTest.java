package org.bianqi.song.music.kugou;

import java.io.IOException;
import java.util.List;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.junit.Test;

import com.besjon.kugou.search.pojo.JsonsRootBeanSearch;
import com.besjon.kugou.search.pojo.Lists;
import com.besjon.kugou.url.pojo.JsonRootBean;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * 
 * <p>Title: SongKuGouTest</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月12日下午10:06:09
 * @version 1.0.0
 */
public class SongKuGouTest {

	@Test
	public void test1() throws IOException {
		// 关键俩个参数
		//hash值
		//album_id
		Response execute = Jsoup
				.connect(
						"http://www.kugou.com/yy/index.php?r=play/getdata&hash=BA5CC223AAA56AABFCF44DFBE3119726&album_id=560215")
				.method(Method.GET).ignoreContentType(true).execute();
		ObjectMapper objectMapper = new ObjectMapper();
		JsonRootBean readValue = objectMapper.readValue(execute.body().getBytes(), JsonRootBean.class);
		String play_url = readValue.getData().getPlay_url();
		System.out.println(play_url);
	}
	
	/**
	 * 搜索 keyword 
	 * <p>Title: test2</p>
	 * <p>Description: </p>
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception{
		//关键参数 
		Response execute = Jsoup
				.connect(
						"http://songsearch.kugou.com/song_search_v2?keyword=%E4%BD%A0&page=1&pagesize=480&userid=-1&clientver=&platform=WebFilter&tag=em&filter=2&iscorrection=1&privilege_filter=0&_=1507818249480")
				.method(Method.GET).ignoreContentType(true).execute();
		System.out.println(execute.body());
		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS,true);
//		objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		JsonsRootBeanSearch readValue = objectMapper.readValue(execute.body().getBytes(), JsonsRootBeanSearch.class);
		List<Lists> lists = readValue.getData().getLists();
		for (Lists lists2 : lists) {
			String name = lists2.getSongname();
			String fileHash = lists2.getHqfilehash();
			String albumID = lists2.getAlbumid();
			System.out.println("歌名:"+name+"文件hash值："+fileHash+"专辑:"+albumID);
		}
	}
	
}




