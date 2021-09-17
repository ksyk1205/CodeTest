package baekJoon.realization;

/*정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
Java: long sum(int[] a); (클래스 이름: Test)
a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
리턴값: a에 포함되어 있는 정수 n개의 합
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
