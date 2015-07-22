import java.util.ArrayList;

public class MyString {
	private char[] ch;

	public MyString(String str){
		this.ch=str.toCharArray();
	}
	public String toValue(){
		String s="";
		for(char c:ch){
			s+=c;
		}
		return s;
	}
	public int length(){
		int i=0;
		for(char c:ch){
			i++;
		}
		return i;
	}
	public void reverse(){
		char[] a=new char[this.length()];
		int i=0;
		for(int j=this.length()-1;j>=0;j--){
			a[i]=this.ch[j];
			i++;
		}
		this.ch=a;
	}
	public void concat(MyString str){
		String s;
		s=this.toValue()+str.toValue();
		this.ch=s.toCharArray();
	}
	public void lower(){
		for(int i=0;i<this.length();i++){
			if((int)this.ch[i]>=65&&(int)this.ch[i]<=90){
				this.ch[i]+=32;
			}
		}
	}
	public void upper(){
		for(int i=0;i<this.length();i++){
			if((int)this.ch[i]>=97&&(int)this.ch[i]<=122){
				this.ch[i]-=32;
			}
		}
	}
}
