package baekJoon.dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Queue_ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
 		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		
 		LinkedList<Integer> que = new LinkedList<>();
		
		for(String str : arr) {
			if(str.contains("push")) {
				String[] st = str.split(" ");
				que.offer(Integer.parseInt(st[1]));
			}else if(str.contains("pop")) {
				if(que.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(que.poll());
				}
			}else if(str.contains("size")) {
				System.out.println(que.size());
			}else if(str.contains("empty")) {
				System.out.println(que.isEmpty()? 1:0);
			}else if(str.contains("front")) {
				System.out.println(que.isEmpty() ? -1 :que.peek());
			}else if(str.contains("back")) {
				System.out.println(que.isEmpty() ? -1 :que.peekLast());
			}
		}
		
	}

}
