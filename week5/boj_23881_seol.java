package sort;

//import java.util.Arrays;
import java.util.Scanner;

public class SelectSort2 {
	// 선택정렬: 현재 인덱스와 최솟값 인덱스를 찾아서 서로 바꿔 정렬
	// 각 인덱스 마다 전체 케이스를 훑기 때문에 맨 왼쪽부터 차례대로 정렬되어 진다.
	// 평균: N^2, 최악: N^2, 메모리: N1, 안정성x
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		int K = scan.nextInt(); // 주어진 교환 횟수 K
		int changeNum = 0; // 정렬된 교환 횟수

		for (int i = 0; i < size; i++) // 배열 생성
			arr[i] = scan.nextInt();

		for (int i = size - 1; i > 0; i--) {
			int max = i;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[max] < arr[j])
					max = j; // 최대 색인 찾기
			}
			if (i != max) {
				swap(arr, i, max);
				changeNum++;
//				System.out.println(Arrays.toString(arr));
				if (K == changeNum) {
					System.out.println(arr[max] + " " + arr[i]);
					break;
				}
			}
		}

		if (K > changeNum) // 주어진 교환 횟수보다 정렬된 교환 횟수가 적다면
			System.out.println(-1);
	}

	private static void swap(int[] a, int index1, int index2) {
		// TODO Auto-generated method stub
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
}