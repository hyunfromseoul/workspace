import java.util.Scanner;

//섭씨를 입력받아서 화씨로 변환시킬 것
public class CeltoFahr {

	public static void main(String[] args) {
		// 사용자에게 섭씨 온도를 입력받아서
		// 화씨 온도로 변환하여 출력하는 로직을 작성
		//화씨 온도는 소수점 첫째자리까지 표현해주시기 바랍니다
		// ℃ ㄹ한자7 , ㄹ한자 다음장 4 ℉
		//섭씨 * 1.8 + 32 가 공식
		Scanner sc = new Scanner(System.in);
		int cel = 0;
		System.out.println("섭씨 온도를 입력하세요");
		
		cel = sc.nextInt();
		double fahr = (cel*1.8) + 32;
		
		System.out.printf("입력한 섭씨: %d℃\n", cel);
		System.out.printf("변환된 화씨: %.1f℉\n", fahr);
		
		sc.close();
//		System.out.println(cel + "℃ 를 화씨로 변환합니다.");
//		System.out.printf("%.1f", result);
//		System.out.print("℉");
		// printf 로 쉽게 표현이 가능하지 않을까??
		//끝
		
	}

}
