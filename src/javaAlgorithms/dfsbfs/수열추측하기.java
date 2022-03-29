package javaAlgorithms.dfsbfs;

import java.util.Scanner;

public class 수열추측하기 {
	static int N, F;
	static int[] b,p,ch;
	static int[][] dy = new int[35][35];
	static boolean flag = false;
	
	private static int combi(int n, int r) {
		if(dy[n][r]>0) return dy[n][r]; 	
		if(n==r || r==0) return 1;
		else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}
	
	private static void DFS(int L, int sum) {
		if(flag)return;
		if(L==N) {
			if(sum == F) {
				for(int num : p) {
					System.out.print(num+" ");
				}
				flag=true;
			}
		}else {
			for(int i=1; i<=N; i++) {
				if(ch[i]==0) {
					ch[i]=1;
					p[L]=i;
					DFS(L+1, sum+(b[L]*p[L]));
					ch[i]=0;
				}
			}			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		F = sc.nextInt();
		b = new int[N];
		p = new int[N];
		ch = new int[N+1];
		
		for(int i=0; i<N; i++) {
			b[i] = combi(N-1,i);
		}
		
		DFS(0, 0);
		
	}

}


	
