package p24051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//삽입정렬
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int [] A = new int[Integer.parseInt(st.nextToken())];
			int K = Integer.parseInt(st.nextToken());
			int swap_count = 0;
			st = new StringTokenizer(br.readLine()," ");
			for(int i = 0; i<A.length;i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 1; i <  A.length;i++) {
				int t = A[i];
				int j = i-1;
				
				while(j>=0 && t<A[j]) { //모든 원소 한칸씩 미루기
					A[j+1] = A[j];
					swap_count++;
					if(K==swap_count) {
						System.out.println(A[j]);
					}
					j--;
				}
				if(j+1 != i) {
					A[j+1] = t;
					swap_count++;
					if(K==swap_count) {
						System.out.println(A[j]);
					}
				}
			}

			if(K>swap_count) {
				System.out.println(-1);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}