package programers.level_1;

public class 없는숫자더하기 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int result = solution(numbers);
		System.out.println(result);
	}
	public static int solution(int[] numbers) {
        int answer = 45;
        for(int n:numbers) {
        	answer-=n;
        }
        return answer;
    }

}
