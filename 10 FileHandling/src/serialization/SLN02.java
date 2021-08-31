package serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class A1 implements Serializable {
	int i;
	double j;
}

public class SLN02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("test.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		A1 a1 = (A1) in.readObject();
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println("done");
	}
}
