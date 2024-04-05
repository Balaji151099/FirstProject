package linkedList;
import java.util.LinkedList;

public class Bike {
	private String brand;
	private int price;
	private String model;
	private int cc;
	private boolean isEv;
	
	
	public Bike(String brand, int price, String model, int cc, boolean isEv) {
		super();
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.cc = cc;
		this.isEv = isEv;
	}
	
	
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public boolean getEv() {
		return isEv;
	}
	public void setEv(boolean isEv) {
		this.isEv = isEv;
	}
	@Override
	public String toString() {
		return "[brand=" + brand + ", price=" + price + ", model=" + model + ", cc=" + cc + ", isEv=" + isEv+"]";
				//+ ", getBrand()=" + getBrand() + ", getPrice()=" + getPrice() + ", getModel()=" + getModel()
				//+ ", getCc()=" + getCc() + ", getEv()=" + getEv() + "]";
	}
	

}
