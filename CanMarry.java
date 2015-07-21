package man;
import java.util.*;
public class CanMarry {
	private String name;
	private String sex;
	private int age;
	private int height;
	public CanMarry(String name,String sex,int age,int height){
		this.name=name;
		this.age=age;
		this.height=height;
		this.sex=sex;
	}
	public boolean can(){
		if((sex.equals("F")&&age>=20)||(sex.equals("M")&&age>=22)){
			return true;
		}else if((sex.equals("F")&&age<20)||(sex.equals("M")&&age<22)){
			return false;
		}else{
			System.out.println("ÄãµÄÊäÈëÓÐÎó");
			return false;
		}
	}
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
}
