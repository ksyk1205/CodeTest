package baekJoon.dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Yocepus {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(solution(N,K));
	}

	private static String solution(int n, int k) {
		StringBuilder sb = new StringBuilder();
		Queue<Integer> que = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			que.offer(i);
		}
		sb.append("<");
		
		while(!que.isEmpty()) {
			int num = (k-1)%que.size();
			for(int i=0; i<num; i++) {
				que.offer(que.poll());
			}
			sb.append(que.poll()+", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		
		return sb.toString();
	}

}
