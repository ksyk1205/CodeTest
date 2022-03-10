package javaAlgorithms.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {

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
		
		Arrays.sort(arr);
		int lt=0,rt=n-1;
		while(lt<rt) {
			int mid = (rt+lt)/2;
			if(arr[mid]==m) {
				answer = mid+1;
				break;
			}else if(arr[mid]>m) {
				rt = mid;
			}else {
				lt = mid;
			}
		}
		
		return answer;
	}

}
