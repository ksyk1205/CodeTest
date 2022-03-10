package javaAlgorithms.sortingSearching;

import java.util.Scanner;

public class LeastRecentlyUsed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[M];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int num : solution(N, M, arr)) {
			System.out.print(num + " ");
		}
	}

	private static int[] solution(int n, int m, int[] arr) {
		int[] cache = new int[n];
		
		for(int num : arr) {
			int pos = -1;
			for(int i=0; i<n; i++) {
				if(cache[i] == num) {
					pos = i;
				}
			}
			if(pos == -1) {
				for(int i=n-1; i>=1; i--) {
					cache[i] = cache[i-1];
				}
			}else {
				for(int i=pos; i>=1; i--) {
					cache[i] = cache[i-1];
				}
				
			}
			
			cache[0] = num;
		}
		
		return cache;
	}
}
