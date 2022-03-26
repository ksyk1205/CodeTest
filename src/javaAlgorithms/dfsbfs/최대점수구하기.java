package javaAlgorithms.dfsbfs;

import java.util.Scanner;

public class 최대점수구하기 {
	static int N;
	static int M;
	static int max = 0;	
	
	private static void DFS(int num, int times, int sum, int[][] arr) {
		if(times>M)return;
		if(N==num) {
			if(M>=times) {
				max = Math.max(max, sum);
				return;
			}
		}else {
			DFS(num+1, times+arr[num][1], sum+arr[num][0], arr);
			DFS(num+1, times, sum, arr);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		DFS(0, 0, 0, arr);
		
		System.out.println(max);
	}

}
