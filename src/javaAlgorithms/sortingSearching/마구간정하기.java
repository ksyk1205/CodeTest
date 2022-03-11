package javaAlgorithms.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(N, C, arr));
		
	}

	private static int solution(int n, int c, int[] arr) {
		int answer = 0;
		int lt = 1;
		int rt = arr[n-1];
		Arrays.sort(arr);
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr,mid) >= c) {
				lt = mid+1;
				answer = mid;
			}else {
				rt = mid-1;
			}
		}
		
		return answer;
	}

	private static int count(int[] arr, int mid) {
		int cnt = 1;
		int eq = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(eq+mid<=arr[i]) {
				cnt++;
				eq = arr[i];
			}
		}
				
		return cnt;
	}
}
