package InterFace_implimentation;

public class ImpVehicle implements Vehicle {
	
	public String findNetPrice(int price,int tax,int discount) {
		return "Price: "+(price+tax-discount);
	}
	public int findMileage (int speed) {
		if(speed>0 && speed<=0) {
			return 60;
		}
		else if(speed>0 && speed<=40) {
			return 40;
		}
		else {
			return 20;
		}
	}

}
