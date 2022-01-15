import java.util.Scanner;

public class Main {
	// 같은 단어가 아니거나, 같은단어면 연속적이어야 한다.
	// 만약 같은단어가 불연속적으로 등장했을 경우는 그룹단어로 포함하지 않는다.
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		char[] arr = new char[100];
		int sum = 0;
		int n = sn.nextInt();
		for (int i = 0; i < n; i++) {
			arr = sn.next().toCharArray();
			sum += select(arr, arr.length);
		}
		System.out.println(sum);

	}

	static int select(char a[], int len) {
		int key = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (a[i] == a[j]) {	// a[i번째] 값과 배열a의 전체값을 비교하여 값이 같다면
					key = j - i;	// j를 조건 0으로 주게 되면 i랑 인덱스가 같아져서 같은 해당 값을 갖는다.
					if (key > 1)	// 따라서 j-i >1이라는 말은 최소 인덱스 3개를 갖는데, 이는 연속된 배열3개 이상을 의미한다.
						if (a[j - 1] != a[j])	// 이때 이전 인덱스의 해당 값과 현재 인덱스의 해당 값이 같지 않으면 0을 반환한다.
							return 0;
				}
			}
		}
		return 1;
	}
}
//만약 key 값이 1일 경우 비교 대상 인덱스는 2개뿐이고 그것은 서로 연속된 수이기 때문에 당연히 그룹단어에 속한다. 
//1보다 커야 최소 3개의 배열 값으로 구분하게 된다.
//예를 들면 aaa인지 aba인지 확인을 할 수 있다. aba라면 그룹단어가 아니기 때문에 return 0 을 받는다.
//key값이 0이라면 같은 인덱스 값이고, 1이라면 서로 연속된 값이라 비교할 필요가 없이 a[i] == a[j]라는 조건 하에 그룹단어이기 때문이다.