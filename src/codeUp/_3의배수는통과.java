package codeUp;

import java.util.Scanner;

public class _3�ǹ������� {
//	1���� �Է��� �������� 1�� �������� ����ϴ� ���α׷��� �ۼ��ϵ�,
//	3�� ����� ���� ������� �ʵ��� ������.
//
//	���� ���,
//	1 2 4 5 7 8 10 11 13 14 ...
//	�� ���� ����ϴ� ���̴�.
//
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		for(int i=1; i<=num; i++) {
			if(i%3!=0) {
				System.out.print(i+" ");
			}
			
		}
	}

}
