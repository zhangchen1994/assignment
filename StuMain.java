package Stumian;
import stu.Student;
import java.util.*;
public class StuMain {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("�������������");
		String name=in.next();
		System.out.println("����������꼶��0�����һ��1��������2���������3������ģ�");
		int grade=in.nextInt();
		System.out.println("���������רҵ");
		String major=in.next();
		int[] cet4_scores=new int[8];
		System.out.println("��������������ļ��ɼ�������8�Σ���-1����");
		for(int i=0;i<8;i++){
			int s=in.nextInt();
			if(s!=-1)
				cet4_scores[i]=in.nextInt();
			else
				break;
		}
		Student stu=new Student(name,major,grade,cet4_scores);
		stu.printInfo();
		stu.level_up();
		stu.printInfo();
	}
}
