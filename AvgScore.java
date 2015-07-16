import java.util.*;
public class AvgScore{
	public static boolean isnum(String m){
		try{
			int intnum=Integer.parseInt(m);
			if(intnum<-1){
				return true;
			}else
				return false;
		}catch(Exception e){
			return true;
		}
	}
	public static double averageScore(ArrayList<Integer>scores){
		double sum=0;
		for(int i=0;i<scores.size();i++){
			sum+=scores.get(i);
		}
		/*for(Integer j:scores){
			sum+=j;     
			
		}for循环的第二种类型*/
		/*int j=0;
		while(j<scores.size()){
			sum+=scores.get(j);
			j++;
		} while循环 */
		/*int j=1;
		do{
			sum+=scores.get(j-1);
			j++;
		}while(j<scores.size());do while 循环*/
		return sum/scores.size(); 
	}
	public static void main(String[] args){;
	double s=0;
	ArrayList<Integer>scores=new ArrayList<Integer>();
	String num;
	int m=0;
	System.out.println("输出平均值请按-1");
	System.out.println("请输入成绩:");
	do{
		Scanner sca1=new Scanner(System.in);
		num=sca1.next();
		if(isnum(num)){
			System.out.println("输入数字不正确，请不要输入其它字符或小于0的成绩，如果想输出平均值请输入-1");
			continue;
		}
		else{
			m=Integer.parseInt(num);
			scores.add(m);
			if(m==-1){
				System.out.println(s);
			}else
				s=averageScore(scores);
		}
	}while(m!=-1);
	}

}

