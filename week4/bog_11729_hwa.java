package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
 
public class bog_11729_hwa  {
 
	 
		static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 //자바에서 데이터는 stream을 통해 입출력 
	//new 키워드를 통해 기본 사이즈의 입력 버퍼를 사용하는 저장이 가능한 문자 입력 스트림 생성합니다.
	//BufferedWriter의 또 다른 생성자인 BufferedWriter(Writer out, int sz) 를 이용하면
	//이용하면 버퍼의 크기를 지정할 수 있습니다.
		//OutputStream(byte)을 Writer(char)로 변경한다.
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
			int N = Integer.parseInt(br.readLine());
	 
			bw.write((int) (Math.pow(2, N) - 1) + "\n");
			//Math.pow : 거듭 제곱구하기, 2의 n제곱 에서 -1
			// 마지막 제일 큰 원판은 A에서 C로 한번만 옮겨지고(-1) 나머지는 A에서 B로 
			//B에서 C로 두번씩 옮겨지기 때문에 모두 두번씩 곱게 된다.
	 
			Hanoi(N, 1, 2, 3);
			
			bw.flush();//남아있는 데이터를 모두 출력, 버퍼를 비우는 기능
			//(데이터가 축적되는 과정에서 프로그램에 예기치 못하게 꺼져버린다면 버퍼가 비워지지 못해서 
			//데이터가 전해지지 않고 그대로 유실되어 이를 커버하기 위해 사용
			bw.close();//스트림 닫음 
		}
	 
		/*
			N : 원판의 개수 
			start : 출발지 
			mid : 옮기기 위해 이동해야 장소 
			to : 목적지
		 */
	 
		public static void Hanoi(int N, int start, int mid, int to) throws IOException {
			// 이동할 원반의 수가 1개라면?
			if (N == 1) {
				bw.write(start + " " + to + "\n");
				return;
			}
	 
			// A -> C로 옮긴다고 가정할 떄,
			// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
			Hanoi(N - 1, start, to, mid);
	    
			// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
			bw.append(start + " " + to + "\n");
	    
			// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
			Hanoi(N - 1, mid, start, to);
	 
		}
	}