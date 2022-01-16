package b220106;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		boolean[] bol = new boolean[26];
		
		int answer = N;
		while(N>0) {
			String st = bf.readLine();
			int len = st.length();
			Arrays.fill(bol, false); //매 단어마다 알파벳 체크를 초기화
			for(int i=1;i<len;i++) {
				//System.out.printf("%d번째 글자체크",i+1);
				if(st.charAt(i-1)!=st.charAt(i)) {
					//System.out.println("전글자와 다릅니다.");
					if(bol[st.charAt(i)-97]==true) {
						answer--;
						break;
						//97을 빼면 index값을 a는 0부터 넣을 수 있다.
					}else {
						bol[st.charAt(i-1)-97] = true;
					}
				}
				//System.out.println("전글자랑 같습니다.");
			}
			N--;
		}
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
		bf.close();	
	}
}
