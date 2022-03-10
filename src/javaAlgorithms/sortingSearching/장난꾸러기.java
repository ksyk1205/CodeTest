package javaAlgorithms.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {
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
		String answer = "";
		int[] copy = arr.clone();
		Arrays.sort(copy);
		
		for(int i=0; i<n; i++) {
			if(arr[i]!=copy[i]) {
				answer+= (i+1)+" ";
			}
		}
		
		
		return answer;
	}
}
