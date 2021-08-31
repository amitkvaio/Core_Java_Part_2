class Prac01 {
	enum PP {
		A, B, C, D, E, F, G, H, I, J, K;
	}

	public static void main(String[] args) {
		PP[] p = PP.values();
		for (PP r : p) {
			System.out.println(r);
		}
	}
}
