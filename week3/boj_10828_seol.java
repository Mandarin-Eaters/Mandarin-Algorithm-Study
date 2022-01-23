package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack2 {
	// static을 사용하는 이유는 각 메소드들을 참조하기 위해서는 main에서 클래스타입의 참조변수를 만들어서 호출해야 한다.
	// 따라서 클래스변수 static을 각 메소드들에서 stack과 count를 사용하기 위해서는 메소드들도 static 제한자를 사용해야 한다.
	static int[] stack;
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		stack = new int[n];

		// StringBuilder vs StringBuffer => 동기화의 차이 동기화없음 vs 동기화있음
		// 멀티스레드환경에서 사용하는 것이 아니라면 메모리할당을 적게 하는 StringBuilder를 사용하는게 좋다.
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
//				push(Integer.parseInt(br.readLine())); //br.readLine()을 사용하게 되면 push 1을 하나로 읽게 된다.
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop() + "\n");
//				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size() + "\n");
//				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty() + "\n");
//				sb.append(empty()).append("\n");
				break;
			case "top":
				sb.append(top() + "\n");
//				sb.append(top()).append("\n");
				break;
			}
		}
		System.out.println(sb);
		br.close();

	}

	static void push(int push) { // push를 하고나서 다음 stack을 위해 인덱스(count 값)를 1증가를 하였다.
		stack[count] = push;
		count++;
	}

	// 따라서 pop을 할때 주의 해야한다. 즉 push를 1번하면 count는 1이된다.
	// 이상태에서 pop을 하면 stack[0]을 리턴한다. (count=0인 상태)
	// 연속으로 pop을 하면 if(count==0)에 걸리므로 return -1을 한다. (현재 스택 비어있음)
	static int pop() {
		if (count == 0) {
			return -1;
		}
		return stack[--count];
	}

	static int size() {
		return count;
	}

	static int empty() {
		if (count == 0) {
			return 1;
		} else
			return 0;
	}

	// 맨 위의 스택값은 0부터 시작하므로 count-1값이다.
	// stack[--count]는 stack[count-1]과 완전히 다른 개념이다.
	// 전자는 count값 자체를 감소하고, 후자는 count자체에는 영향을 주지 않는다.
	static int top() {
		if (count == 0)
			return -1;
		else
			return stack[count - 1];
	}
}