package javaAlgorithms.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class PointIsland{
	int x;
	int y;
	public PointIsland(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class ¼¶³ª¶ó_BFS {
	static int answer, N;
	static int[] dx = {1, -1, 0, 0, 1, -1, 1, -1};
	static int[] dy = {0, 0, 1, -1, -1, 1, 1, -1 };
	static Queue<PointIsland> que = new LinkedList<>();	
	
	private static void BFS(int i, int j, int[][] arr) {
		que.offer(new PointIsland(i, j));
		
		while(!que.isEmpty()) {
			PointIsland tmp = que.poll();
			for(int a=0; a<8; a++) {
				int nx = tmp.x+dx[a];
				int ny = tmp.y+dy[a];
				if(nx>=0 && nx<N && ny>=0 && ny<N && arr[nx][ny] == 1) {
					arr[nx][ny] = 0;
					que.offer(new PointIsland(nx, ny));
				}
			}
		}
		
	}
	
	private static void solution(int[][] arr) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j]==1) {
					answer++;
					arr[i][j]=0;
					BFS(i, j, arr);
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
