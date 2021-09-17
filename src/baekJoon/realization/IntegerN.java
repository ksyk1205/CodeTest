package baekJoon.realization;

/*���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�.
Java: long sum(int[] a); (Ŭ���� �̸�: Test)
a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
*/
public class IntegerN {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		long n = sum(a);
		System.out.println(n);
	}

	private static long sum(int[] a) {
		long answer = 0;
		for(int i=0; i<a.length; i++) {
			answer +=a[i];
		}
		return answer;
	}

}
