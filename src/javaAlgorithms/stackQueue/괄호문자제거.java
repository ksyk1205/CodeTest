package javaAlgorithms.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c==')') {
				while(stack.pop()!='(');
			}else {
				stack.push(c);
			}
		}
		
		for(int i=0; i<stack.size(); i++) {
			answer+=stack.get(i);
		}
		
		return answer;
	}
}
