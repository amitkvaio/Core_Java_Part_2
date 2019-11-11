//Each thread having a unique id through which it can be identified
package com.lara.app1;
class ThreadIdies extends Thread{
	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname+ " --> "+ this.getId());
	}
}

public class ThreadId {
	/*public static void main(String[] args) {
		for (int i = 1; i <= 100000; i++) {
			ThreadIdies tidies = new ThreadIdies();
			tidies.start();
		}
		System.out.println("Done");
	}*/
	
	public static void main(String[] args) 
    { 
        // the line below this gives an output 
        // \u000d System.out.println("comment executed"); 
    }

}
