package javaAlgorithms.array;

import java.util.Scanner;

public class ºÀ¿ì¸® {
	static int[] dx = {1, -1, 0 ,0};
	static int[] dy = {0, 0, -1, 1};
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
		int cnt = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				for(int z=0; z<4; z++) {
					int nx = i+dx[z];
					int ny = j+dy[z];
					if(nx>=0 && nx<n && ny>=0 && ny<n
							&& arr[nx][ny]>=arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
