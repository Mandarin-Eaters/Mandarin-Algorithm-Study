import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = Integer.parseInt(r.readLine());
        
        for (int i = 0; i < cnt; i++) {
            StringTokenizer s = new StringTokenizer(r.readLine());
            w.write(Integer.parseInt(s.nextToken()) + Integer.parseInt(s.nextToken()) + "\n");
        }
        w.flush();
        w.close();
        r.close();
	}
}