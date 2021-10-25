import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
//		스캐너를 사용하여 정수 하나를 입력받으세요
//		7의 배수가 맞다. 아니다. 0이다. 를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		
		if(a == 0) {
			System.out.println("0입니다.");
		} else if (a % 7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("7의 배수가 아닙니다.");
		}
		
		sc.close();
	}

}
