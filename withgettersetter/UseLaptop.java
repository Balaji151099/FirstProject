package withgettersetter;

public class UseLaptop {
	public static void main(String[]args) {
		Camera c=new Camera();
		c.setSensor("micro");
		c.setType("web");
		
		Laptop l=new Laptop();
		l.setBrand("HP");
		l.setProcessor("iris5");
		l.setPrice(70000);
		l.SetCamera(c);
		
		System.out.println("BRAND: "+l.getBrand()+", PRICE: "+l.getprice()+", PROCESSOR: "+l.getProcessor()+", "+l.GetCamera().getSensor());
		
	}

}
