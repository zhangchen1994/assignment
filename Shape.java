package homework;

class OblngShape{
	double length;
	double wide;
	String color;
	public OblngShape(){
		
	}
	public OblngShape(double length){
		this.length=length;
		this.wide=length;
	}
	public OblngShape(double length, String color){
		this.length=length;
		this.wide=length;
		this.color=color;
	}	
	public OblngShape(double length,double wide,String color){
		this.length=length;
		this.wide=wide;
		this.color=color;
	}
	public double getArea(){
		return length*wide;
	}
	public void printInfo() {
		System.out.println("长："+length);
		System.out.println("宽："+wide);
		System.out.println("颜色："+color);
		System.out.println("面积:"+getArea());
	}
}
class Square{
	double length;
	String color;
	public Square(){
		
	}
	public Square(double length){
		this.length=length;
	}
	public Square(double length,String color){
		this.length=length;
		this.color=color;
	}
	public double getArea(){
		return length*length;
	}
	public void printInfo() {
		System.out.println("长："+length);
		System.out.println("颜色："+color);
		System.out.println("面积:"+getArea());
	}
}
public class Shape{
	public static void main(String[] args){
		System.out.println("长方形");
		OblngShape L=new OblngShape(20,10,"white");
		L.printInfo();
		OblngShape L1=new OblngShape(20,"white");
		L1.printInfo();
		OblngShape L2=new OblngShape(20);
		L2.printInfo();
		OblngShape L3=new OblngShape();
		L3.printInfo();
		System.out.println("正方形");
		Square s = new Square(20, "black");
		s.printInfo();
		Square s1 = new Square(20);
		s1.printInfo();
		Square s2 = new Square();
		s2.printInfo();
	}
}