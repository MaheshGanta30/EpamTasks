package LanguageConstruct;
public class Great_Number {

	public static void main(String[] args) {
		
		Great_Number greatnumber = new Great_Number();
		boolean Result = greatnumber.RequiredNumber(36, 36);
		if(Result)
			System.out.println("Number 6 is really Great Number");
		else
			System.out.println("Number 6 is not Great Number");
	}

public boolean RequiredNumber(int a, int b) {
	if (a==6 || b==6)
		return true;
	
	int sum = Math.abs(a+b);
	int diff = Math.abs(a-b);
	if(sum==6 || diff==6)
		return true;
	else
		return false;

	}

}
