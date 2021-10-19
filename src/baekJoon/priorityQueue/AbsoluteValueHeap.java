package baekJoon.priorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class AbsoluteValueHeap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new PriorityQueue<>((o1,o2) -> 
			Math.abs(o1) == Math.abs(o2)? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2)));
		for(int i=0; i<N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x==0) {
				if(q.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(q.poll());
				}
			}else {
				q.offer(x);
			}
					
		}

	}

}
