import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요. (M/F)");
		System.out.print("> ");
		
		String gender = sc.next();
		
//		Switch 키워드 뒤에 나오는 괄호는 boolean형이 아닌 정수, 문자열 타입의 변수만 가능
		
		switch(gender) {
			case "m":
			case "M":
				System.out.println("남자입니다.");
				break;
			
			case "f":
			case "F": 
				System.out.println("여자입니다.");
				break;
			
			default:
				System.out.println("오류");
				break;
		}
		
		sc.close();
	}

}
