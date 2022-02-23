package javaAlgorithms.string;

import java.util.Scanner;

public class 문자찾기 {
	private static int solution(String str, char c) {
		int cnt = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(solution(str,c));
	}

	
}
