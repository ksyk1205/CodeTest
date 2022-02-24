package javaAlgorithms.string;

import java.util.Scanner;

public class 숫자만추출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

	private static int solution(String str) {
		String answer="";
		
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				answer+=c;
			}
		}
		
		return Integer.parseInt(answer);
	}
}
