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
			System.out.println("���������");
			year=in.nextInt();
		if(isleap(year)){
			System.out.println(year+"������");
		}
		else
			System.out.println(year+"��������");
		System.out.println("�����𣿼���������Y,�˳��밴������س�");
		num=in.next();
		}while(num.equals("y"));
	}
}
