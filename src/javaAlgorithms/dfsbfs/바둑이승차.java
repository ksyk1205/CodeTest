package javaAlgorithms.dfsbfs;

import java.util.Scanner;

public class ¹ÙµÏÀÌ½ÂÂ÷ {
	static int C;
	static int N;
	static int max;
	private static void DFS(int num, int sum, int[] arr) {
		if(sum>C)return;
		if(num == N) {
			if(C>sum) {
				max = Math.max(max, sum);
				return;
			}
		}else {
			DFS(num+1, sum+arr[num], arr);
			DFS(num+1, sum, arr);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C = sc.nextInt();
		N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		DFS(0, 0, arr);
		
		System.out.println(max);
	}


}
