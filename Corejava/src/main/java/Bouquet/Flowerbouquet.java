package Bouquet;

import java.util.Scanner;

public class Flowerbouquet extends Flowers{
	
	public void Bouquetcost(int roses,int jasmine, int lilly) {
		double rosecost = getrosecost()*roses;
		double jasminecost = getjasminecost()*jasmine;
		double lillycost = getlillycost()*lilly;
		double bouquetcost = rosecost+jasminecost+lillycost;
		
		System.out.println("Bouquest cost =  " +bouquetcost +"$");
	}
	public static void main(String[] args) {
		Flowerbouquet bouquet = new Flowerbouquet();
		Scanner input = new Scanner(System.in);
		System.out.println("No of roses required in a bouquet");
		int rose = input.nextInt();
		System.out.println("No of jasmine required in a bouquet");
		int jasmine = input.nextInt();
		System.out.println("No of lilly required in a bouquet");
		int lilly = input.nextInt();
		bouquet.Bouquetcost(rose, jasmine, lilly);
		
	}

}
