package javaAlgorithms.dfsbfs;

import java.util.Scanner;

public class 조합구하기 {
	static int N, M;
	static int[] p;
	
	private static void DFS(int L, int s) {
		if(L==M) {
			for(int num : p) {
				System.out.print(num+" ");
			}
			System.out.println();
		}else {
			for(int i=s; i<=N; i++) {
				p[L] = i;
				DFS(L+1, i+1);				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		p = new int[M];
		
		DFS(0, 1);
		
	}
	
}
