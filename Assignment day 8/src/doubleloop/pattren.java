package doubleloop;

public class pattren {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) { // loop for row
			
			for (int j=1; j<=i;j++) {
				System.out.print("*");//loop for column
				
			}
			System.out.println();
		}
	}

}
