package javaAlgorithms.dfsbfs;

import java.util.Scanner;

public class 중복순열구하기 {
	static int N, M;
	static int[] arr;
	private static void DFS(int L) {
		if(L==M) {
			for(int num : arr) {
				System.out.print(num+" ");
			}
			System.out.println();
		}else {
			for(int i=1; i<=N; i++) {
				arr[L] = i;
				DFS(L+1);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		
		DFS(0);
	}
	
}
