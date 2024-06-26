package arrayList;

public class Phone {
	private String brand;
	private int price;
	private String colour;
	private float rating;
	private int editionyear;
	public Phone(String brand, int price, String colour, float rating, int editionyear) {
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.rating = rating;
		this.editionyear = editionyear;
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
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getEditionyear() {
		return editionyear;
	}
	public void setEditionyear(int editionyear) {
		this.editionyear = editionyear;
	}
	//@Override
	public String toString() {
		return "brand=" + brand + ", price=" + price + ", colour=" + colour + ", rating=" + rating
				+ ", editionyear=" + editionyear ;
	}
	
	
	
	

}
