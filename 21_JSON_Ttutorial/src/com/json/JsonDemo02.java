package com.json;

import java.io.StringWriter;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonDemo02 {
	public static void main(String[] args)throws JSONException {
		 JSONObject obj = new JSONObject();

	      obj.put("name","foo");
	      obj.put("num",new Integer(100));
	      obj.put("balance",new Double(1000.21));
	      obj.put("is_vip",new Boolean(true));

	      StringWriter out = new StringWriter();
	      obj.write(out);
	      
	      String jsonText = out.toString();
	      System.out.print(jsonText);
	}
}
