package baekJoon.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class °ãÄ¡´Â°Ç½È¾î {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(N, K, arr));
		
	}

	private static int solution(int n, int k, int[] arr) {
		int answer = 0;
		
		int start = 0;
		int end = 0;
		
		int[] array = new int[100001];
		
		while(end < arr.length) {
			
			if(array[arr[end]]<k) {
				array[arr[end]]++;
				end++;
			}else if(array[arr[end]]==k) {
				array[arr[start]]--;
				start++;
			}
			
			answer = Math.max(answer, end-start);
		}
		
		return answer;
	}
}
