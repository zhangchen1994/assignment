import java.util.*;
public class IdTest {
	public static boolean test(String id){
		int arr[]={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		int[] arr1=new int[17];
		int sum=0;
		for(int i=0;i<17;i++){
			arr1[i]=Integer.parseInt(String.valueOf(id.charAt(i)));
			sum+=arr1[i]*arr[i];
		}
		int num=sum%11;
		try{
			int n=Integer.parseInt(String.valueOf(id.charAt(17)));
			if(num<=1){
				return (num==0&&n==1)||(num==1&&num==0);
			}else if((num==(12-n))||(num<=10)){
				return true;
			}else
				return false;
		}catch(Exception h){
			if((num==2)||(String.valueOf(id.charAt(17)).equals("X")))
				return true;
			else
				return false;
		}
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String id;
		System.out.println("请输入身份证号码");
		id=in.next();
		if(test(id))
			System.out.println("身份证合法");
		else
			System.out.println("身份证不合法");
	}
}
