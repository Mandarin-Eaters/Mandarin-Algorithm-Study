package p24060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//병합정렬
	public static int K;
	public static int swap_count = 0;
	public static int [] temp;
	
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
			temp = new int[A.length];
			merge_sort(A,0,A.length-1);
			

			if(K>swap_count) {
				System.out.println(-1);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void merge(int[]A,int left, int mid, int right) {
		int l = left;
		int r = mid +1;
		int index = left;
		
		while(l<=mid && r<=right) {
			if(A[l] <= A[r]) {
				temp[index] = A[l];
				index++;
				l++;
			}else {
				temp[index] = A[r];
				index++;
				r++;
			}
		}
		if(l>mid) {
			while(r <= right) {
				temp[index] = A[r];
				index++;
				r++;
			}
			
		} else {
			while(l <= mid) {
				temp[index] = A[l];
				index++;
				l++;
			}
		}
		
		for(int i = left; i <= right; i++) {
			A[i] = temp[i];
			swap_count++;
			if (K==swap_count) {
				System.out.println(A[i]);
			}
		}
	}
	
	public static void merge_sort(int A[], int left, int right) { //
		if(left == right) return;
		int mid = (left +right)/2;
		merge_sort(A,left,mid);
		merge_sort(A,mid+1,right);
		merge(A, left, mid, right);
	}
}
