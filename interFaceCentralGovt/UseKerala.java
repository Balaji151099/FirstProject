package interFaceCentralGovt;

public class UseKerala {
	public static void main(String[]args) {
		CentralGovt cg=new Kerala();
		System.out.println(cg.toMaterial("Tin"));
		System.out.println(cg.toJoin("Tpe"));
		System.out.println(cg.toColour("Yellow"));
		System.out.println(cg.toStatecode("KL"));
	}

}
