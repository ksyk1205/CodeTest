package codeUp;

import java.util.Scanner;

public class �ֻ���2�������� {
//	1���� n����, 1���� m���� ���ڰ� ���� ���� �ٸ� �ֻ��� 2���� ������ ��,
//	���� �� �ִ� ��� ��츦 ����غ���.
//	
//	�Է�
//	���� �ٸ� �ֻ��� 2���� ���� ���� n, m�� ������ �ΰ� �Էµȴ�.
//	��, n, m�� 10������ �ڿ���
//
//	���
//	���� �� �ִ� �ֻ����� ���ڸ� �� ��Ʈ�� ���� �ٲ� ��� ����Ѵ�.
//	ù ��° ���� n, �� ��° ���� m���� ������ 1���� �������� ������ ����ϵ��� �Ѵ�.

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] str = stdIn.nextLine().split(" ");
		System.out.println("����� ���� ����ϰڽ��ϴ�.");
		for(int i=1; i <= Integer.parseInt(str[0]); i++) {
			for(int j=1; j <= Integer.parseInt(str[1]); j++) {
				System.out.println( i +" "+ j );
			}
		}
	}

}
