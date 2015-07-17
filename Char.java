import java.util.*;
public class Char {
	public static String test(ArrayList<String>arr){
		int[][] cont=new int[100][100];
		String[] ch=new String[100];
		int k=0;
		int cont1=0;
		String ch1="NO";
		String ch2=" ";
		for(int i=0;i<arr.size();i++){
			for(int j=0;j<arr.get(i).length();j++){
				if(String.valueOf(arr.get(i).charAt(j)).equals(String.valueOf(arr.get(i).charAt(j)))){
					cont[i][k]++;
					ch[i]=String.valueOf(arr.get(i).charAt(j));
				}else
					k++;
			}
		}
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
				if(cont1<cont[i][j]){
					cont1=cont[i][j];
					ch1=ch[i];
				}
			}
		}
		//for(int i=0;i<=cont1;i++){
			//ch2+=ch1;
		//}
		return ch1;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String ch="-1";
		String ch2;
		String n="0";
		ArrayList<String>arr=new ArrayList<String>();
		System.out.println("输入若干个字符串，输入-1结束");
		while(!n.equals("-1")){
			ch=in.next();
			if(!ch.endsWith("-1"))
			arr.add(in.next());
			else
				n="-1";
		}
		ch2=test(arr);
		System.out.println(ch2);
	}
}
