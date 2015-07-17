import java.util.*;
public class Char2 {
	public static String test(String m){
		int[] ch=new int[100];
		String[] ch1=new String[100];
		int n=1;
		int max=0;
		int j=0;
		String ch2="";
		String ch3="";
		for(int i=0;i<m.length();i++){
			if(i!=m.length()-1){
				if(m.charAt(i)==m.charAt(i+1)){
					n++;			
				}else{
					ch[j]=n;
					ch1[j]=String.valueOf(m.charAt(i));
					j++;
					n=1;
				}
			}else{
				ch[j]=n;
				ch1[j]=String.valueOf(m.charAt(i));
				j++;
				n=1;
			}
		}
		for(int i=0;i<100;i++){
			if(max<ch[i]){
				max=ch[i];
				ch2=ch1[i];
			}
		}
		for(int i=0;i<max;i++){
			ch3+=ch2;
		}
		return ch3;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String ch;
		ArrayList<String>ch1=new ArrayList<String>();
		ArrayList<String>ch2=new ArrayList<String>();
		String ch3="";
		int max=0;
		System.out.println("请输入多个字符串，以-1结束");
		do{
			ch=in.next();
			if(!ch.equals("-1")){
				ch1.add(test(ch));
			}
		}while(!ch.equals("-1"));
		for(int i=0;i<ch1.size();i++){
			if(ch3.length()<ch1.get(i).length())
				ch3=ch1.get(i);
		}
		for(int i=0;i<ch1.size();i++){
				if(ch1.get(i).length()==ch3.length()){
					ch2.add(ch1.get(i));
			}
		}
		for(int i=0;i<ch2.size();i++){
			int num=(int)ch2.get(i).charAt(0);
			max=(int)ch2.get(0).charAt(0);
			if(max>num){
				max=num;
				ch3=ch2.get(i);
			}
		}
		System.out.println(ch3);
	}
}
