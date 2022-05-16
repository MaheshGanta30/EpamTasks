package ArraysAndStrings;

public class BiggestAndSmallest {

	public static void main(String[] args) {
		
		//Array numbers
				int numbers[]= {76,45,5,7,67,84,89};
				int smallest = numbers[0];
				int largest = numbers[0];
				for(int i=1;i<numbers.length;i++) {
					if(numbers[i]>largest)
						largest=numbers[i];
					else if(numbers[i]<=smallest)
						smallest=numbers[i];
				}
				System.out.println("Largest number is "+largest);
				System.out.println("Smallest number is "+smallest);
			}

	}
