package multiple_Inheritance;

public class UseFuel {
	public static void main(String[]args) {
		ImpFuel im=new ImpFuel();
		System.out.println(im.findisEv(true));
		System.out.println(im.findprice(1500000,15256));
		System.out.println(im.findmileage(35));
		System.out.println(im.findCc(559));
		
		
	}

}
