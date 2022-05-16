package LanguageConstruct;


public class Police_Challans {

	public static void main(String[] args) {
		
		int speed = 64;
		boolean isBirthday = true;
		Police_Challans policechallan = new Police_Challans();
		int result = policechallan.caughtspeeding(speed, isBirthday);
		if (result==0)
			System.out.println("No Ticket");
		if (result==1)
			System.out.println("Small Ticket");
		if (result==2)
			System.out.println("Big Ticket");
	}

	public int caughtspeeding(int speed, boolean isBirthday) {
		if(!(isBirthday)) {
			if(speed <= 60)
				return 0;
			if(speed > 60 && speed <=80)
				return 1;
			else
				return 2;
		}else if (speed <= 65)
			return 0;
		else if (speed > 65 && speed <=85)
			return 1;
		else
			return 2;
	}

	}
