package homework;
import java.util.*;
public class Email {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������Email��ַ");
		String s=in.nextLine();
		if(test(s))
			System.out.println("�ǺϷ��ĵ�ַ");
		else
			System.out.println("����һ���Ϸ��ĵ�ַ");
	}
	private static boolean test(String s) {
		String regex="[0-9a-zA-Z]+([\\.][0-9a-zA-Z]+)*@[0-9a-zA-Z]+([\\.][0-9a-zA-Z]+)+";
		return s.matches(regex);
	}
}