package b220106;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String croatia = bf.readLine();
		
		P2941 B = new P2941();
		String answer = String.valueOf(B.alp(croatia));
		
		bw.write(answer);
		bw.flush();
		bw.close();
		bf.close();
	}
	
	public int alp(String croatia) {
		String[] croAr = croatia.split("");
		int count = 0;
		for(int i = 0; i < croatia.length();i++) {
			if(i == croatia.length()-1) {
				count++;
				//System.out.println("마지막글자");
				//마지막 글자일 경우 다음 문자를 확인하지 않음.
			}else if((i == croatia.length()-2)&&(croAr[i].equals("d")&&croAr[i+1].equals("z"))){
				count= count+2;
				i = i + 1;
				//System.out.println("마지막은 dz");
				//마지막 2번째이면서 dz인경우 카운트+2 하고 계산을 넘어감.
			}else {
				if((croAr[i].equals("c")&&(croAr[i+1].equals("=")||croAr[i+1].equals("-")))||
						(croAr[i].equals("d")&&croAr[i+1].equals("-"))||
						(croAr[i].equals("l")&&croAr[i+1].equals("j"))||
						(croAr[i].equals("n")&&croAr[i+1].equals("j"))||
						(croAr[i].equals("s")&&croAr[i+1].equals("="))||
						(croAr[i].equals("z")&&croAr[i+1].equals("="))) {
						count++;
						//System.out.println("2글자");
						i = i + 1;
						//알파벳을 하나로 읽고 갯수만큼 넘김
					}else if((croAr[i].equals("d"))&&(croAr[i+1].equals("z"))&&(croAr[i+2].equals("="))) {
						count++;
						i = i + 2;
						//System.out.println("3글자");
						// dz= 를 하나로 읽고 2칸 넘어감.
					}else {
						count++;
						//System.out.println("한글자");
						//한글자만 카운트
					}
			}
			
		}
		return count;
	}

}

/*
package b220106;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2942_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String croatia = bf.readLine();
		
		P2942_2 B = new P2942_2();
		String answer = String.valueOf(B.alp(croatia));
		
		bw.write(answer);
		bw.flush();
		bw.close();
		bf.close();
	}
	
	public int alp(String croatia) {
		croatia = croatia.replaceAll("c=","a");
		croatia = croatia.replaceAll("c-","a");
		croatia = croatia.replaceAll("dz=","a");
		croatia = croatia.replaceAll("d-","a");
		croatia = croatia.replaceAll("lj","a");
		croatia = croatia.replaceAll("nj","a");
		croatia = croatia.replaceAll("s=","a");
		croatia = croatia.replaceAll("z=","a");
		int count = croatia.length();
		return count;
	}

}

*/