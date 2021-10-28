import java.util.Iterator;

public class MethodExample2 {
// 매개변수 (parameter, argument) 
//	1. 매개변수는 메서드를 호출할 때, 메서드 실행에 필요한 값들을
//	메서드 내부로 전달하는 매개체 역할을 합니다.
	
//	2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라
//	메서드의 실행 결과는 달라질 수 있습니다.
	
	static int calcRangeTotal(int start, int end) {
		int total = 0;
		for (int i = start; i <= end; i++) {
			total += i;
		}
		return total;
	}
	
//	메소드명 뒤에 괄호 (파라미터, 인자값)이 없으면 변수로 인식해서
//	메소드로써 사용이 불가능하므로 주의
	static String selectRandomFood() {
		double rn = Math.random();
		if(rn > 0.66) {
			return "치킨";
		} else if (rn > 0.33) {
			return "족발";
		} else {
			return "삼겹살";
		}
	}
	
	static int calcNumberTotal(int[] x) {
		int total = 0;
		for (int i : x) {
			total += i;
		}
		return total;
	}
	
//	가변인수 (가변 파라미터)를 사용한 매개변수 작성
//	콤마로 나열되어 들어오는 여러 개의 값을 배열로 묶어서 내부로 전달합니다
	static int calcNumberTotalTwo(int... nums) {
		int total = 0;
		for (int i : nums) {
			total += i;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(calcRangeTotal(1, 10));
		int result = calcRangeTotal(1, 10);
		System.out.println(result);
//		calcRangeTotal(start, end)
		
		System.out.println("오늘 점심 뭐먹지???: " + selectRandomFood());
		
		int[] arr = {10, 30, 50, 70, 90, 110};
		int sum = calcNumberTotal(arr);
		System.out.println("누적합: " + sum);
		
		sum = calcNumberTotal(new int[] {1,2,3,4,5,6,7});
		System.out.println("누적합: " + sum);
		
		sum = calcNumberTotalTwo(1,2,3,4,5,6,7,8);
		System.out.println(sum);
	}

}
