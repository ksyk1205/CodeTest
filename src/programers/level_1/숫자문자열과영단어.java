package programers.level_1;

public class 숫자문자열과영단어 {

	public static int solution(String s) {
		String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        String[] english = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<10; i++) {
        	s = s.replaceAll(english[i],numbers[i]);
        }
        
        return Integer.parseInt(s);
        
    }
	public static void main(String[] args) {
		int result = solution("one4seveneight");
		System.out.println(result);
	}

}
