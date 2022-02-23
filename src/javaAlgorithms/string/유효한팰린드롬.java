package javaAlgorithms.string;

import java.util.Scanner;

public class 유효한팰린드롬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			return "YES";
		}
		return "NO";
	}

}
