package javaAlgorithms.twopointersSlidingwindow;

import java.util.Scanner;

public class 연속부분수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(N, M, arr));
	}

	private static int solution(int n, int m, int[] arr) {
		int answer = 0;
		int sum = 0;
		int lt=0;
		
		for(int rt = 0; rt<n; rt++) {
			sum+=arr[rt];
			if(sum==m) answer++;
			while(sum>=m) {
				sum-=arr[lt++];
				if(sum==m) answer++;
			}
		}
		
		return answer;
	}
}
