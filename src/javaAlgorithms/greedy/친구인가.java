package javaAlgorithms.greedy;

import java.util.Scanner;

public class 친구인가 {
	static int[] unf;
	
	private static int find(int n) {
		if(unf[n]==n) return n;
		return unf[n] = find(unf[n]);
	}
	
	private static void Union(int a, int b) {
		int fa = find(a);
		int fb = find(b);
		if(fa!=fb) unf[fa] =fb;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		unf = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			unf[i]=i;
		}
		for(int i=0; i<M; i++) {
			int fa = sc.nextInt();
			int fb = sc.nextInt();
			Union(fa, fb);
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(find(a)==find(b)) System.out.println("YES");
		else System.out.println("NO");
		
	}
	
}
