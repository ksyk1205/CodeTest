package level_1;

public class x��ŭ�������ִ�n���Ǽ��� {

	public static void main(String[] args) {
		/*
		���� ����
		�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.

		���� ����
		x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
		n�� 1000 ������ �ڿ����Դϴ�.
		����� ��
		x	n	answer
		2	5	[2,4,6,8,10]
		4	3	[4,8,12]
		-4	2	[-4, -8]
		*/
		long[] answer = solution(-4,2);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}

	}
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long lx = x;
        for(int i=0; i<n; i++) {
        	answer[i] = lx *(i+1) ;
        }
        return answer;
    }

}
