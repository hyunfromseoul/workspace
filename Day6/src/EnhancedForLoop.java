
public class EnhancedForLoop {

	public static void main(String[] args) {
		//향상된 for each문
		String[] sArr = {"월", "화", "수", "목", "금", "토", "일"};
		
		for(String str : sArr ) {
			System.out.print(str + "요일 ");
		}
		System.out.println();
//		1. scores 라는 int 배열 선언
//		점수 데이터 저장
//		{96, 88, 74, 63, 100, 55}
		
//		forEach 사용하여 총점과 평균을 구해보자.
//		총점은 int, 평균은 double이며 소수점 둘째자리까지 출력
		
		int[] scores = {96, 88, 74, 63, 100, 55};
		int a = 0;
		for(int i : scores) {
			a += i;
		}
		double avg = (double) a / scores.length;
		System.out.println("총점: " + a + "점");
		System.out.printf("평균: %.2f점", avg);
	}

}
