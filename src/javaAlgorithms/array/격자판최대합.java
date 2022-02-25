package javaAlgorithms.array;

import java.util.Scanner;

public class 격자판최대합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(N, arr));
	}

	private static int solution(int n, int[][] arr) {
		int answer = 0;
		int sum1,sum2;
		for(int i=0; i<n; i++) {
			sum1 = 0;
			sum2 = 0;
			for(int j=0; j<n; j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		sum1 = 0;
		sum2 = 0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<=i; j++) {
				sum1 += arr[i][j];
				sum2 += arr[i][n-j-1];
			}
		}
		
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}
}
