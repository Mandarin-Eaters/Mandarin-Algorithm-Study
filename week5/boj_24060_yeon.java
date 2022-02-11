import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int storeCnt = 0;
    public static int standCnt;
    public static int[] sorted;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int length = Integer.parseInt(st.nextToken());
        standCnt = Integer.parseInt(st.nextToken());
        
        int[] nums = new int[length];
        sorted = new int[length];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        mergeSort(nums, 0, length - 1);
        
        if (storeCnt < standCnt) {
            System.out.println(-1);
        }
    }
    
    public static void mergeSort(int[] nums, int left, int right) {
        if (left == right) {
            return;
        } 
        
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
    
    public static void merge(int[] nums, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;
        
        while (l <= mid && r <= right) {
            if (nums[l] <= nums[r]) {
                sorted[idx++] = nums[l++];
            } else {
                sorted[idx++] = nums[r++];
            }
        }
        
        while (l <= mid) {
            sorted[idx++] = nums[l++];
        }
        
        while (r <= right) {
            sorted[idx++] = nums[r++];
        }
        
        for (int i = left; i <= right; i++) {
            nums[i] = sorted[i];
            storeCnt++;
            if (storeCnt == standCnt) {
                System.out.println(nums[i]);
            }
        }
    }
}