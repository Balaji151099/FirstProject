package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UsePhone {
	public static void main(String[] args) {
		Phone p1 = new Phone("Iphone", 150000, "grey", 8.5f, 2023);
		Phone p2 = new Phone("Sony", 50000, "red", 7.5f, 2018);
		Phone p3 = new Phone("Samsung", 20000, "Indico", 9.2f, 2024);
		Phone p4 = new Phone("Nothing", 35000, "black", 6.9f, 2022);
		Phone p5 = new Phone("Redmi", 18000, "blue", 4.6f, 2023);

		ArrayList<Phone> ph = new ArrayList<>();
		ph.add(p1);
		ph.add(p2);
		ph.add(p3);
		ph.add(p4);
		ph.add(p5);

		for (int i = 0; i < ph.size(); i++) {
			System.out.println(ph.get(i));
		}
		System.out.println("\n");
		
		for(Phone p : ph) {
			if(p.getPrice()>15000 && p.getPrice()<30000) {
				System.out.println(p);
				
			}
		}
		System.out.println("####################");
		
		ArrayList<Phone> p = new ArrayList<>();
		p.forEach(x-> {
			if(x.getEditionyear()<2020) {
				p.add(x);
				System.out.println(x);
			}
			
		});
		
		
		System.out.println("####################");
		
		ph.forEach(x-> {
			if(x.getRating()>8) {
				x.setPrice(x.getPrice()+(x.getPrice()*25/100));
				System.out.println(x);
			}
		}
		);
		
		System.out.println("####################");
		
		for(int i=0;i<ph.size();i++) {
			if(ph.get(i).getRating()>8) {
				ph.get(i).setPrice(ph.get(i).getPrice()+(ph.get(i).getPrice()*25/100));
			}
		}
		ph.forEach (x->System.out.println(x));
		
		System.out.println("####################");
		
		Iterator<Phone> a=ph.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
			System.out.println(ph);
		}
		System.out.println("####################");
		
		
		Iterator<Phone>b=ph.iterator();
		while(b.hasNext()) {
			if(b.next().getPrice()<20000) {
				b.remove();
				System.out.println(ph);
				
				System.out.println(ph);
			}
		}
		
	}

}
