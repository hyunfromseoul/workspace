import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		  다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		  연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수: ");
		int a = sc.nextInt();
		System.out.println("연산자를 입력해주세요. [+, -, *, /]");
		String count = sc.next();
		System.out.println("두번째 정수: ");
		int b = sc.nextInt();
		
		switch(count) {
			case "+":
				System.out.println("a + b = "+(a+b));
			break;
			case "-":
				System.out.println("a - b = "+(a-b));
				break;
			case "*":
				System.out.println("a * b = "+(a*b));
				break;
			case "/":
				System.out.println("a / b = "+(a/b));
				break;
				
			default:
				System.out.println("Let me do it again");
				break;
		}
	}

}
