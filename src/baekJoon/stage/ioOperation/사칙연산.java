package baekJoon.stage.ioOperation;

import java.util.Scanner;

public class ��Ģ���� {
	/*
	 * ù° �ٿ� A+B, 
	 * ��° �ٿ� A-B, 
	 * ��° �ٿ� A*B, 
	 * ��° �ٿ� A/B, 
	 * �ټ�° �ٿ� A%B�� ����Ѵ�.
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
