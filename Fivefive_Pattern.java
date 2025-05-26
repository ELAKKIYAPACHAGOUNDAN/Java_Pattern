
public class Fivefive_Pattern {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		/* output
		1 1 1 1 1 
		2 2 2 2 2 
		3 3 3 3 3 
		4 4 4 4 4 
		5 5 5 5 5 */
		
		System.out.println();

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/* output
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 */
		
		System.out.println();
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		/*output
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * *
		 */
		System.out.println();
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		/*output
		 	* * * * * 
			*       * 
			*       * 
			*       * 
			* * * * * 
		 */
		
	}
}
