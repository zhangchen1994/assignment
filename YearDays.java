import java.util.Scanner;
public class YearDays{
	public static boolean isnum(String m){
		try{
			int intnum=Integer.parseInt(m);
			if(intnum<-1){
				return false;
			}else
				return true;
		}catch(Exception e){
			return false;
		}
	}
	public static int getDays(int year){
		if(year%4==0&&year%100!=0||year%400==0){
			return 366;
		}else
			return 365;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String year;
		int years;
		String num="y";
		do{
			System.out.println("请输入年份");
			year=in.next();
			if(!isnum(year)){
				System.out.println("请输入正确的年份");
				continue;
			}else{
				years=Integer.parseInt(year);
				System.out.println(years+"有"+getDays(years)+"天");
				System.out.println("继续吗？继续请输入Y,退出请按任意键回车");
				num=in.next();
			}
		}while(num.equals(""));
	}
}
