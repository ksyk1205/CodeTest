package programers.level_1;

import java.util.Scanner;

public class ������� {

	public static void main(String[] args) {
		/*
		���� ����
		���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

		���� ����
		n�� 0 �̻� 3000������ �����Դϴ�.
		����� ��
		n	return
		12	28
		5	6
		����� �� ����
		����� �� #1
		12�� ����� 1, 2, 3, 4, 6, 12�Դϴ�. �̸� ��� ���ϸ� 28�Դϴ�.

		����� �� #2
		5�� ����� 1, 5�Դϴ�. �̸� ��� ���ϸ� 6�Դϴ�.
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����� ���� ������ ���Ͻÿ�.");
		int n = stdIn.nextInt();
		int num = solution(n);
		
		System.out.println(num);
		
	}
	public static int solution(int n) {
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				answer+=i;
			}
		}
        
        return answer;
    }

}
