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
class Square extends OblngShape{
	public Square(double length,String color){
		super(length,color);
	}
}
public class ShapeExtends {
	public static void main(String[] args){
		Square s = new Square(20, "black");
		s.printInfo();

	}
}
