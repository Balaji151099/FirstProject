package multiple_Inheritance;

public class ImpFuel implements Bike ,EBike {
	public String findmileage(int km) {
		if(km<=50) {
			return "Good";
		}
		else {
			return "NotBad";
		}
	}
	public String  findCc(int tor ) {
		if(tor>=150) {
			return "Ok";
		}
		else {
			return "Not Ok";
		}
	}

 public String findisEv(boolean isEv) {
	 if(isEv==true) {
		 return "Electric";
	 }
	 else {
		 return "Not Electric";
	 }
 }
 
public int findprice(int price,int tax) {
	int Total=price+tax;
	return Total;
}
}
