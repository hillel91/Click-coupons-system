package tirgol_for_test_2;
//image.toTxt;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\hbpe9\\Desktop\\JAVA\\Felix\\toTxt\\car.txt");
			int i=0;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
