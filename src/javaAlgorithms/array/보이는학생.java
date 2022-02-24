package javaAlgorithms.array;

import java.util.Scanner;

public class 보이는학생 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(N,arr));
	}

	private static int solution(int n, int[] arr) {
		int answer = 1;
		int max = arr[0];
		for(int i=1; i<n; i++) {
			if(max<arr[i]) {
				max = arr[i];
				answer++;
			}
		}
		
		return answer;
	}
}
