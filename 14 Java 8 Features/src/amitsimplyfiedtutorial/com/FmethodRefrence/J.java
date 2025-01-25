package amitsimplyfiedtutorial.com.FmethodRefrence;

import java.util.Arrays;
import java.util.List;

public class J {
	public static void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		List<String> stdList = Arrays.asList("Amit","Raja","Ajit","Bishnu");
		stdList.forEach((stdNames)->System.out.println(stdNames));
		System.out.println("**************************************");
		stdList.forEach(J::print); 
	} 
}
