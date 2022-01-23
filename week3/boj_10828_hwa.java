package baekjoon;
import java.util.Scanner;
public class boj_10828_hwa {
 
	public static int[] stack;		//초기 공간 할당 x 
	public static int size = 0;//실제 데이터의 개수 
 
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();//변경할 수 있는 문자열 
		
		int N = in.nextInt();
 
		stack = new int[N];//14개를 넣겠다
		
		for(int i = 0; i < N; i++) {
        
			String str = in.next();
 
			switch (str) {
            
			case "push":
				push(in.nextInt());
				break;
                
			case "pop":
				sb.append(pop()).append('\n');	
				break;
                
			case "size":
				sb.append(size()).append('\n');
				break;
                
			case "empty":
				sb.append(empty()).append('\n');
				break;
                
			case "top":
				sb.append(top()).append('\n');
				break;
			}
 
		}
		System.out.println(sb);
	}
	//스택의 맨 위에 요소를 추가
	public static void push(int item) {
		stack[size] = item;	// 마지막 위치(맨위에 item)추가
		size++;//사이즈가 1 추가됨
	}
    //스택 맨 위에 있는 요소를 제거 하고 제거 된 요소를 반환
	public static int pop() {
		if(size == 0) {	//삭제할 요소가 없다면 
			return -1;// -1을 출력 
		}
		else {
			int res = stack[size - 1];//가장 위에 있는 정수를 빼고 
			stack[size - 1] = 0;
			size--;//사이즈 1감소
			return res;
		}
	}
    //스택의 요소 개수를 반환
	public static int size() {
		return size;
	}
    //스택에 요소가 비어있는지를 반환(요소가 없을경우 {@code true}, 그 외의 경우 {@code false}를 반환)
	public static int empty() {
		if(size == 0) {// 스택이 비어있으면 true, 있으면 false
			return 1;
		}
		else {
			return 0;
		}
	}
    
	public static int top() {
		if(size == 0) { //데이터가 없으면 -1
			return -1;
		}
		else {
			return stack[size - 1];// 마지막 원소의 인덱스는 size보다 1작다. 
	}
	}
}
 