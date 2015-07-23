import java.util.ArrayList;
import java.util.Scanner;

class StringMatch{
	private String str;
	private char[] ch;
	public  StringMatch1(String str){
		this.str=str;
	} 
	public int numberOfOccurence(char x){
		ch=str.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]==(x)){
				cnt++;
			} 
			else continue;
		}
		return cnt;
	}

	private static String isSame(String s) {
		char a = s.charAt(0);
		for(char c : s.toCharArray()){
			if (a != c)
				return null;
		}
		return s;
	}
	public String getMaxSubStr(int len){
		ch=str.toCharArray();
		ArrayList<String>arr=new ArrayList<String>();
		ArrayList<Integer> ch1=new ArrayList<Integer>();
		String ch2=null;
		for(int i=0;i<ch.length;i++){
			String s="";
			for(int j=i;j<i+len;j++){
				if(i+len<=ch.length)
					s+=ch[j];
			}
			if(s.equals("")){
				continue;
			}
			if(isSame(s)!=null){
				arr.add(s);
			}
		}
		for(int i=0;i<arr.size();i++){
			int num=0;
			for(String s:arr){
				if(arr.get(i).equals(s)){
					num++;
				}	
			}
			ch1.add(num);
		}
		Integer max=0;
		ch2=arr.get(0);
		for(int i=0;i<ch1.size();i++){
			if(max<ch1.get(i)){
				max=ch1.get(i);
				ch2=arr.get(i);
			}else if(max==ch1.get(i)){
				if(ch2.charAt(0)>arr.get(i).charAt(0))
					ch2=arr.get(i);		
			}
		}
		return ch2;
	}
}
public class StringMatch1{
	public static void main(String[] args){
		StringMatch1 m=new StringMatch1("aabbabbbabb");
		System.out.println(m.numberOfOccurence('a'));
		System.out.println(m.getMaxSubStr(2));
		
	}

}
