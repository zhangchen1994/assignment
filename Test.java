package test;
import man.CanMarry;
import java.util.*;
public class Test {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你的姓名");
		String name=in.next();
		System.out.println("请输入你的年龄");
		int age=in.nextInt();
		System.out.println("请输入你的性别M为男性，F为女性");
		String sex=in.next();
		System.out.println("请输入你的身高");
		int height=in.nextInt();
		CanMarry per=new CanMarry(name,sex,age,height);
		System.out.println("姓名"+per.getName());
		System.out.println("年龄"+per.getAge());
		System.out.println("性别"+per.getSex());
		System.out.println("身高"+per.getHeight());
		if(per.can()){
			System.out.println("您能结婚！");
		}else
			System.out.println("您不能结婚！");
	}
}
