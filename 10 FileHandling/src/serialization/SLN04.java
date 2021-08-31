package serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SLN04 {
	public static void main(String args[]) throws IOException {
		FileInputStream fin = null;
		ObjectInputStream in = null;
		try {
			fin = new FileInputStream("test1.txt");
			in = new ObjectInputStream(fin);
			B b1 = (B) in.readObject();
			System.out.println(b1);
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
					in = null;
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			try {
				if (fin != null) {
					fin.close();
					fin = null;
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
