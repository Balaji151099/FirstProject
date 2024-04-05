package linkedList;

import java.util.LinkedList;

public class UseBike {
	public static void main(String[]args) {
		LinkedList<Bike> bk =new LinkedList<>();
		//bk.add(Bike b1=new Bike("Yamaha",2000000,"R15",155,false));
		//bk.add(Bike b2=new Bike("Kawasaki",4500000,"Ninja",1000,false));
		//bk.add(Bike b3=new Bike("Jawa",2500000,"perak",350,false));
		//bk.add(Bike b4=new Bike("Ola",2000000,"Escoot",0,true));
		
		
		Bike b1=new Bike("Yamaha",2000000,"R15",155,false);
		Bike b2=new Bike("Kawasaki",4500000,"Ninja",1000,false);
		Bike b3=new Bike("Jawa",2500000,"Perak",350,false);
		Bike b4=new Bike("Ola",2000000,"Escoot",0,true);
		
		
		bk.add(b1);
		bk.add(b2);
		bk.add(b3);
		bk.add(b4);
		
		
		
		//for(int i=0;i<bk.size();i++) {
			//if(bk.getCc()>300 && !bk.Ev()) {
				//System.out.println("Non ELECTRIC BIKES: "+bk.getModel());
			//}
		//}
		//bk.forEach(x->{
			//if(bk.getPrice()>2000000) {
		//});
		
		
		for (Bike b : bk) {
            if (b.getBrand().equals("Yamaha")) {
                System.out.println("Yamaha bike found: " + b.getModel());
            }
        }
		
		System.out.println("\n");
		
		for (int i = 0; i < bk.size(); i++) {
            Bike b = bk.get(i);
            if (b.getCc() > 300 && !b.getEv() ) {
            	System.out.println(b);
                System.out.println("Powerful Non EV bike: " + b.getModel()+"\n");
                
            }
        }
		bk.forEach(x -> {
            if (x.getModel().equalsIgnoreCase("perak")) {
                System.out.println("JAWA: " + x.getModel());
            }
        });
		
		System.out.println("\n");
		
		for (int i = 0; i < bk.size(); i++) {
            Bike b = bk.get(i);
            if (b.getPrice() > 2000000 ) {
            	b.setPrice(b.getPrice()-(b.getPrice()*25/100));
            	System.out.println("MODEL: "+b.getModel()+" "+"PRICE: "+b.getPrice());
            }
		}
		System.out.println("\n");
		
		for (int i = 0; i < bk.size(); i++) {
			System.out.println(bk.get(i));
		}
	}
}
		
