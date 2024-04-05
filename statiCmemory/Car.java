package statiCmemory;

public class Car {
	static String brand;
	public int price;
	public String model;
	
	public Car(String brand,int price,String model) {
		this.brand=brand;
		this.price=price;
		this.model=model;
	}
	
	public String toString() {
		return "BRAND: "+brand+" "+"PRICE: "+price+" "+"MODEL: "+model;
	}

}
