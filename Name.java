import java.util.Scanner;
public class Name {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������һ��Ӣ����");
		String name=in.nextLine();
		if(test(name))
			System.out.println("�ǺϷ���Ӣ����");
		else
			System.out.println("����һ���Ϸ���Ӣ����");
	}

	private static boolean test(String name) {
		String regex="[A-Z][a-z]*\\s+[A-Z][a-z]*";
		String regex1="[A-Z][a-z]*\\s+[A-Z][a-z]*\\s+[A-Z][a-z]*";
		return name.matches(regex)||name.matches(regex1);
	}
}
