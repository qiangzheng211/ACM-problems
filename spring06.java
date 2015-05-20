import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class spring06 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("spring06.in");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		int numSet = Integer.parseInt(br.readLine());
		for(int i=1; i<=numSet; i++) {
			boolean flag = true;
			int num = Integer.parseInt(br.readLine()) - 1;
			if(num == 0) {
				System.out.println("Possible");
				System.out.println();
				continue;
			}
			int[] line = new int[num];
			System.out.println("Data Set " + i +":" );
			int win = Integer.parseInt(br.readLine());
			for(int j=0; j<num; j++) {
				line[j] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(line);
			win +=  line[num-1] / 2;
			for(int j=0; j<(num/2); j++) {
				int temp = (line[j] + line[num-j-1]) / 2;
				if(win < temp) {
					flag = false;
					break;
				}
			}
					
			if(flag) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
			System.out.println();
		}
		br.close();
	}

}
