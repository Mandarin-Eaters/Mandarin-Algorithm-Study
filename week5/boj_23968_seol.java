package sort;

import java.util.Arrays;
//import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	// 버블정렬: 배열을 순차적으로 돌면서 다음인덱스가 현재 인덱스보다 큰 경우 계속해서 뒤로 이동시킴
	// 1회차를 다 돌았을 때 가장 큰 수는 맨 뒤에 위치하게 되어 있음
	// 평균: N^2, 최악: N^2, 메모리: N1, 안정성o
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		int K = scan.nextInt(); // 주어진 교환 횟수 K
		int changeNum = 0; // 정렬된 교환 횟수

		for (int i = 0; i < size; i++) // 배열 생성
			arr[i] = scan.nextInt();

		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					changeNum++;
					if (changeNum == K) {
						System.out.println(arr[j] + " " + arr[j + 1]);
					}
				}
//				System.out.println(Arrays.toString(arr));
			}
		}
		if (changeNum < K)
			System.out.println(-1);
	}
}
