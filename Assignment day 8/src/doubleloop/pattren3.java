package doubleloop;

public class pattren3 {
	
	public void part (int n) {
		int i;
		
		for ( i=0; i<n;i++) {
			System.out.print(" ");
			
			for (int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pattren3 s = new pattren3();
		
		s.part(5);
		
	}
	

}
