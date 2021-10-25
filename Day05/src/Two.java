import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
		String choice = sc.next();
		
		int random = (int)(Math.random() * 3 + 1);
		
		System.out.print((choice == "가위" && random == 1) ? "비겼습니다": "");
		System.out.print((choice == "바위" && random == 2) ? "비겼습니다": "");
		System.out.print((choice == "보" && random == 3) ? "비겼습니다": "");

		System.out.print((choice == "가위" && random == 3) ? "이겼습니다": "");
		System.out.print((choice == "바위" && random == 1) ? "이겼습니다": "");
		System.out.print((choice == "보" && random == 2) ? "이겼습니다": "");
		
		System.out.print((choice == "가위" && random == 2) ? "졌습니다": "");
		System.out.print((choice == "바위" && random == 3) ? "졌습니다": "");
		System.out.print((choice == "보" && random == 1) ? "졌습니다": "");
		 
		System.out.println(random);
	}

}
