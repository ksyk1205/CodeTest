package codeUp;

import java.util.Scanner;

public class �������ϱ� {
//	� ��Ģ�� ���� ���� ������� ������ ���� ����(sequences)�̶�� �Ѵ�.
//
//	���� ���
//	1 4 7 10 13 16 19 22 25 ... ��
//	1���� ������ ������ ���� ���� 3�� ���� ���� ���� ���� �����̴�.
//	�̷��� ���� ���п����� �յ� ������ ���̰� ���ٰ� �Ͽ�
//
//	����(���̰� ������ �ѹ� ��) �����̶�� �Ѵ�. (�������� : arithmetic progression/sequence)
//	������ �˰� �� �����̴� ���ڱ� �ñ�������.
//
//	"�׷�.... 123��° ������ ���� ����?"
//
//	�����̴� ���α׷��� ����� �� ū ���� �ڵ����� ����ϰ� �;�����.
//
//	���� ��(a), ����(d), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� ��
//	n��° ���� ����ϴ� ���α׷��� ������.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int d = Integer.parseInt(str[1]);
		int n = Integer.parseInt(str[2]);
		for(int i=0; i<n-1; i++) {
			a +=d;
		}
		System.out.println(a);
		
	}

}
