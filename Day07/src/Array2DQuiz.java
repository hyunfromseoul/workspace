import java.util.Arrays;
import java.util.Iterator;

public class Array2DQuiz {

	public static void main(String[] args) {
		int[][] score = {
				{79, 80, 99}, //A학생
				{95, 85, 89}, //B학생
				{90, 65, 56}, //C학생
				{69, 78, 77} //D학생
				//과목은 3과목
		};
		String[] stuName = {"A학생", "B학생", "C학생", "D학생" };
		String[] subName = {"국어", "영어", "수학"};
		
//		1. 각 학생의 평균을 소수점 첫째 자리까지 출력해보세요.
//		평균
		double[] avg = new double[score.length];
		int temp = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				temp += score[i][j];
			}
			avg[i] = (double) temp / score[i].length;
			temp = 0;
		}
		System.out.println("1. 각 학생의 평균은 아래와 같습니다. (소수점 첫번째 자리까지 출력)");
		for (int i = 0; i < stuName.length; i++) {
			System.out.printf("%s: %.1f점\n", stuName[i], avg[i]);	
		}
		System.out.println();
		//		2. 각 과목의 평균을 출력해보세요.
		for (int i = 0; i < subName.length; i++) {
			int total = 0;
			for (int j = 0; j < stuName.length; j++) {
				total += score[j][i];
			}
			double avgTwo = (double) total / stuName.length;
			System.out.printf("%s의 평균점수: %.1f점\n", subName[i], avgTwo);
		}
		//		3. 반 평균을 출력해보세요. (모든 학생들의 평균의 평균)
		
		
	}

}
