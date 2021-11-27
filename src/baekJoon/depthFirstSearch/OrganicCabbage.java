package baekJoon.depthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class OrganicCabbage {
	static int T; //테스트 케이스의 개수
	static StringTokenizer st; 
	static int M; //배추밭의 가로길이
	static int N; //배추밭의 세로길이
	static int K; //배추가 심어져 있는 위치
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int[][] graph; //배추
	static boolean[][] visit; //방문
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int cnt = 0;
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			graph = new int[M][N];
			visit = new boolean[M][N];
			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
				int v1 = Integer.parseInt(st.nextToken());
				int v2 = Integer.parseInt(st.nextToken());
				graph[v1][v2] = 1;
			}
			
			for(int x=0; x<M; x++) {
				for(int y=0; y<N; y++) {
					if(graph[x][y]==1 && !visit[x][y]) {
						dfs(x,y);
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
			
			
		}
		
		
		
	}
	private static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int ax = x+dx[i];
			int ay = y+dy[i];
			
			if(ax>=0 && ay>=0 && ax<M && ay<N) {
				if(graph[ax][ay]==1 && !visit[ax][ay]) {
					dfs(ax,ay);
				}
			}
		}
		
		
	}

}
