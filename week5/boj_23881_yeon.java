import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int length = Integer.parseInt(st.nextToken());
        int standCnt = Integer.parseInt(st.nextToken());
        int swapCnt = 0;
        
        int[] nums = new int[length];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = length - 1; i > 0; i--) {
            int maxIndex = i;
            
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            
            if (i != maxIndex) {
                int temp = nums[i];
                nums[i] = nums[maxIndex];
                nums[maxIndex] = temp;
                swapCnt++;
                if (swapCnt == standCnt) {
                    System.out.println(nums[maxIndex] + " " + nums[i]);
                }
            }
        }
        
        if (swapCnt < standCnt) {
            System.out.println(-1);
        }
    }
}