import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12, 13, 14}
		};
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(arr[1][1]);
		
//		2차원 배열을 전부 출력하려면
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println("-----------");
		
//		빈 2차원 배열 만들기
		int[][] arr2 = new int[3][4];
		System.out.println(Arrays.deepToString(arr2));
		
//		2차원배열에 값 넣기
		arr2[1][2] = 50;
		arr2[2][1] = 70;
		
		for (int[] array : arr2) {
			for (int n : array) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}