import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class spring05 {
	public static boolean check(String a, String b) {
		int k = 0, j;
		for(int i=0; i<b.length(); i++) {
			for(j=k; j<a.length(); j++) {
				if(b.charAt(i) == a.charAt(j)) {
					k = j + 1;
					break;
				} 
			}
			if( i<b.length() && j==a.length()) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("spring05.in");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		int numSet = Integer.parseInt(br.readLine());
		for(int i=1; i<=numSet; i++) {
			int num = Integer.parseInt(br.readLine());
			String[] line = new String[num+1];
			System.out.println("Data Set " + i +":" );
			for(int j=0; j<num + 1; j++) {
				line[j] = br.readLine();
			}
			for(int j=0; j<num; j++) {
				if(check(line[j].toLowerCase(), line[num].toLowerCase())) {
					System.out.println(line[j]);
				}
			}
			System.out.println();
		}
		br.close();
	}
}
