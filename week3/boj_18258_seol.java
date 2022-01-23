package queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Queue2 {
	static int[] queue;
	static int count;
	static int indexPush;
	static int indexPop;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		queue = new int[n];
		indexPush = n - 1;
		indexPop = n -1;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop() + "\n");
				break;
			case "size":
				sb.append(size() + "\n");
				break;
			case "empty":
				sb.append(empty() + "\n");
				break;
			case "front":
				sb.append(front() + "\n");
				break;
			case "back":
				sb.append(back() + "\n");
				break;
			}
		}
		System.out.println(sb);
		br.close();
	}

	static void push(int push) {
		queue[indexPush] = push;
		count++;
		indexPush--;
	}

	static int pop() {
		if (count == 0) {
			return -1;
		}
		count--;
		return queue[indexPop--];
	}

	static int size() {
		return count;
	}

	static int empty() {

		return count == 0 ? 1 : 0;
	}

	static int front() {
		if (count == 0)
			return -1;
		return queue[indexPop];
	}

	static int back() {
		if (count == 0)
			return -1;
		return queue[indexPush + 1];
	}

}
