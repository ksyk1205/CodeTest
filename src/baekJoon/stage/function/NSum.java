package baekJoon.stage.function;

public class NSum {
	/*
	 * ���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�.
	 * 
	 * �ۼ��ؾ� �ϴ� �Լ��� ������ ����.
	 * long sum(int[] a); (Ŭ���� �̸�: Test) 
	 * a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000) 
	 * ���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
	 */	
	public class Test {
	    long sum(int[] a) {
	        long ans = 0;
	        for(int i=0; i<a.length; i++) {
	        	ans+=a[i];
	        }
	        return ans;
	    }
	}
	
}
