import java.util.*;
public class circle {
	public static void main(String[] args){
		System.out.println("请输入圆的半径");
		Scanner in=new Scanner(System.in);
		int radius=in.nextInt();
		double area=Math.PI*radius*radius;
		System.out.println("圆的面积是"+area);
	}
}
