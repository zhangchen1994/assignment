package test;
import man.CanMarry;
import java.util.*;
public class Test {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("�������������");
		String name=in.next();
		System.out.println("�������������");
		int age=in.nextInt();
		System.out.println("����������Ա�MΪ���ԣ�FΪŮ��");
		String sex=in.next();
		System.out.println("������������");
		int height=in.nextInt();
		CanMarry per=new CanMarry(name,sex,age,height);
		System.out.println("����"+per.getName());
		System.out.println("����"+per.getAge());
		System.out.println("�Ա�"+per.getSex());
		System.out.println("���"+per.getHeight());
		if(per.can()){
			System.out.println("���ܽ�飡");
		}else
			System.out.println("�����ܽ�飡");
	}
}
