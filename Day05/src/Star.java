
public class Star {

	public static void main(String[] args) {
		

		
		
 
//		Q1
		System.out.println("Q1");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		
//		Q2
		System.out.println("Q2");
		for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}
		
//		Q3
		System.out.println("Q3");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
//		Q4
		System.out.println("Q4");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
//		Q5
		System.out.println("Q5");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);	
			}
			System.out.println();
		}
		
//		Q6
		System.out.println("Q6");
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i+j);	
			}
			System.out.println();
		}
		
//		Q7
		System.out.println("Q7");
		for (int i = 1; i <= 5; i++) {
			for (int j = 6; j <= 10; j++) {
				System.out.print(j-i);
			}
			System.out.println();
		}
		
//		Q8
		System.out.println("Q8");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		Q9
		System.out.println("Q9");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		Q10
		System.out.println("Q10");
		for (int i = 4; i >= 0; i--) {
			switch(i) {
			case(3):
				System.out.print(" ");
			break;
			case(2):
				System.out.print("  ");
			break;
			case(1):
				System.out.print("   ");
			break;
			case(0):
				System.out.print("    ");
			break;
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		
//		Q11
		System.out.println("Q11");
		for (int i = 4; i >= 0; i--) {
			switch(i) {
			case(1):
				System.out.print(" ");
			break;
			case(2):
				System.out.print("  ");
			break;
			case(3):
				System.out.print("   ");
			break;
			case(4):
				System.out.print("    ");
			break;
			}
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("test code");
			System.out.println("tdd code");
		}
		
		
		
		
	}

}
