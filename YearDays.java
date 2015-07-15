import java.util.Scanner;
public class YearDays{
	public static boolean isnum(String m){
		try{
			int intnum=Integer.parseInt(m);
			if(intnum<-1){
				return true;
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
			System.out.println("���������");
			year=in.next();
			if(!isnum(year)){
				System.out.println("��������ȷ�����");
				continue;
			}else{
				years=Integer.parseInt(year);
				System.out.println(years+"��"+getDays(years)+"��");
				System.out.println("�����𣿼���������Y,�˳��밴������س�");
				num=in.next();
			}
		}while(num.equals("y"));
	}
}
