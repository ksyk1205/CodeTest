package level_1;

public class �����������Ǻ� {

	public static void main(String[] args) {
		/*
		���� ����
		������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
		n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.

		���� ����
		n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
		����� ��
		n	return
		121	144
		3	-1
		����� �� ����
		����� ��#1
		121�� ���� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� �����մϴ�.

		����� ��#2
		3�� ���� ������ ������ �ƴϹǷ�, -1�� �����մϴ�.
		*/
		long number = solution(121);
		System.out.println(number);

	}
	public static long solution(long n) {
        double d = Math.sqrt(n);
        int i = (int)d;
        
        return (long) (d == i ? Math.pow(d+1, 2) : -1);
       
    }

}
