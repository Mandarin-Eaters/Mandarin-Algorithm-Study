import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// buffer를 이용한 합산
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/* 
		 * String s = bf.readline();으로 string으로 받은뒤
		 * String array[] = s.split(" "); 식으로 데이터를 받는다.
		 */
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 1; i<=T; i++){
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
