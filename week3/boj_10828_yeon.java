import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] stack;
    public static int size;
    
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        stack = new int[cnt];
        
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
            case "push":
                push(Integer.parseInt(st.nextToken()));
                break;
            case "pop":
                sb.append(pop()).append("\n");
                break;
            case "size":
                sb.append(size()).append("\n");
                break;
            case "empty":
                sb.append(empty()).append("\n");
                break;
            case "top":
                sb.append(top()).append("\n");
                break;
            }
        }
        System.out.println(sb.toString());
        br.close();
	}
    
    public static void push(int n) {
        stack[size++] = n;
    }
    
    public static int pop() {
        if (size == 0) {
            return -1;
        }
        
        return stack[--size];
    }
    
    public static int size() {
        return size;
    }
    
    public static int empty() {
        return size == 0 ? 1 : 0;
    }
    
    public static int top() {
        if (size == 0) {
            return -1;
        }
        return stack[size - 1];
    }
}
