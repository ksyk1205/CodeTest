package javaAlgorithms.dfsbfs;

import java.util.Scanner;

public class ¼¶³ª¶ó_DFS {
	static int answer, N;
	static int[] dx = {-1, 1, 0, 0, 1, -1, 1, -1};
	static int[] dy = {0, 0, -1, 1, -1, 1, 1, -1};
	
	private static void DFS(int i, int j, int[][] board) {
		for(int a=0; a<8; a++) {
			int nx = i+dx[a];
			int ny = j+dy[a];
			if(nx>=0 && nx<N && ny>=0 && ny<N && board[nx][ny]==1) {
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
			
		}
		
	}
	
	private static void solution(int[][] board) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j] = 0;
					DFS(i, j, board);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solution(arr);
		
		System.out.println(answer);
	}
	
}
