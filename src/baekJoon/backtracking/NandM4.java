package baekJoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM4 {
	static int[] arr;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		System.out.println(solution(N,M));
	}

	static String solution(int n, int m) {
		arr = new int[m];
		sb = new StringBuilder();
		
		permulate(1,n,0,m);
		
		return sb.toString();
	}

	static void permulate(int i, int n, int j, int m) {
		if(j==m) {
			for(int num:arr) {
				sb.append(num+" ");
			}
			sb.append("\n");
			return;
		}
		for(int a=i; a<=n; a++) {
			arr[j]=a;
			permulate(a, n, j+1, m);
		}
	}
}
