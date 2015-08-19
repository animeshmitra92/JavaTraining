package day5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class CopyFile {
	public static void  main(String args[])
	{
		File file1=new File("C:/Users/admin/Desktop/file1.txt");
		File file2=new File("C:/Users/admin/Desktop/file2.txt");
		InputStream inputs=null;
		OutputStream outputs=null;
		try
		{
			inputs=new FileInputStream(file1);
			outputs=new FileOutputStream(file2);
			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = inputs.read(buffer)) > 0) {
				outputs.write(buffer, 0, bytesRead);
		}}
			catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
		}
		finally {
			try {

				inputs.close();
				outputs.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

}
}


}
