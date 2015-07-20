import java.util.Scanner;
public class Name {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个英文名");
		String name=in.nextLine();
		if(test(name))
			System.out.println("是合法的英文名");
		else
			System.out.println("不是一个合法的英文名");
	}

	private static boolean test(String name) {
		String regex="[A-Z][a-z]*\\s+[A-Z][a-z]*";
		String regex1="[A-Z][a-z]*\\s+[A-Z][a-z]*\\s+[A-Z][a-z]*";
		return name.matches(regex)||name.matches(regex1);
	}
}
