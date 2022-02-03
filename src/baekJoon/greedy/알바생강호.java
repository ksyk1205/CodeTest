package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알바생강호 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine()); 
		}
		
		arr = Arrays.stream(arr)
				.boxed()
				.sorted((o1, o2) -> o2-o1)
				.mapToInt(Integer::intValue)
				.toArray();
		
		long sum = 0;
		for(int i=0; i<N; i++) {
			int tip = arr[i]-((i+1)-1);
			sum += tip>0? tip : 0;
		}
		System.out.println(sum);
		
		
	}
}
