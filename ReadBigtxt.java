import java.io.*;
public class ReadBigtxt {
	public static void main(String[] args)throws IOException{
		File txt=new File("C:\\Users\\³¿\\javacourse\\intern\\x.txt");
		InputStream is=new FileInputStream(txt);
		int ch=0;
		while((ch=is.read())!=-1){
			System.out.print((char)ch);
		}
	}
}
