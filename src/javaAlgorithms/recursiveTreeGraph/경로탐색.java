package javaAlgorithms.recursiveTreeGraph;

import java.util.Scanner;

public class °æ·ÎÅ½»ö {
	static int[][] arr;
	static int[] visit;
	static int N;
	static int M;
	static int answer=0;
	
	private static void permutation(int i) {
		if(i==N) {
			answer++;
		}else {
			for(int j=1; j<=N; j++ ) {
				if(arr[i][j]==1 && visit[j]==0) {
					visit[j]=1;
					permutation(j);
					visit[j]=0;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		visit = new int[N+1];
		arr = new int[N+1][N+1];
		for(int i=0; i<M; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
		}
		visit[1] = 1;
		permutation(1);
		System.out.println(answer);
		
	}
	
}
