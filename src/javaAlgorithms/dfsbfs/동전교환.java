package javaAlgorithms.dfsbfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
	static int N, M;
	static int answer = Integer.MAX_VALUE;
	private static void DFS(int num, int sum, Integer[] arr) {
		if(sum>M)return;
		if(num>=answer) return;
		
		if(sum == M) {
			answer = Math.min(answer, num);
			return;
		}else {
			for(int i=0; i<N; i++) {
				DFS(num+1, sum+arr[i], arr);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		N = sc.nextInt();
		Integer[] arr = new Integer[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		M = sc.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());
		DFS(0, 0, arr);
		System.out.println(answer);
	}

	
}
