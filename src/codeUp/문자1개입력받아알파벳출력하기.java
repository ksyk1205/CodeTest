package codeUp;

import java.util.Scanner;

public class ����1���Է¹޾ƾ��ĺ�����ϱ� {
//	���� �ҹ���(a ~ z) 1���� �ԷµǾ��� ��,
//	a���� �� ���ڱ����� ���ĺ��� ������� ����غ���.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� �ҹ���(a~z)�� �Է��ϼ���.");
		int str = stdIn.next().charAt(0);
		
		int a = 96;
		while(str >0) {
		  a++;
		  System.out.println((char)a);
		  if(str == a) {
			  break;
		  }
		}
		 
	}
}
