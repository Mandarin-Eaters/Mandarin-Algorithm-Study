package p23968;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//버블정렬
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
				for(int j = 0;j< A.length-i;j++ ) {
					if(A[j]>A[j+1]) {
						swap(A,j,j+1);
						swap_count++;
						if(K==swap_count) {
							System.out.printf(A[j]+" "+A[j+1]);
							}
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
	
	public static void swap(int [] A,int i,int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
