package javaAlgorithms.string;

import java.util.Scanner;

public class ��ҹ��ں�ȯ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";
		
		for(char c : str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			}else {
				answer += Character.toUpperCase(c);
			}
		}
		
		return answer;
	}
}
