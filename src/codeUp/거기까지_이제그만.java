package codeUp;

import java.util.Scanner;

public class �ű����_�����׸� {
//	1, 2, 3 ... �� ������� ��� ���� ���� ����µ�,
//	�� ���� �Է��� �������� ���� ���ȸ� ��� ���ϴ� ���α׷��� �ۼ��غ���.
//
//	��, 1���� n���� ������ �ϳ��� ���� ���� ����µ�,
//	������ ���ؾ� �Է��� ������ ���ų� Ŀ������ �˾ƺ����� �ϴ� �����̴�.
//
//	������, �̹����� �� �� ������ ���� ����ؾ� �Ѵ�.
//
//	���� ���, 57�� �Է��ϸ�
//	1+2+3+...+8+9+10=55���� �� ���� ���� 11�� ���� 66�� �� ��,
//	�� �� 66�� ��µǾ�� �Ѵ�.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int i=1;
		int sum = 0;
		while(true) {
			sum += i;
			i++;
			if(sum>=num) {
				break;
			}
				
		}
		System.out.println(sum);
	}

}
