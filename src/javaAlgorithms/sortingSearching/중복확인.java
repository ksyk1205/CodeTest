package javaAlgorithms.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 중복확인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(N, arr));
	}

	private static String solution(int n, int[] arr) {
		String answer = "U";
		
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) {
				return "D";
			}
		}
		
		
		return answer;
	}
}
