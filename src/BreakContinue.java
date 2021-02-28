

public class BreakContinue {

	public static void main(String[] args) {
		
		// Break stop the loop 
		// continue skip 
		
		for(int i = 1; i<=10; i++) {
			if(i==6) {
			continue;
			}
			System.out.println(i);
			
		}
		System.out.println();
		
		System.out.println("Example 2");
		
		
		for (int y = 0; y<10; y++) {
			if(y==4) {
				break;
			}
			System.out.println(y);
		}
			
	}

}
