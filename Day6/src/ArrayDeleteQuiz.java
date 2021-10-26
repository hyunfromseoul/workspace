import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
		System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
		System.out.print("삭제할 친구를 입력하세요: ");
		String name = sc.next();
		
		/*
		 1. 삭제할 친구를 입력받아서 삭제를 진행하세요.
		 
		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
		 */
		System.out.println("입력된 값: " + name);
		
		String[] temp = new String[kakao.length - 1];
		String delete = "";
		for(int i=0; i<kakao.length; i++) {
			System.out.println("삭제를 진행합니다.");
			if(name.equals(kakao[i])) {
				delete = kakao[i];
			} else {
				delete = null;
			}
		}
		
		for (int j = 0; j < kakao.length; j++) {
			if (delete.equals(kakao[j])) {
				continue;
			} else if(!delete.equals(kakao[j])) {
				temp[j] = kakao[j];
			} else {
				System.out.println("아마 값이 없는듯?");
			}
		}
		
	}

}
