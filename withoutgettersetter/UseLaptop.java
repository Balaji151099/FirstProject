package withoutgettersetter;

public class UseLaptop {
	public static void  main(String[]args) {
		Camera c=new Camera();
		c.type="web";
		c.isHd=true;
		c.sensor="mircohd";
		
		Laptop l=new Laptop();
		l.brand="HP";
		l.processor="iris5";
		l.price=70000;
		l.camera=c;
		
		System.out.println(l.brand+" "+l.processor+" "+l.price+" "+l.isHd+" ");
				
	
	}

}
