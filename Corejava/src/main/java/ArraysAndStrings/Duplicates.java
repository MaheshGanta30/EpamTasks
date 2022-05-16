package ArraysAndStrings;

public class Duplicates {

	public static void main(String[] args) {
		
		String name = "mahi kalyan pavan mahi";
		int count;
		
		char ch[]=name.toCharArray();
		
		System.out.println("Duplicate characters in a string");
		
		for(int i=0;i<ch.length;i++) {
			
			count = 1;
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
					count++;
					
					ch[j]=0;
				}
				
				}
		
			if(count>=1 && ch[i]!=0) {
				System.out.println(ch[i]+"="+count);
			}
				
		}
	}		

	}

