package hybrid_inheritance;

public class Birds implements Eagle,Vulture,pheonix {
	public String findcarnivore(boolean iscarnivore) {
		if(iscarnivore==true) {
			System.out.println("CARNIVORE ?: ");
			return "yeah";
		}
		else {
			System.out.println("CARNIVORE ?: ");
			return "Nah";
		}
	}
	public int findweight(int weight) {
		System.out.println(",WEIGHT: ");
		return weight;
	}
	public String findisOmnivore(boolean isOmnivore) {
		if(isOmnivore==true) {
			System.out.println(",OMNIVORE ?: ");
			return "Yes";
		}
		else {
			System.out.println(",OMNIVORE ?: ");
			return "Nope";
		}
	}
	public int findvariety(int variety) {
		return variety;
		
	}
	public String findisExist(boolean isexist) {
		if(isexist==true) {
			System.out.println(",EXIST?: ");
			return "Exist";
		}
		else {
			System.out.println(",EXIST ?: ");
			return "Not Exist";
		}
	}
	public String findinNovel(String novel) {
		System.out.println(",IS THERE ?: ");
		return "YES";
	}
	
	public String findisPet(boolean pet) {
		if(pet==true) {
			System.out.println(",CAN PET THEM ?: ");
			return "Its a pet";
		}
		else {
			System.out.println(",CAN PET THEM ?: ");
			return "No it isn't";
		}
	}

}
