package practical;

import java.io.FileInputStream;

public class FileWithChar {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("C:\\Users\\CGLenovo\\Desktop\\file.txt");
			int i = f.read();
			System.out.print((char)i);

			f.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}