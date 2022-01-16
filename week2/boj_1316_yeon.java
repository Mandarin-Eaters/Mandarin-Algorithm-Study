import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int groupNums = 0;
        
        for (int i = 0; i < cnt; i++) {
            boolean[] checks = new boolean[26];
            String s = br.readLine();
            boolean isGroup = true;

            for (int j = 0; j < s.length(); j++) {
                if (checks[s.charAt(j) - 'a']) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        isGroup = false;
                        break;
                    }
                } else {
                    checks[s.charAt(j) - 'a'] = true;
                }
            }
            
            if (isGroup) {
                groupNums++;
            }
        }
        
        System.out.println(groupNums);
    }
}