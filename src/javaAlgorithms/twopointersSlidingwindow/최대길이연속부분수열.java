package javaAlgorithms.twopointersSlidingwindow;

import java.util.Scanner;

public class 최대길이연속부분수열 {
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
		int answer = 0;
		int cnt = 0;
		int lt = 0;
		for(int rt=0; rt<n; rt++) {
			if(arr[rt]==0) {
				cnt++;
			}
			while(cnt>k) {
				if(arr[lt]==0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		
		return answer;
	}
}
