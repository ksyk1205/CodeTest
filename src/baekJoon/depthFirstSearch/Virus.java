package baekJoon.depthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Virus {
	static int computerCnt; //컴퓨터 수
	static int arrNum; //컴퓨터 쌍의 수
	static int[][] graph; // 컴퓨터쌍
	static boolean[] visited; // 방문
	static int cnt; //바이러스 걸린 수 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		computerCnt = Integer.parseInt(br.readLine());
		arrNum = Integer.parseInt(br.readLine());
		
		graph = new int[computerCnt+1][computerCnt+1];
		visited = new boolean[computerCnt+1];
		
		String str;
		for(int i=0; i<arrNum; i++) {
			str = br.readLine();
			int a1 = Integer.parseInt(str.split(" ")[0]);
			int a2 = Integer.parseInt(str.split(" ")[1]);
			graph[a1][a2]=graph[a2][a1]=1;
		}
		
		dfs(1);
		System.out.println(cnt);
		
		
	}
	static void dfs(int x) {
		visited[x] = true;
		for(int i=1; i<computerCnt+1; i++) {
			if(!visited[i] && graph[x][i]==1) {
				dfs(i);
				cnt++;
			}
		}
	}

}
