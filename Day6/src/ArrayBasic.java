import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		int[] iArr = new int[3];
		double[] dArr = new double[3];
		String[] sArr = new String[3];
		char[] cArr = new char[3];
		
//		배열은 생성됨과 동시에 각 타입의 기본값으로 자동 초기화된다
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(cArr));
		System.out.println(Arrays.toString(iArr));
		
		//배열 생성/초기화
		char[] letters = new char[] {'A', 'B', 'C', 'D'};
		System.out.println(Arrays.toString(letters));
		
		//선언 동시에 초기화
		String[] names = { "1", "2", "3" };
		System.out.println(Arrays.toString(names));
		//기존의 배열의 크기를 변경 불가능
		//names = { "1" };
		//⭐⭐⭐⭐⭐⭐⭐⭐새로운 객체를 갖다 넣는거는 가능⭐⭐⭐⭐⭐⭐
		names = new String[] {"바뀐것", "넣자"};
		System.out.println(Arrays.toString(names));
	}

}
