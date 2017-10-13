package org.bianqi.song.music.wangyi;

import java.io.FileReader;
import java.util.HashMap;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

public class JS163Secret {
	private static Invocable inv;
	public static final String encText = "encText";
	public static final String encSecKey = "encSecKey";

	static {
		try {
			String path = JS163Secret.class.getClassLoader().getResource("163core.js").getPath();
			FileReader fr = new FileReader(path);
			ScriptEngineManager sem = new ScriptEngineManager();
			ScriptEngine engine = sem.getEngineByName("js");
			engine.eval(fr);
			inv = (Invocable) engine;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ScriptObjectMirror get_params(String paras) throws Exception {
		ScriptObjectMirror so = (ScriptObjectMirror) inv.invokeFunction("myFunc", paras);
		return so;
	}

	public static HashMap<String, String> getDatas(String paras) {
		try {
			ScriptObjectMirror so = (ScriptObjectMirror) inv.invokeFunction("myFunc", paras);
			HashMap<String, String> datas = new HashMap<>();
			datas.put("params", so.get(JS163Secret.encText).toString());
			datas.put("encSecKey", so.get(JS163Secret.encSecKey).toString());
			return datas;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
