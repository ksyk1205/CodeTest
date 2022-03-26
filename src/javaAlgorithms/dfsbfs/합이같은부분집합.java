package javaAlgorithms.dfsbfs;

import java.util.Scanner;

public class 합이같은부분집합 {
	static int total;
	static int N;
	static String answer = "NO";
	static boolean flag = false;
	private static void DFS(int L, int[] arr, int sum) {
		if(flag) return;
		
		if(L==N) {
			if(total-sum == sum) {
				flag = true;
				answer="YES";
			}
		}else {
			DFS(L+1, arr, sum+arr[L]);
			DFS(L+1, arr, sum);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		
		
		DFS(0, arr, 0);
		
		System.out.println(answer);
	}
	
}
