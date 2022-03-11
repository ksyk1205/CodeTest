package javaAlgorithms.recursiveTreeGraph;

import java.util.Scanner;

public class 피보나치재귀 {
	static int[] fibo;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		fibo = new int[N+1];
		
		System.out.println(permutation(N));
		
		for(int i=1; i<=N; i++) {
			System.out.print(fibo[i]+" ");
		}
	
	}

	private static int permutation(int n) {
		if(fibo[n]>0) {
			return fibo[n];
		}
		if(n==1||n==2) {
			return fibo[n] = 1;
		}else {
			return fibo[n] = permutation(n-2)+permutation(n-1);
		}
		
	}
}
