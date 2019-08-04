package others.phoneformat;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		
		System.out.println(t.solution("00-44  48 5555 8361")); // 004-448-555-583-61
		System.out.println(t.solution("0 - 22 1985--324")); // 022-198-53-24
		System.out.println(t.solution("555372654")); // 555-372-654
		System.out.println(t.solution("55")); // 
		System.out.println(t.solution("5")); //  
		System.out.println(t.solution("")); // 
	}

}
