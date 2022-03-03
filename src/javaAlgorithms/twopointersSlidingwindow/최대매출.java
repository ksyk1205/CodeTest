package javaAlgorithms.twopointersSlidingwindow;

import java.util.Scanner;

public class 최대매출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(N, K, arr));
		
	}

	private static int solution(int n, int k, int[] arr) {
		int sum = 0;
		int pos = 0;
		for(int i=0; i<k; i++) {
			sum += arr[i];
		}
		pos = sum;
		for(int i=k; i<n; i++) {
			pos+=arr[i]-arr[i-k];
			sum = Math.max(sum, pos);
		}
		
		return sum;
	}
}
