package BasicJavaConcepts;

public class AboutSystem {

	public static void main(String[] args) {

		String s = "Gadipudi";
		String s1 = "Lion";
		String name = s+s1;
		
		System.out.println("Name of the owner :"+name);
		
		property();
		
				
	}
	public static  void property() {
		int asset = 5054000;
		int house = 1800000;
		int total = asset+house;
		
		System.out.println("Total property is :"+total);
		
		
	}

}
