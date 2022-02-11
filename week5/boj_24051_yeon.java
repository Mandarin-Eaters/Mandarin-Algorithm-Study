import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int length = Integer.parseInt(st.nextToken());
        int standCnt = Integer.parseInt(st.nextToken());
        int storeCnt = 0;
        
        int[] nums = new int[length];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 1; i < length; i++) {
            int target = nums[i];
            
            int j = i - 1;
            while (j >= 0 && target < nums[j]) {
                nums[j + 1] = nums[j];
                storeCnt++;
                if (storeCnt == standCnt) {
                    System.out.println(nums[j]);
                }
                j--;
            }
            
            if (j + 1 != i) {
                nums[j + 1] = target;
                storeCnt++;
                if (storeCnt == standCnt) {
                    System.out.println(target);
                }
            }
        }
        
        if (storeCnt < standCnt) {
            System.out.println(-1);
        }
    }
}