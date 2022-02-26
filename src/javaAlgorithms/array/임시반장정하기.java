package javaAlgorithms.array;

import java.util.Scanner;

public class 임시반장정하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N+1][6];
		for(int i=1; i<N+1; i++) {
			for(int j=1; j<6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(N, arr));
	}

	private static int solution(int n, int[][] arr) {
		int answer = 0;
		int max = 0;
		
		for(int i=1; i<=n; i++) {
			int cnt = 0;
			for(int j=1; j<=n; j++) {
				for(int z=1; z<=5; z++) {
					if(arr[i][z] == arr[j][z]) {
						cnt++;
						break;
					}
				}
			}
			if(max<cnt) {
				max = cnt;
				answer = i;
			}
		}
		
		return answer;
	}
}
