package practical;

import java.io.FileInputStream;

public class FileWithMoreLines {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("C:\\Users\\CGLenovo\\Desktop\\file.txt");
			int i;
			while ((i = f.read()) !=-1) {
				System.out.print((char)i);
			}
			f.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
