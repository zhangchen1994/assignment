import java.util.*;
public class Char2 {
	public static String test(String m){
		ArrayList<Integer>ch=new ArrayList<Integer>();
		ArrayList<String>ch1=new ArrayList<String>();
		ArrayList<String>ch4=new ArrayList<String>();
		int n=1;
		int max=0;
		int max1=0;
		int j=0;
		String ch2="";
		String ch3="";
		for(int i=0;i<m.length();i++){
			if(i!=m.length()-1){
				if(m.charAt(i)==m.charAt(i+1)){
					n++;			
				}else{
					ch.add(n);
					ch1.add(String.valueOf(m.charAt(i)));
					j++;
					n=1;
				}
			}else{
				ch.add(n);
				ch1.add(String.valueOf(m.charAt(i)));
				j++;
				n=1;
			}
		}
		for(int i=0;i<ch.size();i++){
			if(max<ch.get(i)){
				max=ch.get(i);
				ch2=ch1.get(i);
			}
		}
		j=0;
		for(int i=0;i<ch.size();i++){
			if(max==ch.get(i)){
				ch4.add(ch1.get(i));
			}
		}
		for(int i=0;i<ch4.size();i++){
			int num=(int)ch4.get(i).charAt(0);
			max1=(int)ch4.get(0).charAt(0);
			if(max1>num){
				max1=num;
				ch2=ch4.get(i);
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
