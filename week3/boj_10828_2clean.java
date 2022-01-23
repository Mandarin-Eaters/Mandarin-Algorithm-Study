package b220119;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P10828 {
	//스택 자료구조 : 후입선출
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;;
		String s = null; //토큰 저장
		ArrayList<String> list = new ArrayList<String>(); // 스택
		try {
			int N = Integer.valueOf(br.readLine());
			while(N>0) {//N번 명령을 수행
				st = new StringTokenizer(br.readLine()+" ");
				s = st.nextToken();
				boolean check = list.isEmpty();//list가 비어있으면 true
				int index = list.size()-1;
				
				switch(s) {
				case "push":
					list.add(st.nextToken());
					break;
				case "pop":
					if(check) {
						bw.write("-1\n");
					} else {
						bw.write(list.get(index)+"\n");
						list.remove(index);
					}
					break;
				case "size":
					bw.write(String.valueOf(list.size())+"\n");
					break;
				case "empty":
					if(check) {
						bw.write("1\n");
					} else {
						bw.write("0\n");
					}
					break;
				case "top":
					if(check) {
						bw.write("-1\n");
					} else {
						bw.write(list.get(index)+"\n");
					}
					break;
				default:
				} //368ms
				
//				if(s.equals("push")) {
//					list.add(st.nextToken());
//				} else if (s.equals("pop")) {
//					if(check) {
//						bw.write("-1\n");
//					} else {
//						bw.write(list.get(index)+"\n");
//						list.remove(index);
//					}
//				} else if (s.equals("size")) {
//					bw.write(String.valueOf(list.size())+"\n");
//				} else if (s.equals("empty")) {
//					if(check) {
//						bw.write("1\n");
//					} else {
//						bw.write("0\n");
//					}
//				} else if (s.equals("top")) {
//					if(check) {
//						bw.write("-1\n");
//					} else {
//						bw.write(list.get(index)+"\n");
//					}
//				} //404ms
				
				N--;
				bw.flush();
			}
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
