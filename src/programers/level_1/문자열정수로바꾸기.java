package programers.level_1;

import java.util.Scanner;

public class ���ڿ������ιٲٱ� {

	public static void main(String[] args) {
		/*
		���� ����
		���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.

		���� ����
		s�� ���̴� 1 �̻� 5�����Դϴ�.
		s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
		s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
		s�� "0"���� �������� �ʽ��ϴ�.
		����� ��
		������� str�� "1234"�̸� 1234�� ��ȯ�ϰ�, "-1234"�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
		str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���");
		String s = stdIn.next();
		
		int num = solution(s);
		System.out.println(num);

	}
	public static int solution(String s) {
        return Integer.parseInt(s);
    }

}
