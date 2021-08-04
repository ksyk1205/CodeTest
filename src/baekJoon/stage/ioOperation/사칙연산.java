package baekJoon.stage.ioOperation;

import java.util.Scanner;

public class 사칙연산 {
	/*
	 * 첫째 줄에 A+B, 
	 * 둘째 줄에 A-B, 
	 * 셋째 줄에 A*B, 
	 * 넷째 줄에 A/B, 
	 * 다섯째 줄에 A%B를 출력한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}

}
