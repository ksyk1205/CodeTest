package baekJoon.stage.ioOperation;

import java.util.Scanner;

public class 나머지 {
	/*
	 * 첫째 줄에 (A+B)%C, 
	 * 둘째 줄에 ((A%C) + (B%C))%C,
	 * 셋째 줄에 (A×B)%C, 
	 * 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
	}

}
