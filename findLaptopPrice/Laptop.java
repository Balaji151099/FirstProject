package findLaptopPrice;

public class Laptop {
		private String brand;
		private String os;
		private int price;
		private Camera camera;
		
		
		public void setBrand(String brand) {
			this.brand=brand;
		}
		public void setOs(String os) {
			this.os=os;
		}
		public void setPrice(int price) {
		this.price=price;
		}
		public String getBrand() {
			return brand;
		}
		public String getOs() {
			return os;
		}
		public int  getPrice() {
			return price;
		}
		public void setCamera(Camera camera) {
			this.camera=camera;
		}
		public Camera getCamera() {
			return camera;
		}

}
