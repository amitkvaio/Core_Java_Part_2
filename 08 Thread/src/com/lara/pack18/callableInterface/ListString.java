package com.lara.pack18.callableInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ListString implements Callable<List<String>> {
	
	@Override
	public List<String> call() throws Exception {
		ArrayList<String> list = new ArrayList<>();
		list.add("amit");
		list.add("Babu");
		list.add("khushboo");
		list.add("sagar");
		return list;
	}
}
