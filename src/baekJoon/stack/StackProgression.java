package baekJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackProgression {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(solution(arr,n));
	}

	private static String solution(int[] arr, int n) {
		StringBuilder sb = new StringBuilder();		
		Stack<Integer> stack = new Stack<>();
		int idx = 0;
		for(int i=1; i<=n; i++) {
			sb.append("+\n");
			stack.push(i);
			while(!stack.isEmpty() && stack.peek()==arr[idx]) {
				idx++;
				stack.pop();
				sb.append("-\n");
			}
		}
		if(!stack.isEmpty()) { //불가능한 경우
			return "NO";
		}
		return sb.toString();
	}

}
