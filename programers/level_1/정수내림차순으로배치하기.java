package level_1;

import java.util.Arrays;
import java.util.Collections;

public class ���������������ι�ġ�ϱ� {

	public static void main(String[] args) {
		/*
		���� ����
		�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�.
		n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
		������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

		���� ����
		n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
		����� ��
		n		return
		118372	873211
		*/
		long n = solution(118372);
		System.out.println(n);

	}
	public static long solution(long n) {
		int count=0;
		long temp = n;
		while(temp>0) {
			temp/=10;
			count++;
		}
		Long[] ln = new Long[count];
		for(int i=0; i<ln.length; i++) {
			ln[i] = n%10;
			n/=10;
		}
		
		Arrays.sort(ln,Collections.reverseOrder());
		long answer = 0;
		for(int i=0; i<ln.length; i++) {
			answer*=10;
			answer+=ln[i];
		}
		return answer;
		
    }

}
