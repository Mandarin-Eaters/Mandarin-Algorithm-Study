import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] queue;
    public static int front = 0;
    public static int back = 0;
    public static int size = 0;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int cnt = Integer.parseInt(br.readLine());
        queue = new int[cnt];
        
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
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
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
        
        System.out.println(sb.toString());
        br.close();
    }
    
    public static void push(int data) {
        queue[back++] = data;
        size++;
    }
    
    public static int pop() {
        if (empty() == 1) {
            return -1;
        }
        int ret = queue[front++];
        size--;
        
        return ret;
    }
    
    public static int size() {
        return size;
    }
    
    public static int empty() {
        return size == 0 ? 1 : 0;
    }
    
    public static int front() {
        if (empty() == 1) {
            return -1;
        }
        
        return queue[front];
    }
    
    public static int back() {
        if (empty() == 1) {
            return -1;
        }
        
        return queue[back - 1];
    }
}