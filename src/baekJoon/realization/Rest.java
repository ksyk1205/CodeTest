package baekJoon.realization;

import java.util.Scanner;

/*(A+B)%C�� ((A%C) + (B%C))%C �� ������?

(A��B)%C�� ((A%C) �� (B%C))%C �� ������?

�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

ù° �ٿ� (A+B)%C, 
��° �ٿ� ((A%C) + (B%C))%C, 
��° �ٿ� (A��B)%C, 
��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.*/

public class Rest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);

	}

}
