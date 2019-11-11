
public class SplitTest {
	public static void main(String[] args) {
		/*String st = "com.spring,com.sp.java,com.lara,com.bang.btm.lara";
		String[] arg = st.split(",");
		for (String str : arg) {
			System.out.println(str);
		}*/
		Integer ar[] = new Integer[100];
		ar[0] = 1;
		ar[1] = 5;
		ar[2] = 0;
		ar[3] = 15;
		ar[4] = 0;
		ar[5] = 30;
		ar[6] = 90;
		ar[7] = 0;
		for (int i = 0; i < 8; i++) {
			try {
				System.out.println("ar[" + i + "]->" + ar[i]);
				int result = 90/ar[i];
				
				for (int j = 0; j < 10; j++) {
					try {
						System.out.println("2nd for loop->" + result / j);
					} catch (ArithmeticException e) {
						e.printStackTrace();
					}
				}
				System.out.println("#####################");
			} catch (ArithmeticException e) {
				System.out.println("@@@@@@@@@->"+e.getMessage());
			}
		}
		 
	}
	
	
}
