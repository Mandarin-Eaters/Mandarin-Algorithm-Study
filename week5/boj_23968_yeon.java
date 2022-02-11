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
        int swapCnt = 0;
        
        int[] nums = new int[length];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapCnt++;
                    if (swapCnt == standCnt) {
                        System.out.println(nums[j] + " " + nums[j + 1]);
                    }
                }
            }
        }
        
        if (swapCnt < standCnt) {
            System.out.println(-1);
        }
    }
}