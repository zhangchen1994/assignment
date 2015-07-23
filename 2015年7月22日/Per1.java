class Limb{
	public int weight;
	public int length;
	public Limb(int weight,int length){
		this.weight=weight;
		this.length=length;
	}
	public int getWeight() {
		return weight;
	}
	public int getLength() {
		return length;
	}

}
class Leg extends Limb{
	public Leg(int weight,int length){
		super(weight,length);
	}
}
class Hand extends Limb{
	public Hand(int weight,int length){
		super(weight,length);
	}
}
class Person {
	Leg[] leg=new Leg[2];
	Hand[] hand=new Hand[2];
	public void printInfo(){
		for(int i=0;i<2;i++){
			System.out.println("第"+(i+1)+"只腿"+leg[i].length+"cm"+" "+leg[i].weight+"kg");
			System.out.println("第"+(i+1)+"手"+hand[i].length+"cm"+" "+hand[i].weight+"kg");
		}
	}
}

public class Per1 {
	public static void main(String[] args){
		Person per=new Person();
		per.leg[0]=new Leg(30,70);
		per.leg[1]=new Leg(30,70);
		per.hand[0]=new Hand(20,50);
		per.hand[1]=new Hand(20,50);
		per.printInfo();
	}
}
