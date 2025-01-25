class M {
	enum En {
		C1, C2, C3, C4
	}

	public static void main(String[] args) {
		En e1 = M.En.C4;
		System.out.println(e1);
		En e2 = En.C3;
		System.out.println(e2);
	}
}
// we can use the enum inside the class also

/*
Since En is the enum inside the class M, meaning En beclome like the inner class of M.
enum M$En {
   C1,
   C2,
   C3, 
   C4;

   private M$En() {
   }
} 
 */

