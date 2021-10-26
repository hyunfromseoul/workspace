import java.util.Scanner;

public class ArrayAnother {

	public static void main(String[] args) {
		/*
		 1. String 배열을 생성하세요. (foods)
		 크기는 넉넉하게 50개로 지정하겠습니다.
		 
		 2. 사용자에게 음식 이름을 입력받아서 배열에
		  삽입해 주세요.
		  사용자가 음식 입력창에 '배불러' 라고 작성하면
		  입력을 종료해 주세요.
		  
		 3. 입력이 종료되면 사용자가 입력한 음식을
		 가로로 출력해 주세요. (null은 출력하지 마세요.)
		 */
		Scanner sc = new Scanner(System.in);
		String[] foods = new String[50];
		System.out.println("음식 이름을 입력해주세요");
		System.out.print(">");
		
		String empty;
		
		for (int i = 0; i < foods.length; i++) {
			empty = sc.next();
			if(empty.equals("배불러")) break;
			foods[i] = empty;
			System.out.print("\n>");
		}
		
		for (String string : foods) {
			System.out.print(string != null ? string + " " : "");
		}
		
		
	}

}
