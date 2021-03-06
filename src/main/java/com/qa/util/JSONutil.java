package com.qa.util;

import com.google.gson.Gson;

public class JSONutil {
	private static Gson gson;
	
	public JSONutil() {
		JSONutil.gson = new Gson();
	}

	public static String getJSONForObject(Object obj) {
		return gson.toJson(obj);
	}
	
	public static <T> String getObjectForJSON2(String jsonString, Class<T> clazz) {
		return (String) gson.fromJson(jsonString, clazz);
	}
	
	public static <T> T getObjectForJSON(String jsonString, Class<T> clazz) {
		return gson.fromJson(jsonString, clazz);
	}
}
