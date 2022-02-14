package p24090;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//퀵정렬
	public static int K;
	public static int swap_count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int [] A = new int[Integer.parseInt(st.nextToken())];
			K = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine()," ");
			for(int i = 0; i<A.length;i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			quick_sort(A,0,A.length-1);
			
			if(K>swap_count) {
				System.out.println(-1);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void swap(int[] A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp; 
	}

	private static void quick_sort(int[] A, int left, int right) {
		
		if(left >= right) {
			return;
		}

		int pivot = partition(A, left, right);	
		quick_sort(A, left, pivot - 1);
		quick_sort(A, pivot + 1, right);
	}
	
	
	private static int partition(int[] A, int left, int right) {
		
		int i = left;
		int x = A[right];
		
		for(int j = left;j<right;j++) {
			if(A[j]<x) {
				swap(A,i,j);
				swap_count++;
				if (K==swap_count) {
					System.out.print(A[i]+" "+A[j]);
				}
				i++;
			}
		}
		
		if(i!=right) {
			swap(A,i,right);
			swap_count++;
			if (K==swap_count) {
				System.out.print(A[i]+" "+A[right]);
			}
		}
		return i;
	}
}