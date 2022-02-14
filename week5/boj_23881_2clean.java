package p23881;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// 선택정렬
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
			
			for(int i = A.length-1; i > 0;i--) {
				int max_index = i;
				
				for(int j = i-1;j>=0;j-- ) {
					if(A[max_index]<A[j]) {
						max_index = j;
					}
				}
				if(i==max_index) {
					continue;
				}else {
					swap(A,i,max_index);
					swap_count++;
					if(K==swap_count) {
						System.out.printf(A[max_index]+" "+A[i]);
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

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		try {
//			StringTokenizer st = new StringTokenizer(br.readLine()," ");
//			int [] A = new int[Integer.parseInt(st.nextToken())];
//			int K = Integer.parseInt(st.nextToken());
//			int swap_count = 0;
//			st = new StringTokenizer(br.readLine()," ");
//			for(int i = 0; i<A.length;i++) {
//				A[i] = Integer.parseInt(st.nextToken());
//			}
//			
//			for(int i = 0; i < A.length-1;i++) {
//				int min_index = i;
//				
//				for(int j = i+1;j<A.length;j++ ) {
//					if(A[min_index]>A[j]) {
//						min_index = j;
//					}
//				}
//				if(i==min_index) {
//					continue;
//				}else {
//					swap(A,i,min_index);
//					swap_count++;
//					if(K==swap_count) {
//						System.out.printf(A[i]+" "+A[min_index]);
//					}
//				}
//			}
//			if(K>swap_count) {
//				System.out.println(-1);
//			}
//			br.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public static void swap(int [] A,int i,int j) {
//		int temp = A[i];
//		A[i] = A[j];
//		A[j] = temp;
//	}
//}
