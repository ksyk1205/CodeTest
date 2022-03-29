package javaAlgorithms.dfsbfs;

import java.util.Scanner;

public class ¹Ì·ÎÅ½»ö {
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int[][] arr = new int[8][8];
	static int cnt=0;
	private static void DFS(int x, int y) {
		if(x==7 && y==7) {
			cnt++;
		}else {
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && arr[nx][ny]==0) {
					arr[nx][ny] = 1;
					DFS(nx, ny);
					arr[nx][ny] = 0;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		arr[1][1] = 1;
		DFS(1, 1);
		System.out.println(cnt);
	}

}
