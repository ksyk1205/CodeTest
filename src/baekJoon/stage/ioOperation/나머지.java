package baekJoon.stage.ioOperation;

import java.util.Scanner;

public class ������ {
	/*
	 * ù° �ٿ� (A+B)%C, 
	 * ��° �ٿ� ((A%C) + (B%C))%C,
	 * ��° �ٿ� (A��B)%C, 
	 * ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
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
