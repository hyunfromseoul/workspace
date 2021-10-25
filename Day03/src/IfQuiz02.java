import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
//		정수 2개를 입력받아서 어느 수가 큰지 혹은 같은지를 판별하여라
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A의 값: ");
		int a = sc.nextInt();
		
		System.out.print("정수 B의 값: ");
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a+"(이)가 더 큰 수입니다.");
		} else if(a < b) {
			System.out.println(b+"(이)가 더 큰 수입니다.");
		}
		else {
			System.out.println("같은 수입니다.");
		}
		
		sc.close();
	}

}
