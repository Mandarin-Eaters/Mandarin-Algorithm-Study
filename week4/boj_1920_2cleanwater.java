package p1920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N_num = Integer.valueOf(br.readLine());
			int [] arr = new int[N_num];
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<N_num;i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}// N arr에 입력받기
			Arrays.sort(arr); // 어레이 정렬
			// 듀얼피봇 퀵정렬
			int M_num = Integer.valueOf(br.readLine());
			st = new StringTokenizer(br.readLine()," ");
			// M의 요소를 입력받고 for문으로 하나씩 체크 후 1,0 출력
			for(int i=0;i<M_num;i++) {
				if (Main.search(arr,Integer.valueOf(st.nextToken()))) {
					bw.write(1+"\n");
				} else {
					bw.write(0+"\n");
				}
			}
			bw.flush();
			bw.close();
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean search(int[] arr, int num) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			
			if(num<arr[mid]) {
				right=mid-1;
			} 
			else if(num>arr[mid]) {
				left=mid+1;
			} else {
				return true;
			}	
		}
		return false;
	}
}
