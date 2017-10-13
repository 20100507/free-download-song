package org.bianqi.song.music.wangyi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.junit.Test;

public class Song163Test {

	/**
	 * 测试加密后的效果
	 * <p>Title: test1</p>
	 * <p>Description: </p>
	 * @throws IOException
	 */
	@Test
	public void test1() throws IOException {

		Response execute = Jsoup.connect("http://music.163.com/weapi/song/enhance/player/url")
				.data("params",
						"PlHy5KI91AZHt/PETM5ZSgdvFgtf3n/9tWiEfY2EklW7UfJuGZEmvbRpVzu93E2s/jMOLT/Ck6J8t9XqceeJbnxmGMqOT1sAuM/XkzumvqhpSe4YAl7vrBHNug2e0Brk9Zqe3duuLkL8D6PlIZ/vB91YvXN1LXgfwrqzfG7LLOVk+R+KClWGx1Mvo9fPrp5A")
				.data("encSecKey",
						"00c72108ead2c4ccccc60fac525e8f27037bb029adc9bff796f02f2543615d12f65ea6c4bfb95b8fa664517d9be5c9ddbbe551d767de461892e29a68ddec4d138ae459d31272fa2af334c57435dbbe55a976c5a70d1756c96fdb5e1d992bee6a3555758ebbd3ba7dfbbab9832f73825764410fa79936c98d682f068281bd8dc0")
				.method(Method.POST).execute();
		String string = execute.body().toString();
		System.out.println(string);
	}

	/**
	 * 测试解析 URL 
	 * <p>Title: test2</p>
	 * <p>Description: </p>
	 * @throws IOException
	 */
	@Test
	public void test2() throws IOException {
		String params = "";
		String encSecKey = "";
		String req_str = "{\"ids\":\"["+65528+"]\",\"br\":128000,\"csrf_token\":\"\"};"; 
		HashMap<String, String> datas = JS163Secret.getDatas(req_str);
		Set<Entry<String, String>> entrySet = datas.entrySet();
		for (Entry<String, String> entry : entrySet) {
			if(entry.getKey().equals("encSecKey")){
				encSecKey = entry.getValue();
			}
			if(entry.getKey().equals("params")){
				params = entry.getValue();
			}
		}
		Response execute = Jsoup.connect("http://music.163.com/weapi/song/enhance/player/url")
				.data("params",params)
				.data("encSecKey",encSecKey)
				.method(Method.POST).execute();
		String string = execute.body().toString();
		System.out.println(string);
	}
	
	
	/**
	 * 测试加密
	 * <p>Title: test3</p>
	 * <p>Description: </p>
	 * @throws IOException
	 */
	@Test
	public void test3() throws IOException {
		Response execute = Jsoup.connect("http://music.163.com/weapi/song/enhance/player/url")
				.data("params",
						"TrKC7iZRL5MmLyh70c2Avmk665IkqwFtLeyV4sQHOlDDOA9NcjGS7W3W66HhNxvGVpcy0yOkXF5CqOjL599U3BHZmybARJz7XXmhnrKcmS4y3KYtmfRaplwG7b3+Xlgq")
				.data("encSecKey",
						"dc1707d771b62f6425de2705ee89d174880e226c57fb41c490c280e5a1258445a1f0feeaa1d42f56101efb1f24528181a773ee474dc574a956b0c7086d7b3a508cc4bfe8d5dba6b63b58656bb846920a2f8a18faee6f4f0820fb7312498724d3e3f6b0762f4f1c8465f31f155574743c409c793311e6a9cb6e847d7fb2365025")
				.method(Method.POST).execute();
		String string = execute.body().toString();
		System.out.println(string);
	}
	
	/**
	 * 测试下载MV
	 * <p>Title: test4</p>
	 * <p>Description: </p>
	 * @throws IOException
	 */
	@Test
	public void test4() throws IOException {
		Response execute = Jsoup.connect("http://music.163.com/mv?id=482078").execute();
		String string = execute.body().toString();
		System.out.println(string);
	}
	
}







