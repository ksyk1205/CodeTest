package baekJoon.depthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS {
	public static boolean[] visited;
	public static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[N][N];
        for(int i=0; i<M; i++) {
        	st = new StringTokenizer(br.readLine());
        	int x= Integer.parseInt(st.nextToken())-1;
        	int y= Integer.parseInt(st.nextToken())-1; 
        	arr[x][y] = 1;
        	arr[y][x] = 1;
        }
        System.out.println(solution(arr, N, V, "dfs"));
        System.out.println(solution(arr, N, V, "bfs"));
	}
	
	public static String solution(int[][] arr, int n, int v, String str) {
		visited = new boolean[n];
		sb = new StringBuilder();
		visited[v-1] = true;
		int now = v-1;
		if(str.equals("dfs")) {
			//dfs
			dfs(arr,now);
		}else if(str.equals("bfs")) {
			//bfs
			bfs(arr,now);
		}
		
		return sb.delete(sb.length()-1, sb.length()).toString();
	}

	private static void bfs(int[][] arr, int now) {
		Queue<Integer> que= new LinkedList<>();
		sb.append((now+1)+" ");
		que.offer(now);
		while(!que.isEmpty()) {
			now = que.poll();
			for(int i=0; i<arr[now].length; i++) {
				int node = arr[now][i];
				if(node!=0 && !visited[i]) {
					visited[i] = true;
					que.offer(i);
					sb.append((i+1)+" ");
				}
			}
		}
	}

	private static void dfs(int[][] arr, int now) {
		sb.append((now+1)+ " ");
		
		for(int i=0; i<arr[now].length; i++) {
			int node = arr[now][i];
			if(node != 0 && !visited[i]) {
				visited[i] = true;
				dfs(arr,i);
			}
		}
	}

}
