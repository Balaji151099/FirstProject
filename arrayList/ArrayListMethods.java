package arrayList;
import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[]args) {
	ArrayList<Integer> nums=new ArrayList<>();
	nums.add(73);
	nums.add(124);
	nums.add(24);
	nums.add(18);
	nums.add(2);
	System.out.println(nums);
	
	System.out.println("\n");
	
	nums.set(4,27);
	
	System.out.println("\n");
	
	System.out.println(nums.size());
	System.out.println("\n");
	
	System.out.println(nums);
	System.out.println("\n");
	
	nums.remove(3);
	System.out.println("\n");
	
	System.out.println(nums.get(3));
	System.out.println("\n");
	
	System.out.println(nums);
	System.out.println("\n");
	
	System.out.println(nums.get(1));
	System.out.println("\n");
	
	System.out.println(nums);
	System.out.println("\n");

	System.out.println(nums.size());
	
	System.out.println("\n");
	System.out.println(nums);
	
	
	System.out.println("\n");
	
	for(int i=0;i<nums.size();i++) {
		System.out.println(nums.get(i));
	}
	
	System.out.println("\n");
	
	for (Integer a:nums) {
		System.out.println(a);
	}
	System.out.println("\n");
	
	for(int i=0;i<nums.size();i++) {
		if(nums.get(i)%2==0) {
			System.out.println(nums.get(i));
			
		}
	}
	System.out.println("\n");
	
	for(Integer a:nums) {
		if( a %2!=0) {
			System.out.println(a);
		}
	}
	
	System.out.println("\n");
	
	nums.forEach(x -> System.out.println(x));
	
	System.out.println("\n");
	
	nums.forEach(x-> {
		if(x%3==0) {
			System.out.println(x);
			System.out.println("Hey there");
		}
	});
	}

}
