package baekJoon.implementation;

import java.util.Scanner;

/*�� �ڿ��� A�� B�� �־�����.
 *  �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� 
 *  ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
public class TheFourFundamentalArithmeticOperations {

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
