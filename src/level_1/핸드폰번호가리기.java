package level_1;

import java.util.Scanner;

public class �ڵ�����ȣ������ {

	public static void main(String[] args) {
		/*
		���� ����
		���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
		��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

		���� ����
		s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
		����� ��
		phone_number	return
		"01033334444"	"*******4444"
		"027778888"	"*****8888"
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� ");
		String phone_number = stdIn.next();
		
		String solution = solution(phone_number);
		
		System.out.println(solution);
		
	}
	
	public static String solution(String phone_number) {
		 char[] ch = phone_number.toCharArray();
		 for(int i=0; i<phone_number.length()-4; i++) {
			 ch[i] = '*';
		 }
		 return String.valueOf(ch);
    }
}
