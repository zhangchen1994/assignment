package shizxitest;

import java.util.ArrayList;

abstract class Shape{
	public abstract double area();
}
class Oblng extends Shape{
	private double length;
	private double wide;
	public Oblng(double length,double wide){
		this.length=length;
		this.wide=wide;
	}
	public double area(){
		return length*wide;
	}
}
class Square extends Shape{
	private double length;
	public Square(double length){
		this.length=length;
	}
	public double area() {
		return length*length;
	}
	
}
class Circle extends Shape{
	private double R;
	public Circle(double R){
		this.R=R;
	}
	public double area() {
		return Math.PI*R*R;
	}
	
}
class Sjx extends Shape{
	private double length;
	private double height;
	public Sjx(double length,double height){
		this.length=length;
		this.height=height;
	}
	public double area() {
		return 0.5*length*height;
	}
}
public class ShapeMain {
	
	public static void main(String[] args){
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Oblng(20,20));
		shapes.add(new Square(20));
		shapes.add(new Circle(20));
		shapes.add(new Oblng(20,20));
		System.out.println("Total Area:" + getTotalArea(shapes));
	}
	public static double  getTotalArea(ArrayList<Shape> shapes){
		double totalarea=0;
		for(int i=0;i<shapes.size();i++){
			totalarea+=shapes.get(i).area();
		}
		return totalarea;
	}
}
