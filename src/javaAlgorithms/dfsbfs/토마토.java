package javaAlgorithms.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class PointTomato{
	int x;
	int y;
	
	public PointTomato(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ≈‰∏∂≈‰ {
	static int N, M;
	static int[][] arr, dis;
	static Queue<PointTomato> que = new LinkedList<>();
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	
	private static void BFS() {
		while(!que.isEmpty()) {
			PointTomato tmp = que.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=0 && nx<N && ny>=0 && ny<M && arr[nx][ny]==0) {
					arr[nx][ny] = 1;
					que.offer(new PointTomato(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] +1;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		
		arr = new int[N][M];
		dis = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j]==1) que.offer(new PointTomato(i, j));
			}
		}
		BFS();
		
		boolean flag = true;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j]==0) flag = false;
			}
		}
		int answer = 0;
		if(flag) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		}else {
			System.out.println("-1");
		}
		
		
	}
	
}
