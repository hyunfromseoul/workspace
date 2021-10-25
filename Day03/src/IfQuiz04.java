import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		/*
		 - 정수 3개를 입력 받습니다.
		 - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
		 */
		
		int max = 0;
		int min = 0;
		int mid = 0;
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 1: ");
		a = sc.nextInt();
		System.out.println("정수 2: ");
		b = sc.nextInt();
		System.out.println("정수 3: ");
		c = sc.nextInt();
		
		if (a > b && a > c) {
			max = a;
			if (b > c) {
				mid = b;
				min = c;
			} else if (c > b) {
				mid = c;
				min = b;
			}
		} else if (b > a && b > c) {
			max = b;
			if (a > c) {
				mid = a;
				min = c;
			} else if (c > a) {
				mid = c;
				min = a;
			}
		} else if (c > a && c > b) {
			max = c;
			if (a > b) {
				mid = a;
				min = b;
			} else {
				mid = b;
				min = a;
			}
		}
		
		System.out.println("최대값:" + max);
		System.out.println("중간값:" + mid);
		System.out.println("최소값:" + min);
		sc.close();
	}

}
