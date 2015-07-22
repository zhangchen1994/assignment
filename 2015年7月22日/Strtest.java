import java.util.*;
public class Strtest {
	public static void main(String[] args){
		MyString str=new MyString("ABC");
		str.length();
		System.out.println(str.length());
		str.reverse();
		System.out.println(str.toValue());
		MyString x=new MyString("xyz");
		x.concat(str);
		System.out.println(x.toValue());
		str.lower();
		System.out.println(str.toValue());
		x.upper();
		System.out.println(x.toValue());
	}
}
