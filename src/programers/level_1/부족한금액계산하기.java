package programers.level_1;

public class 부족한금액계산하기 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(solution(price,money,count));

	}

	private static long solution(int price, int money, int count) {
		long sum = 0;
		for(int i=1; i<=count; i++) {
			sum+=price*i;
		}
		return money>=sum ? 0 : sum-money;
	}

}
