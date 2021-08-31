package serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {
	int i;
	double j;
}

public class SLN01 {
	public static void main(String[] args) throws IOException {
		A a1 = new A();
		a1.i = 10;
		a1.j = 10.9;
		FileOutputStream fout = new FileOutputStream("test.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.flush();
		out.close();
		System.out.println("Wrote into file");
	}
}
