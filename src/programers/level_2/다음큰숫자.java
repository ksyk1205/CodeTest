package programers.level_2;

public class ����ū���� {
	public static void main(String[] args) {
		/*
		���� ����
		�ڿ��� n�� �־����� ��, n�� ���� ū ���ڴ� ������ ���� ���� �մϴ�.

		���� 1. n�� ���� ū ���ڴ� n���� ū �ڿ��� �Դϴ�.
		���� 2. n�� ���� ū ���ڿ� n�� 2������ ��ȯ���� �� 1�� ������ �����ϴ�.
		���� 3. n�� ���� ū ���ڴ� ���� 1, 2�� �����ϴ� �� �� ���� ���� �� �Դϴ�.
		���� �� 78(1001110)�� ���� ū ���ڴ� 83(1010011)�Դϴ�.

		�ڿ��� n�� �Ű������� �־��� ��, n�� ���� ū ���ڸ� return �ϴ� solution �Լ��� �ϼ����ּ���.

		���� ����
		n�� 1,000,000 ������ �ڿ��� �Դϴ�.
		����� ��
		n	result
		78	83
		15	23
		����� �� ����
		����� ��#1
		���� ���ÿ� �����ϴ�.
		����� ��#2
		15(1111)�� ���� ū ���ڴ� 23(10111)�Դϴ�.
		*/
		int bitCount = solution(78);
		
		System.out.println(bitCount);
		
	}
	public static int solution(int n) {
		//toBinaryString�� 2������ ��ȯ�� �� 
		String s = Integer.toBinaryString(n);
		//bitCount�� 2������ ��ȯ�Ͽ����� 1�ǰ���
		int count  = Integer.bitCount(n);
		for(int i = n+1 ; i<1000000; i++) {
			int bitc = Integer.bitCount(i);
			if(count == bitc) {
				return i ;
			}
		}
		return 0;
    }
}
