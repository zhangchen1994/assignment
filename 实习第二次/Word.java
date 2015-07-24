package shizxitest;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Word {
	public static void main(String[] args)throws IOException{
		FileReader txt=new FileReader("D:\\src.txt");
		BufferedReader br = new BufferedReader(txt);
		String s="";
		String s1="";
		while(true){
			s = br.readLine();
			if (s == null){
				break;
			}
			s1+=s;
		}
		getword(s1);
	}

	private static void getword(String s) {
		String regex = "[A-Za-z0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		ArrayList<String>word=new ArrayList<String>();
		while(m.find()){
			word.add(m.group(0));
		}
		wordweight(word);
	}

	private static void wordweight(ArrayList<String> word) {
		ArrayList<Integer>times=new ArrayList<Integer>();
		int[] weight=new int[word.size()];
		String[] wordwh=new String[10];
		String w[]={"am", "is","are","was","been","has","have","had","a","an","the","in","at","on","to","or"};
		for(int i=0;i<word.size();i++){
			int num=0;
			for(String s:word){
				if(word.get(i).equals(s)){
					num++;
				}
			}
			times.add(num);
		}
		for(int i=0;i<word.size();i++){
			int flag=0;
			for(String s2:w){
				if(word.get(i).equals(s2)){
					flag=1;
					weight[i]=(int) (times.get(i)*0.2);
					break;
				}	
			}
			if(flag==0)
				weight[i]=times.get(i)*1;
		}
		String[] word2=new String[word.size()];
		int k=0;
		for(String s:word){
			word2[k]=s;
			k++;
		}
		for(int i=weight.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(weight[j]<weight[j+1]){
					int t=weight[j];
					weight[j]=weight[j+1];
					weight[j+1]=t;
					String s=word2[j];
					word2[j]=word2[j+1];
					word2[j+1]=s;
				}
			}
		}	
		 for(String t:word2){
				System.out.println(t);
			}
		int l=0;
		int num=1;
		for(int i=0;i<10;i++){
			wordwh[i]=word2[l];
			for(int j=l;l<word2.length;){
				num++;
				if(!wordwh[i].equals(word2[num])){
					l=num;
					break;
				}
			}
		}
		for(String s:wordwh){
			System.out.println(s);
		}
	}
}
