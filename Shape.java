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
		System.out.println("����"+length);
		System.out.println("��"+wide);
		System.out.println("��ɫ��"+color);
		System.out.println("���:"+getArea());
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
		System.out.println("����"+length);
		System.out.println("��ɫ��"+color);
		System.out.println("���:"+getArea());
	}
}
public class Shape{
	public static void main(String[] args){
		System.out.println("������");
		OblngShape L=new OblngShape(20,10,"white");
		L.printInfo();
		OblngShape L1=new OblngShape(20,"white");
		L1.printInfo();
		OblngShape L2=new OblngShape(20);
		L2.printInfo();
		OblngShape L3=new OblngShape();
		L3.printInfo();
		System.out.println("������");
		Square s = new Square(20, "black");
		s.printInfo();
		Square s1 = new Square(20);
		s1.printInfo();
		Square s2 = new Square();
		s2.printInfo();
	}
}