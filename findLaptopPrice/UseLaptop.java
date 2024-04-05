package findLaptopPrice;

public class UseLaptop {
	public static void main(String[]args) {
		Camera c1=new Camera();
		c1.setBrand("Sony");
		c1.setPrice(12000);
		
		Camera c2=new Camera();
		c2.setBrand("nixo");
		c2.setPrice(14000);
		
		Camera c3=new Camera();
		c3.setBrand("nixon");
		c3.setPrice(5000);
		
		Camera c4=new Camera();
		c4.setBrand("canon");
		c4.setPrice(16000);
		
		Laptop l1=new Laptop();
		l1.setBrand("Hp");
		l1.setOs("iris7");
		l1.setPrice(75000);
		l1.setCamera(c1);
		
		Laptop l2=new Laptop();
		l2.setBrand("Lenovo");
		l2.setOs("gen7");
		l2.setPrice(25000);
		l2.setCamera(c2);
		
		Laptop l3=new Laptop();
		l3.setBrand("mac");
		l3.setOs("13");
		l3.setPrice(95000);
		l3.setCamera(c3);
		
		Laptop l4=new Laptop();
		l4.setBrand("Samsung");
		l4.setOs("inix");
		l4.setPrice(48000);
		l4.setCamera(c4);
		
		Laptop []Laptops= {l1,l2,l3,l4};
		for(Laptop lp:Laptops) {
			if(lp.getPrice()>5000) {
				int np=lp.getPrice()*(10/100)+lp.getPrice();
				System.out.println(np);
				
			}
		}
		
		
		
		
		
		
	}

}
