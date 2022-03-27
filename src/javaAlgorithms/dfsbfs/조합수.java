package javaAlgorithms.dfsbfs;

import java.util.Scanner;

public class Á¶ÇÕ¼ö {
	static int[][] arr = new int[35][35];
	private static int DFS(int n, int m) {
		if(arr[n][m]> 0) return arr[n][m];
		if(n==m ||m==0) return 1;
		else return arr[n][m] = DFS(n-1, m-1) + DFS(n-1, m);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
				
		System.out.println(DFS(N,M));
		
	}

}
