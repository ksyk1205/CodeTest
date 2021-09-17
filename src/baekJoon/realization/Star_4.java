package baekJoon.realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., 
 * N번째 줄에는 별 1개를 찍는 문제
*/

public class Star_4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int z=0; z<N-i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
