package programers.level_1;

import java.util.Scanner;

public class ���ڿ��ٷ��⺻ {

	public static void main(String[] args) {
		/*
		���� ����
		���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. 
		���� ��� s�� "a234"�̸� False�� �����ϰ� "1234"��� True�� �����ϸ� �˴ϴ�.

		���� ����
		s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
		����� ��
		s	return
		"a234"	false
		"1234"	true
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���̰� 4Ȥ�� 6�� ���ڷ� ������ ���ڿ��� �Է��ϼ���");
		String s = stdIn.next();
		
		boolean answer = solution(s); 

	}
	 public static boolean solution(String s) {
		//charcter.isDigit(s) s�� ���ڸ� true ���ڸ� false
		//s.charAt(i) index���� char�������� �ϳ��� �̴´�
	        boolean answer = true;
	        for(int i=0; i<s.length(); i++) {
	        	if(Character.isDigit(s.charAt(i))) {
	        		answer = false;
	        	}
	        }
	        return answer;
	    }

}
