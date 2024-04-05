package interFaceCentralGovt;

public class UseTamilNadu {
	public static void main(String[]args) {
		CentralGovt cg=new TamilNadu();
		System.out.println("MATERIAL: "+cg.toMaterial("copper"));
		System.out.println("JOIN: "+cg.toJoin("screw"));
		System.out.println("COLOUR: "+cg.toColour("yellow"));
		System.out.println("STATECODE: "+cg.toStatecode("TN"));
		
		TamilNadu t1=new TamilNadu();
		System.out.println("FONT: "+t1.toFont("IND"));
		t1.toMaterial(null);
		
		
	}

}

