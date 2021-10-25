import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("신장을 입력하세요: ");
		int height = sc.nextInt();
		if (height >= 140) {
			System.out.print("나이를 입력하세요: ");
			int age = sc.nextInt();
			if (age >=8) {
				System.out.println("놀이기구 탑승이 가능합니다.");
			} else {
				System.out.println("나이가 8세 미만입니다.");
				System.out.println("탑승이 불가능합니다.");
			}
		} else {
			System.out.println("140 미만입니다.");
			System.out.println("탑승이 불가능합니다.");
		}
		
		
		
		sc.close();
	}

}
