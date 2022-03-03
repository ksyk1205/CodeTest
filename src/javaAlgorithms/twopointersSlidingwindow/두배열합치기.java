package javaAlgorithms.twopointersSlidingwindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 두배열합치기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr1 = new int[N];
		for(int i=0; i<N; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] arr2 = new int[M];
		for(int i=0; i<M; i++) {
			arr2[i] = sc.nextInt();
		}
		
		List<Integer> answer = solution(N, M, arr1, arr2);
		
		for(int i=0; i<answer.size(); i++) {
			System.out.print(answer.get(i)+" ");
		}
		
	}

	private static List<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
		List<Integer> answer = new ArrayList<>(); 
		int p1 = 0, p2 = 0;
		
		while(p1<n && p2<m) {
			if(arr1[p1]<arr2[p2]) {
				answer.add(arr1[p1++]);
			}else {
				answer.add(arr2[p2++]);
			}
		}
		
		while(p1<n) {
			answer.add(arr1[p1++]);
		}
		while(p2<m) {
			answer.add(arr2[p2++]);
		}
		return answer;
	}

}
