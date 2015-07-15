import java.util.*;
public class Guess {
	public static int guess(int n){
		int num=1;
		int left=0;
		int right=100;
		int m=(left+right)/2;
		while(left<right&&m!=n){
			if(m<n){
				left=m+1;
			}else if(m>n){
				right=m-1;
			}
			m=(left+right)/2;
			num++;
		}
		return num;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String num;
		do{
			System.out.println("请输入一个0--100的整数");
			int n=in.nextInt();
			if(n<0||n>100){
				System.out.println("输入的数不在范围内");
			}
			else
				System.out.println("比较的次数为"+guess(n));
			System.out.println("继续吗？继续请输入y，退出按任意键回车");
			num=in.next();
		}while(num.equals("y"));
	}
}
