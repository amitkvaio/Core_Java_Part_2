package com.lara.app2;

class G extends Thread {

}

public class Manager5 {
	public static void main(String[] args) {
		G g1 = new G();
		G g2 = new G();
		System.out.println(g1.getId());// getting the id of the child thread
		System.out.println(g2.getId());
	}
}
