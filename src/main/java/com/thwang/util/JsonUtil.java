package com.thwang.util;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtil {
  public void main(String[] args) {
    JSONObject json=new JSONObject();
    json.put("aa","aa");
    JSONArray jsonArray=new JSONArray();
    jsonArray.put(json);
  }
}
