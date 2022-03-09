package javaAlgorithms.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(solution(str));
	}

	private static int solution(String str) {
		Stack<Integer> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c != '+' && c != '-' && c != '*' && c != '/') {
				stack.push(c-'0');
			}else {
				int num2 = stack.pop();
				int num1 = stack.pop();
				switch(c) {
					case '+':
						stack.push((num1+num2));
						break;
					case '-':
						stack.push((num1-num2));
						break;
					case '*':
						stack.push((num1*num2));
						break;
					case '/':
						stack.push((num1/num2));
						break;
						
				}
			}
		}
		
		return stack.pop();
	}
}
