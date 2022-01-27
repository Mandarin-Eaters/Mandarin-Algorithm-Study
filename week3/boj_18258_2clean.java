package b220119;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P18258 {
	//큐 자료구조 : 선입선출
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;;
		LinkedList<String> list = new LinkedList<String>(); // 큐
		try {
			int N = Integer.valueOf(br.readLine());
			while(N>0) {//N번 명령을 수행
				st = new StringTokenizer(br.readLine()+" ");
				switch(st.nextToken()) {
				case "push":
					list.add(st.nextToken());
					break;
				case "pop":
					if(list.isEmpty()) {
						bw.write("-1\n");
					} else {
						bw.write(list.get(0)+"\n");
						list.remove(0);
					}
					break;
				case "size":
					bw.write(String.valueOf(list.size())+"\n");
					break;
				case "empty":
					if(list.isEmpty()) {
						bw.write("1\n");
					} else {
						bw.write("0\n");
					}
					break;
				case "front":
					if(list.isEmpty()) {
						bw.write("-1\n");
					} else {
						bw.write(list.get(0)+"\n");
					}
					break;
				case "back":
					if(list.isEmpty()) {
						bw.write("-1\n");
					} else {
						bw.write(list.get(list.size()-1)+"\n");
					}
					break;		
				default:
				}	
				N--;
			}
            bw.flush();
			bw.close();
			br.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


//		Deque<String> list = new LinkedList<String>(); // 큐
//		try {
//			int N = Integer.valueOf(br.readLine());
//			while(N>0) {//N번 명령을 수행
//				st = new StringTokenizer(br.readLine()+" ");
//				switch(st.nextToken()) {
//				case "push":
//					list.add(st.nextToken());
//					break;
//				case "pop":
//					if(list.isEmpty()) {
//						bw.write("-1\n");
//					} else {
//						bw.write(list.getFirst()+"\n");
//						list.poll();
//					}
//					break;
//				case "size":
//					bw.write(String.valueOf(list.size())+"\n");
//					break;
//				case "empty":
//					if(list.isEmpty()) {
//						bw.write("1\n");
//					} else {
//						bw.write("0\n");
//					}
//					break;
//				case "front":
//					if(list.isEmpty()) {
//						bw.write("-1\n");
//					} else {
//						bw.write(list.getFirst()+"\n");
//					}
//					break;
//				case "back":
//					if(list.isEmpty()) {
//						bw.write("-1\n");
//					} else {
//						bw.write(list.getLast()+"\n");
//					}
//					break;
//				default:
//				}		
//				N--;
//				
//			}
//			bw.flush();
//			bw.close();
//			br.close();
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}


