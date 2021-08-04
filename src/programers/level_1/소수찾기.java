package programers.level_1;

import java.util.Scanner;

public class �Ҽ�ã�� {

	public static void main(String[] args) {
		/*
		 * ���� ���� 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.
		 * 
		 * �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�. (1�� �Ҽ��� �ƴմϴ�.)
		 * 
		 * ���� ���� n�� 2�̻� 1000000������ �ڿ����Դϴ�. ����� �� n result 10 4 5 3 ����� �� ���� ����� �� #1 1����
		 * 10 ������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4�� ��ȯ
		 * 
		 * ����� �� #2 1���� 5 ������ �Ҽ��� [2,3,5] 3���� �����ϹǷ� 3�� ��ȯ
		 */	
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		int count = solution(n);
		
		System.out.println("����     �Ҽ��� ����");
		System.out.println(n+"      "+count);

	}
	
	private static int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++) {
        	boolean isChk = false;
        	for(int j=2; j<i; j++) {
        		if(i%j==0) {
        			isChk = true;
        		}
          	}
        	if(!isChk) {
        		answer++;
        	}
        	
        }
        return answer;
    }

}
