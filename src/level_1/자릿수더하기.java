package level_1;

import java.util.Scanner;

public class �ڸ������ϱ� {

	public static void main(String[] args) {
		/*
		���� ����
		�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
		������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

		���ѻ���
		N�� ���� : 100,000,000 ������ �ڿ���
		����� ��
		N	answer
		123	6
		987	24
		����� �� ����
		����� �� #1
		������ ���ÿ� �����ϴ�.

		����� �� #2
		9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		int answer = solution(n);
		 System.out.println(answer);
		
		
	}
	public static int solution(int n) {
        int answer = 0;
        while(n>0) {
        	answer += n%10;
        	n/=10;
        }
        return answer;
    }

}
