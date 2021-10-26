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
		
		//flag로 true false를 잡자
		//이유는 kakao의 초기 length가 5인데 for문에 ++을 해서 length 만큼 다 돌동안 일치하지 않았기에
//		countLength가 5까지 차서 flag 가 false로 잡혔기 때문
		boolean flag = false;
		//첫번째 for문에서 입력된 값과 같은 kakao[i]의 인덱스를 checkIndex에 넣는다
		int checkIndex = 0;
		System.out.println("입력받은 값: " + name);
		System.out.println("변경 전: " + Arrays.toString(kakao));
//		첫번째 for문
		for (int i = 0; i < kakao.length; i++) {
			int countLength = 0;
			if(name.equals(kakao[i])) {
				checkIndex = i;
				flag = true;
				break;
			} else {
				countLength++;
			}
		}
		
//		flag가 true로 바뀌었다는 것은 일치값이 있었다는 것
		if (flag) {
//			for문을 돌려서 인덱스 0 쪽으로 1칸씩 값을 당겨온다 
			for (int j = checkIndex; j < kakao.length-1; j++) {
				kakao[j] = kakao[j+1];
			}			
//			temp 배열을 만든다 kakao.length 보다 1칸 작게
			String[] temp = new String[kakao.length - 1];
			
//			temp 안에다 kakao를 넣는다 하지만 kakao의 마지막은 들어가지 않는다
			for(int j=0; j<temp.length; j++) {
				temp[j] = kakao[j];
			}
//			kakao에다가 temp의 주소값을 넣는다
			kakao = temp;
			System.out.println("변경 후: " + Arrays.toString(kakao));			
		}
		
//			countLength가 5 면 값이 일치하지 않기때문에 없다고 출력
		System.out.println(!flag ? "입력받은 값이 없습니다." : "");
	}

}
