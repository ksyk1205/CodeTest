package programers.level_1;

public class ��������1�̵Ǵ¼�ã�� {

	public static void main(String[] args) {
		System.out.println(solution(10));

	}

	private static int solution(int n) {
		for(int i=1; i<n; i++) {
			if(n%i==1) {
				return i;
			}
		}
		return 0;
	}

}
