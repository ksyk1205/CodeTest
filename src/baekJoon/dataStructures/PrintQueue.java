package baekJoon.dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Print01{
	int number;
	int priority;
	public Print01(int number, int priority) {
		this.number = number;
		this.priority = priority;
	}
}

public class PrintQueue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- >0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			System.out.println(solution(arr,N,M));
			
		}
		
	}

	private static int solution(int[] arr, int n, int m) {
		Queue<Print01> que = new LinkedList<>();
		for(int i=0; i<n; i++) {
			que.offer(new Print01(i, arr[i]));
		}
		
		int answer = 0;
		OUTER:while(true){
			Print01 p = que.poll();
			for(Print01 print : que) {
				if(print.priority >p.priority) {
					que.offer(p);
					continue OUTER;
				}
			}
			answer++;
			if(p.number == m) {
				return answer;
			}
		}
		
	}

}
