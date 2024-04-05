package InterFace_implimentation;

public class UseVehicle {
	public static void main(String[]args) {
		ImpVehicle uv=new ImpVehicle();
		System.out.println(uv.findNetPrice(200000, 1000, 500));
		System.out.println(uv.findMileage(60));
		
	}

}
