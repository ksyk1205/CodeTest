package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class º≠∞≠±Ÿ¿∞∏« {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] arr = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Long.parseLong(st.nextToken());			
		}
		
		Arrays.sort(arr);
		long max = 0;
		if(N%2==0) {
			for(int i=0; i<N/2; i++) {
				max = Math.max(max, arr[i]+arr[N-i-1]);
			}
		}else {
			max = arr[N-1];
			for(int i=0; i<(N-1)/2; i++) {
				max = Math.max(max, arr[i]+arr[N-i-2]);
			}
		}
		System.out.println(max);
	}
}
