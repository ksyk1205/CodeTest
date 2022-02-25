package javaAlgorithms.array;

import java.util.Scanner;

public class 점수계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(N, arr));
	}

	private static int solution(int n, int[] arr) {
		int answer = 0;
		int cnt = 1;
		for(int i=0; i<n; i++) {
			if(arr[i]==1) {
				answer+=cnt;
				cnt++;
			}else {
				cnt=1;
			}
		}
		return answer;
	}
}
