package ArraysAndStrings;

public class String_Rotation {

	static boolean CheckRotation(String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;
		
	String concatenatedString = s1 +s1;
	return concatenatedString.contains(s2);
	
	}
	
	public static void main(String[] args) {
		String s1 = "HELLO";
		String s2 = "LOHEL";
		if(CheckRotation(s1, s2))
			System.out.println("Strings are rotation to each other");
		else
			System.out.println("Strings are not rotation of each other");

	}

}
