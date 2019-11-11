package com.switchstmt;
// inside the switch independent statements are not allowed. if we are declaring the 
// statements that statements must be inside the case or default.
public class H {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
			//System.out.println("INDEPENDENT STATEMENTS");
		}
		System.out.println("INDEPENDENT STATEMENTS ARE NOT ALLOWED INSIDE THE SWITCH CASE");
	}
}
