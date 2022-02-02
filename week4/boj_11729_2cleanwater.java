package p11729;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	static BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		try {
			br.write(String.valueOf(count(n))+"\n");
			Main.Hanoi(n, 1, 3, 2);
			br.flush();
			br.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Hanoi(int n, int a, int b, int c) throws IOException {
		// a = 출발 지점, b = 도착지점, c = 남는 봉
		if(n<=1) {
			br.write(a+" "+b+"\n");
			return;
		}
		Hanoi(n-1,a,c,b); // 전체 출발 봉 a=> 남는 봉 c에 우선 옮김
		br.write(a+" "+b+"\n"); // a에서 가장 마지막 원판을 도착지 b로 옮김
		Hanoi(n-1,c,b,a); // c에 있는 원판을 b로 옮겨 b에 완성	
	}
	
	public static int count(int n) {
		// count는 n-1 *2 + 1
		if(n<=1) {
			return 1;
		}
		return count(n-1)*2+1;
	}
}
