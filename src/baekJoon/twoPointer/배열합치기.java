package baekJoon.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 배열합치기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[N];
		for(int i=0; i<N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr1);
		
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[M];
		for(int i=0; i<M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr2);
		
		List<Integer> answer = solution(N, M, arr1, arr2);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<answer.size(); i++) {
			sb.append(answer.get(i)+" ");
		}
		System.out.println(sb.toString());
	}

	private static List<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
		List<Integer> answer = new ArrayList<>();
		int p1=0,p2=0;
		
		while(p1<n && p2<m) {
			if(arr1[p1]>arr2[p2]) {
				answer.add(arr2[p2]);
				p2++;
			}else {
				answer.add(arr1[p1]);
				p1++;
			}
		}
		
		while(p1<n) {
			answer.add(arr1[p1]);
			p1++;
		}
		
		while(p2<m) {
			answer.add(arr2[p2]);
			p2++;
		}
		
		
		return answer;
	}
	
}
