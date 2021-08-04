package programers.level_1;

import java.util.Scanner;

public class �������������� {

	public static void main(String[] args) {
		/*
		���� ����
		�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
		���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

		���� ����
		a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
		a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
		a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
		����� ��
		a	b	return
		3	5	12
		3	3	3
		5	3	12
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� a�� �Է��ϼ���.");
		int a = stdIn.nextInt();
		System.out.println("���� b�� �Է��ϼ���.");
		int b = stdIn.nextInt();
		
		long answer = solution(a,b);
		
		System.out.println("a    b   return");
		System.out.println(a+"    "+b+"    "+answer);
		

	}
	public static long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        for(; min<=max; min++) {
        	answer += min;
        }
        
        return answer;
    }
}
