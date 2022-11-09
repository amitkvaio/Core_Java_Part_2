package amitsimplyfiedtutorial.com.Hstream;

import java.util.ArrayList;

// To collect only even numbers from the array list  - without using stream.
public class B {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}
		
		ArrayList<Integer> evenArrayList = new ArrayList<>();
		ArrayList<Integer> oddArrayList = new ArrayList<>();
		for (Integer integer : list) {
			if(integer%2==0) {
				evenArrayList.add(integer);
			}else {
				oddArrayList.add(integer);
			}
		}
		System.out.println("List of Even Number is : "+evenArrayList);
		System.out.println("List of Odd Number is   :"+oddArrayList);
	}
}


/*

num % 1   =  0
num % 2   =  0, 1
num % 3   =  0, 1, 2
num % 4   =  0, 1, 2 ,3
num % 5   =  0,1,2,3,4

num % n   = 0,1,2,3,4...(n-1)


*/