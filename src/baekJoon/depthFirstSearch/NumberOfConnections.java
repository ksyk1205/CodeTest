package baekJoon.depthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberOfConnections {
	static int N; //정점의 개수
	static int M; //간선의 개수
	static StringTokenizer st;
	static int[][] graph;//그래픽
	static boolean[] visit;//방문
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graph = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int val1 = Integer.parseInt(st.nextToken());
			int val2 = Integer.parseInt(st.nextToken());
			
			graph[val1][val2] = graph[val2][val1] = 1;
		}
		int cnt = 0;
		for(int i=1; i<=N; i++) {
			if(!visit[i]) {
				dfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	private static void dfs(int i) {
		visit[i] = true;
		
		for(int j=1; j<=N; j++) {
			if(graph[i][j]==1 && !visit[j]) {
				dfs(j);
			}
		}
			
		
	}

}
