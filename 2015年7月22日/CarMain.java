abstract class Car{
	public abstract String getName();
	public abstract int getPrice();
}
class Bmw extends Car{
	public String getName(){
		return "BMW";
	}
	public int getPrice(){
		return 500000;
	}
}
class Qq extends Car{
	public String getName(){
		return "QQ";
	}
	public int getPrice(){
		return 50000;
	}
}
class CarShop{
	int money=0;
	public void sellCar(Car c) {
		System.out.println("卖出一辆"+c.getName());
		money+=c.getPrice();
	}
	public int getMoney(){
		return money;
	}
}
public class CarMain {
	public static void main(String[] args){
		CarShop shop = new CarShop();
		shop.sellCar(new Qq());
		shop.sellCar(new Bmw());
		System.out.println("销售额是" + shop.getMoney());

	}
}
