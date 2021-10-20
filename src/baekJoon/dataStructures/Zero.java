package baekJoon.dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}
		int length = stack.size();
		int sum = 0;
		for(int i=0; i<length; i++) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
	}

}
