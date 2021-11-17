package baekJoon.depthFirstSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StickNumber {
	static int N; //지도의 크기
	static int[][] arr; //단지 정보
	static boolean[][] visited; //방문 정보
	static int[][] pos = {{-1,0},{1,0},{0,-1},{0,1}}; //상,하,좌,우
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			String input = sc.next();
			for(int j=0; j<N; j++) {
				arr[i][j] = input.charAt(j)-'0';
			}
		}
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j]==1&&!visited[i][j]) {
					count = 0;
					dfs(i,j);
					result.add(count);
				}
			}
		}
		
		Collections.sort(result);
		
		System.out.println(result.size());
		for(int n : result) {
			System.out.println(n);
		}
		
		
	}

	private static void dfs(int r, int c) {
		visited[r][c] = true;
		count++;
		for(int i=0; i<pos.length; i++) {
			int nr = r+ pos[i][0];
			int nc = c+ pos[i][1];
			
			//배열의 조건을 만족하는가, 단지가 연결되어있는가, 방문하지않은 곳인가
			if(nr>=0&&nc>=0&&nr<N&&nc<N&&arr[nr][nc]==1&&!visited[nr][nc]) {
				dfs(nr,nc);
			}
			
		}
	}

}
