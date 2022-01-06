package baekJoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM1 {
	static boolean[] visit;
	static int[] arr;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		System.out.println(solution(N,M));
	}
	
	static String solution(int N, int M) {
		sb = new StringBuilder();
		visit = new boolean[N];
		arr = new int[M];
		
		permulate(1,N,0,M);
		
		return sb.toString();
	}

	static void permulate(int i, int n, int j, int m) {
		if(j==m) {
			for(int a=0; a<m; a++) {
				sb.append(arr[a]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int a=1; a<=n; a++) {
			if(visit[a-1]==false) {
				visit[a-1] = true;
				arr[j] = a;
				permulate(a,n,j+1,m);
				visit[a-1] = false;
				
			}
			
		}
	}
}
