package com.forloop;
// inside the for loop conditional part is optional if we are not providing condition at the time of 
// compilation compile will provide true value.
public class G {
	public static void main(String[] args) {
		for (int i = 0;; i++) {
			System.out.println("inside the for loop conditional part is optional");// infinite loop
			if(i==5){
				System.out.println("********************");
				break;
			}
		}
	}
}
