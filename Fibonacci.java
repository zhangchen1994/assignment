import java.util.*;
class Fibonacci1{
	public int fib(int n){
		if(n<1){
			return -1;
		}else if(n==1||n==2){
			return 1;
		}

		else return fib(n-1)+fib(n-2);
	}
}
public class Fibonacci {
	public static void main(String[] args){
		Fibonacci1 A=new Fibonacci1();
		Scanner in=new Scanner(System.in);
		System.out.println("ÇëÊäÈë³¤¶Èn");
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=A.fib(i+1);
			if(arr[i]!=-1){
				System.out.println(arr[i]);
			}
		}
	}
}
