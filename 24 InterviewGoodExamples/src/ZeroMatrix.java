import java.util.Scanner;
//https://www.javatpoint.com/set-matrix-zeros-in-java
public class ZeroMatrix {
	public static void main(String[] args) {
		int r,c;
		r=3;c=3;
		int [][] arr = new int[r][c];
		Scanner scanner = new Scanner(System.in);
		
		int x =10;
		System.out.println("Please Enter the ::" + r * c + " Elements");
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				//int x = scanner.nextInt();
				arr[i][j]=x;
				x++;
			}
		}
		arr[2][2]=0;
		
		System.out.println("Given arrays are ::");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		//logic
		int m = 0 ;
		int n = 0;
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(arr[i][j]==0) {
					m=i;
					n=j;
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println("m=:" + m + "---n:::" + n);

		System.out.println("Given arrays are ::");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
	}
}
