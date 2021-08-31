package serialization;
import java.io.*;

class B implements Serializable {
	int i;
	String s1;
	Boolean flag;

	B(int i, String s1, Boolean flag) {
		this.i = i;
		this.s1 = s1;
		this.flag = flag;
	}
	@Override
	public String toString() {
		return i + "," + s1 + "," + flag;
	}
}

public class SLN03 {
	public static void main(String[] args) throws Exception {
		SerializationDemo();
	}
	public static void SerializationDemo() throws Exception {
		B b1 = new B(10, "abc", true);
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		try {
			fout = new FileOutputStream("test1.txt");
			out = new ObjectOutputStream(fout);
			out.writeObject(b1);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.flush();
					out.close();
					out = null;
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			try {
				if (fout != null) {
					fout.close();
					fout = null;
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Wrote into file");
	}
}
