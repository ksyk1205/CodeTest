package javaAlgorithms.array;

import java.util.Scanner;

public class 등수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int num : solution(N, arr)) {
			System.out.print(num+" ");
		}
	}

	private static int[] solution(int n, int[] arr) {
		 int[] answer = new int[n];
		 
		 for(int i=0; i<n; i++) {
			 int cnt = 1;
			 for(int j=0; j<n; j++) {
				 if(arr[j]>arr[i]) {
					 cnt++;
				 }
			 }
			 answer[i] = cnt;
		 }
		 
		return answer;
	}
}
