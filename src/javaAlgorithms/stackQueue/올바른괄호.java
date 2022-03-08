package javaAlgorithms.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ¿Ã¹Ù¸¥°ýÈ£ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c=='(') {
				stack.push(c);
			}else{
				if(stack.empty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		
		if(stack.size()==0) {
			return "YES";
		}else {
			return "NO";
		}
		
	}
}
