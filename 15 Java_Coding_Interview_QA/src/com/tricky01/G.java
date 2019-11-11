package com.tricky01;

public class G {
	public static void main(String[] args) {
		Thread th = new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("AIC:"+i);
			}
		});
		th.start();
	}
}
