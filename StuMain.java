package Stumian;
import stu.Student;
import java.util.*;
public class StuMain {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你的姓名");
		String name=in.next();
		System.out.println("请输入你的年级（0代表大一，1代表大二，2代表大三，3代表大四）");
		int grade=in.nextInt();
		System.out.println("请输入你的专业");
		String major=in.next();
		int[] cet4_scores=new int[8];
		System.out.println("请输入你的所有四级成绩，少于8次，以-1结束");
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
