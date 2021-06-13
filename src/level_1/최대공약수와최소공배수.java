package level_1;

import java.util.Arrays;

public class �ִ��������ּҰ���� {

	public static void main(String[] args) {
		/*
		���� ����
		�� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������.
		�迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
		���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.

		���� ����
		�� ���� 1�̻� 1000000������ �ڿ����Դϴ�.
		����� ��
		n	m	return
		3	12	[3, 12]
		2	5	[1, 10]
		����� �� ����
		����� �� #1
		���� ����� �����ϴ�.

		����� �� #2
		�ڿ��� 2�� 5�� �ִ������� 1, �ּҰ������ 10�̹Ƿ� [1, 10]�� �����ؾ� �մϴ�.
		*/
		int[] solution = solution(3,12);
		
		System.out.println(Arrays.toString(solution));

	}
	public static int[] solution(int n, int m) {
       int[] answer = new int[2];
       for(int i=1; i<=Math.max(n, m); i++) {
    	   if(n%i==0 && m%i==0) {
    		   answer[0] = i;
    		   answer[1] = n*m/i;
    	   }
       }
        return answer;
    }

}
