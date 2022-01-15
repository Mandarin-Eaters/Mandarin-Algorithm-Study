import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String st = sc.nextLine();
		
		for(int i=0; i<str.length; i++) {
			if(st.contains(str[i])) // contains() : 해당 문자열이 존재하면 true 아니면 false
				st = st.replace(str[i], "!");  // replace([기존문자], [바꿀문자])
		}
		
		System.out.println(st.length());
	}
}
