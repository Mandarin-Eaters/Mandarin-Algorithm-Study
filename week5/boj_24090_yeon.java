import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int swapCnt = 0;
    public static int standCnt;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int length = Integer.parseInt(st.nextToken());
        standCnt = Integer.parseInt(st.nextToken());
        
        int[] nums = new int[length];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        quickSort(nums, 0, length - 1);
        
        if (swapCnt < standCnt) {
            System.out.println(-1);
        }
    }
    
    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        
        int pivot = partition(nums, left, right);
        quickSort(nums, left, pivot - 1);
        quickSort(nums, pivot + 1, right);
    }
    
    public static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                swapCnt++;
                if (swapCnt == standCnt) {
                    System.out.printf("%d %d", nums[i], nums[j]);
                }
                i++;
            }
        }
        
        if (i != right) {
            swap(nums, i, right);
            swapCnt++;
            if (swapCnt == standCnt) {
                System.out.printf("%d %d", nums[i], nums[right]);
            }   
        }
        
        return i;
    }
    
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}