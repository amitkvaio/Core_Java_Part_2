package com01.singleTon;

public class SingleTon03 {
	public static SingleTon03 st = null;
	private SingleTon03() {
		
	}
	public static SingleTon03 getInstance() {
		if(st==null) {
			st = new SingleTon03();
		}
		return st;
	}
}

/*

So, we will create an object on the first  call and then will return the same object on other 
successive calls

Note :  But this code will fail in a multi-threaded environment.
*/
