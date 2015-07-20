package homework;
import java.util.*;
public class Email {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入Email地址");
		String s=in.nextLine();
		if(test(s))
			System.out.println("是合法的地址");
		else
			System.out.println("不是一个合法的地址");
	}
	private static boolean test(String s) {
		String regex="[0-9a-zA-Z]+([\\.][0-9a-zA-Z]+)*@[0-9a-zA-Z]+([\\.][0-9a-zA-Z]+)+";
		return s.matches(regex);
	}
}