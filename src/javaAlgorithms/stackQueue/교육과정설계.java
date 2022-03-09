package javaAlgorithms.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(solution(str1, str2));
		
	}

	private static String solution(String str1, String str2) {
		String answer = "YES";
		Queue<Character> que = new LinkedList<>();
		
		for(char c:  str1.toCharArray()) {
			que.offer(c);
		}
		
		for(char c: str2.toCharArray()) {
			if(que.contains(c)) {
				if(c!=que.poll()) {
					return "NO";
				}
			}
		}
		
		if(!que.isEmpty()) {
			answer = "NO";
		}
		
		return answer;
	}
}
