package javaAlgorithms.string;

import java.util.Scanner;

public class ��ȿ���Ӹ���� {

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
