package baekJoon.stage.ifTest;

import java.util.Scanner;

public class ��_��_���ϱ� {
	/*
	 * ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
	 * 
	 * A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
	 * A�� B���� ���� ��쿡�� '<'�� ����Ѵ�. 
	 * A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
