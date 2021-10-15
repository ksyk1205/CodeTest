package baekJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		
		Stack<Integer> stack = new Stack<>();
		
		for(String str : arr) {
			if(str.contains("push")) {
				String[] push =str.split(" ");
				stack.push(Integer.parseInt(push[1]));
			}else if(str.equals("pop")) {
				System.out.println(stack.empty()?-1:stack.pop());
			}else if(str.equals("size")) {
				System.out.println(stack.size());
			}else if(str.equals("empty")) {
				System.out.println(stack.empty()?1:0);
			}else if(str.equals("top")) {
				System.out.println(stack.empty()?-1:stack.peek());
			}
		}
		
	}

}
