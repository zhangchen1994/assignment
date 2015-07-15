import java.util.*;
class Fibonacci1{
	public int fib(int n){
		if(n<0){
			return -1;
		}else if(n==1){
			return 0;
		}
		else if(n==2){
			return 1;
		}

		else return fib(n-1)+fib(n-2);
	}
}
public class Fibonacci {
	public static void main(String[] args){
		Fibonacci1 A=new Fibonacci1();
		Scanner in=new Scanner(System.in);
		System.out.println("请输入长度");
		int n=in.nextInt();
		int[] arr=new int[n+1];
		for(int i=0;i<=n;i++){
			arr[i]=A.fib(i+1);
			if(arr[i]!=-1){
				System.out.println(arr[i]);
			}
		}
	}
}
