import java.util.*;
public class Post {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入邮政编码");
		String post=in.next();
		if(test(post))
			System.out.println("邮编合法");
		else
			System.out.println("邮编不合法");
	}

	private static boolean test(String post) {
		String regex="[0-9]{6}";
		return post.matches(regex);
	}
}