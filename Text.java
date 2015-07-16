import java.io.*;
import java.util.*;
class CreatText {
	public  void creat()throws IOException{
		File txt=new File("D:\\x.java");
		boolean issucc=txt.createNewFile();
		if(issucc){
			System.out.println("文件创建成功");
		}
		else
			System.out.println("文件创建失败");
	}
}
class WriteText {
	public  void write()throws IOException{
		File txt=new File("D:\\x.java");
		Scanner in=new Scanner(System.in);
		OutputStream os=new FileOutputStream(txt);
		System.out.println("请输入要写的文本");
		String cont=in.next();
		for(int i=0;i<cont.length();i++){
			char x=cont.charAt(i);
			os.write(x);
		}
		os.close();
		System.out.println("已经写入成功");
	}
}
class ReadText {
	public  void read()throws IOException{
		File txt=new File("D:\\x.java");
		InputStream is=new FileInputStream(txt);
		int ch=0;
		while((ch=is.read())!=-1){
			System.out.print((char)ch);
		}
	}
}
class DelText {
	public  void del(){
		File file=new File("D:\\x.java");
		boolean issucc=file.delete();
		if(issucc){
			System.out.println("文件已经删除");
		}
		else
			System.out.println("文件不存在！");
	}
}
public class Text {
	public static void main(String[] args)throws IOException{
		Scanner in=new Scanner(System.in);
		CreatText txt=new CreatText();
		WriteText txt2=new WriteText();
		ReadText txt3=new ReadText();
		DelText txt4=new DelText();
		System.out.println("请输入你要执行的功能。1,创建。2，写入。3，读取。4，删除。");
		int S=in.nextInt();
			switch(S){
			case 1:txt.creat();break;
			case 2:txt2.write();break;
			case 3:txt3.read();break;
			case 4:txt4.del();break;
		}
	}
}
