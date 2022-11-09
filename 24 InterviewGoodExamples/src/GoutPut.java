
class AA {
	int i = 10;
}

class BB extends AA {
	int i = 20;
}

public class GoutPut {
	public static void main(String[] args) {
		AA a = new BB();
		System.out.println(a.i);
	}
}
