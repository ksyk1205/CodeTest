package level_1;

import java.util.Scanner;

public class ���ڿ���p��y�ǰ��� {

	public static void main(String[] args) {
		/*
		���� ����
		�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. 
		s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
		'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. 
		��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

		���� ��� s�� "pPoooyY"�� true�� return�ϰ� "Pyy"��� false�� return�մϴ�.

		���ѻ���
		���ڿ� s�� ���� : 50 ������ �ڿ���
		���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
		����� ��
		s	answer
		"pPoooyY"	true
		"Pyy"	false
		����� �� ����
		����� �� #1
		'p'�� ���� 2��, 'y'�� ���� 2���� �����Ƿ� true�� return �մϴ�.

		����� �� #2
		'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���.");
		String s = stdIn.next();
		boolean answer = solution(s);
		
		System.out.println(answer);
		
	}
	static boolean solution(String s) {
        boolean answer = true;
        int count = 0 ;
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == 'P' || s.charAt(i) == 'p') {
        		count++;
        	}else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y'){
        		count--;
        	}
        }
        if(count != 0) {
        	answer = false;
        }
        return answer;
	}

}
