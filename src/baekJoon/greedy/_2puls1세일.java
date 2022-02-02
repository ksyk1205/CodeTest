package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _2puls1ºº¿œ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Integer[] arr = new Integer[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			if(i%3==2) {
				continue;
			}
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
