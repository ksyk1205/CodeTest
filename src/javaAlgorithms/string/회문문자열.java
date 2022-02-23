package javaAlgorithms.string;

import java.util.Scanner;

public class 회문문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String s = str.toUpperCase();
		for(int i=0; i<s.length(); i++) {
			if(!(s.charAt(i)==s.charAt(s.length()-i-1))) {
				return "NO";
			}
		}
		return "YES";
	}
}
