import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class fall05 {
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
		FileInputStream fis = new FileInputStream("fall05.in");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		int numSet = Integer.parseInt(br.readLine());
		for(int i=1; i<=numSet; i++) {
			System.out.println("Data Set " + i +":" );
			String line = br.readLine();
			String[] arr = line.split(" ");
			int w = Integer.parseInt(arr[0]);
			int h = Integer.parseInt(arr[1]);
			int r = Integer.parseInt(arr[2]);
			int d = Integer.parseInt(arr[3]);
			int a1 = Integer.parseInt(arr[4]);
			int a2 = Integer.parseInt(arr[5]);
		    System.out.println(line);
			System.out.println();
		}
		br.close();
	}

}
