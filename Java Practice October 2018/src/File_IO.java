import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Reading Input file
public class File_IO{
	public static void main(String[] args) throws IOException {
		String Final_Output = null;
		FileInputStream fil = new FileInputStream("D:\\Learning\\JAVA\\Code\\Java Practice October 2018\\src\\File_IO.txt");
		
		while(fil.available()>0) {
			System.out.println(fil.available());
			Final_Output += (char)fil.read();
		}
		System.out.println(Final_Output);
		System.out.println(fil.available());
<<<<<<< HEAD
		fil.close();
=======
>>>>>>> a45c3d0da3caf1d4278cc9ad23a54fca350c4137
	}

}
