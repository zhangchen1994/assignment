import java.util.*;
public class Post {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("��������������");
		String post=in.next();
		if(test(post))
			System.out.println("�ʱ�Ϸ�");
		else
			System.out.println("�ʱ಻�Ϸ�");
	}

	private static boolean test(String post) {
		String regex="[0-9]{6}";
		return post.matches(regex);
	}
}