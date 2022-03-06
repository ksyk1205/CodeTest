package baekJoon.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ºí·Î±× {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		solution(N, X, arr);
		
	}

	private static void solution(int n, int x, int[] arr) {
		int sum = 0;
		int cnt = 1;
		
		for(int i=0; i<x; i++) {
			sum+= arr[i];
		}
		
		int max = sum;
		for(int i = x; i<n; i++) {
			sum+=arr[i];
			sum-=arr[i-x];
			if(sum>max) {
				max = sum;
				cnt=1;
			}else if(sum==max) {
				cnt++;
			}
		}
		StringBuilder sb = new StringBuilder();
		if(max ==0) {
			sb.append("SAD");
		}else {
			sb.append(max+"\n");
			sb.append(cnt);
		}
		
		System.out.println(sb.toString());
	}
}
