package codeUp;

import java.util.Scanner;

public class _16��������������ϱ� {
//	16����(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)�� ���
//	�����̴� 16�������� ���ϴ� 16���� ������?�� ���ؼ� �ñ�������.
//
//	A, B, C, D, E, F �� �ϳ��� �Էµ� ��,
//	1���� F���� ���� 16���� �������� ������ ����غ���.
//	(��, A ~ F ������ �Էµȴ�.)

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		for(int i=1;i<=15;++i) {
	         System.out.printf("%X * %X = %X\n",Integer.parseInt(s,16),i,Integer.parseInt(s,16) * i);
	      }

	}

}
