package codeUp;

import java.util.Scanner;

public class ¦���ձ��ϱ� {
//	����(1 ~ 100) 1���� �Է¹޾� 1���� �� ������ ¦���� ���� ���غ���.
//	
//	�Է�
//	���� 1���� �Էµȴ�.
//	(0 ~ 100)
//
//	���
//	1���� �� ������ ¦���� ���� ����Ѵ�.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int num = stdIn.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1����"+num+"���� ¦���� �ո� �����Ѵ�.");
		System.out.println(sum);
	}

}
