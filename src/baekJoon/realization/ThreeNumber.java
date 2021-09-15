package baekJoon.realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*세 정수 A, B, C가 주어진다. 
 * 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. */

public class ThreeNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);

	}

}
