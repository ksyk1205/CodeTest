package programers.level_1;

import java.util.Scanner;

public class ¦����Ȧ�� {
	public static void main(String[] arg) {
		/*
		���� ����
		���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

		���� ����
		num�� int ������ �����Դϴ�.
		0�� ¦���Դϴ�.
		����� ��
		num	return
		3	"Odd"
		4	"Even"
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		int num = stdIn.nextInt();
	
		String answer = solution(num);
		
		System.out.println("num         retrun");
		System.out.println(num+"        "+answer);
		
	}
	public static String solution(int num) {
		return num%2==0 ? "Even" : "Odd";
    }
}
