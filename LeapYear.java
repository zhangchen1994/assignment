import java.util.*;
public class LeapYear {
	public static boolean isleap(int year){
		if(year%4==0&&year%100!=0||year%400==0){
			return true;
		}else
			return false;
	}
	public static void main(String[] args){
		int year;
		Scanner in=new Scanner(System.in);
		String num;
		do{
			System.out.println("请输入年份");
			year=in.nextInt();
		if(isleap(year)){
			System.out.println(year+"是闰年");
		}
		else
			System.out.println(year+"不是闰年");
		System.out.println("继续吗？继续请输入Y,退出请按任意键回车");
		num=in.next();
		}while(num.equals("y"));
	}
}
