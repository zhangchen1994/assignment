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
			System.out.println("������һ��0--100������");
			int n=in.nextInt();
			if(n<0||n>100){
				System.out.println("����������ڷ�Χ��");
			}
			else
				System.out.println("�ȽϵĴ���Ϊ"+guess(n));
			System.out.println("�����𣿼���������y���˳���������س�");
			num=in.next();
		}while(num.equals("y"));
	}
}
