package codeUp;

import java.util.Scanner;

public class �����������ؾ��ұ� {
//	1, 2, 3 ... �� ��� ���� ���� ��,
//	�� ���� �Է��� ����(0 ~ 1000)���� ���ų� ���� ��������
//	��� ���ϴ� ���α׷��� �ۼ��غ���.
//
//	��, 1���� n���� ������ ��� ���� �����ٰ� �� ��,
//	������ ���ؾ� �Է��� ������ ���ų� Ŀ���� ���� �˾ƺ������ϴ� �����̴�.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum +=i;
			
			if(num <= sum) {
				System.out.println(i);
				return;
			}
		}
		
	}

}
