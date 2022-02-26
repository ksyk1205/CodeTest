package javaAlgorithms.array;

import java.util.Scanner;

public class ∏‡≈‰∏µ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr= new int[M][N];
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(N, M, arr));
	}

	private static int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int cnt=0;
				int pointI = 0,pointJ = 0;
				for(int z=0; z<m; z++) { //≈◊Ω∫∆Æ »Ωºˆ
					for(int k=0; k<n; k++) { //µÓºˆ
						if(arr[z][k]==i) {
							pointI = k;
						}
						if(arr[z][k]==j) {
							pointJ = k;
						}
					}
					if(pointI > pointJ) {
						cnt++;
					}
				}
				if(cnt==m) {
					answer++;
				}
			}
		}
		
		return answer;
	}
}
