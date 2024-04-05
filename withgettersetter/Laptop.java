package withgettersetter;

public class Laptop {
	private String brand;
	private String processor;
	private int price;
	private Camera camera;
	
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setProcessor(String processor) {
		this.processor=processor;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void SetCamera(Camera camera) {
		this.camera=camera;
	}
	public String getBrand() {
		return brand;
	}
	public String getProcessor() {
		return processor;
	}
	public int getprice() {
		return price;
	}
	public Camera GetCamera() {
		return camera;
		
	}

}
