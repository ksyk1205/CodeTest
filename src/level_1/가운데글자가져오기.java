package level_1;

import java.util.Scanner;

public class ������ڰ������� {

	public static void main(String[] args) {
		/*
		���� ����
		�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

		���ѻ���
		s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
		����� ��
		s	return
		"abcde"	"c"
		"qwer"	"we"
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ܾ �Է��ϼ���");
		
		String s = stdIn.next();
		
		String answer = solution(s);
		System.out.println(answer);

	}
	 public static String solution(String s) {
        String answer = "";
        if(s.length()%2==0) {
        	answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else {
        	answer = s.substring(s.length()/2,s.length()/2+1);
        }
        return answer;
    }

}
