package codeUp;

import java.util.Scanner;

public class _3_6_9_�����ǿ��̵��� {
//	ģ����� �Բ� 3 6 9 ������ �ϴ� �����̴� ���� �Ǽ� ������ ����ؼ� ��Ģ�� �ް� �Ǿ���.
//	3 6 9 ������ ���� �Ǳ� ���� 369 ������ ���α׷��� �ۼ��� ����.
//
//	** 3 6 9 ������?
//	���� ����� ������ ���� ��, ������� ���� �θ��� �����̴�.
//	���� 3, 6, 9 �� �� ���� �ڽ��� �ҷ��� �ϴ� ��Ȳ�̶��, ���� �θ��� ��� "�ڼ�(X)" �� �ľ� �Ѵ�.
//	33�� ���� 3,6,9�� �� �� �� �� �϶�, "¦¦"�� ���� �ڼ��� �� �� ġ�� ���µ� �ִ�. 
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = stdIn.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i > 10) {
			   int n = i/10;
				if( n==3 || n==6 || n==9) {
				   System.out.print(" ¦ ");
				}else {
					System.out.print(" "+i+" ");
				}
			}else {
				if( i==3 || i==6 || i==9) {
					System.out.print(" ¦ ");
				}else {
					System.out.print(" "+i+" ");
				}
			}
			
		}
		

	}

}
