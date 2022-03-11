package javaAlgorithms.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class ¹ÂÁ÷ºñµð¿À {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(N, M, arr));
	}

	private static int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)<=m) {
				rt = mid-1;
				answer = mid;
			}else {
				
				lt = mid+1;
			}
		}
		
		return answer;
	}

	private static int count(int[] arr, int mid) {
		int cnt = 1;
		int sum = 0;
		for(int num : arr) {
			if(sum+num>mid) {
				cnt++;
				sum = num;
				
			}else {
				sum+=num;
			}
		}
		
		return cnt;
	}
	
}
