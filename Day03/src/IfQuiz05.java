import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int korean = sc.nextInt();
		
		System.out.print("영어 점수: ");
		int english = sc.nextInt();
		
		System.out.print("수학 점수: ");
		int math = sc.nextInt();
		
		double avg = (korean + english + math) / 3.0;
		String point;
		
		System.out.printf("평균 점수: %.1f\n", avg);
		if (avg >= 90) {
			if (avg <= 94) {
				point = "A0";
			} else {
				point = "A+";
			}
		} else if (avg >= 80) {
			point = "B";
		} else if (avg >= 70) {
			point = "C";
		} else if (avg >= 60) {
			point = "D";
		} else {
			point = "F";
		}
		
		System.out.println("당신의 학점은 " + point +" 입니다.");
		
		sc.close();
		
	}

}
