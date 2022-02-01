import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        sb.append((int)Math.pow(2, num) - 1).append("\n");
        
        hanoi(num, 1, 2, 3);
        
        System.out.println(sb.toString());
        
    }
    
    public static void hanoi(int n, int start, int mid, int to) {
        if (n == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        
        hanoi(n - 1, start, to, mid);
        
        sb.append(start + " " + to + "\n");
        
        hanoi(n - 1, mid, start, to);
    }
}