package programers.level_1;

public class ¾à¼öÀÇ°³¼ö¿Íµ¡¼À {
	public static void main(String[] args) {
		int answer = solution(13,17);
		System.out.println(answer);
	}
	public static int solution(int left, int right) {
		int answer = 0;
        for(int i=left; i<=right; i++){
            if(i%Math.sqrt(i)==0){ //Á¦°ö¼öÀÇ °æ¿ì ¾à¼ö°¡ È¦¼ö
                answer -=i;
            }else{
                answer +=i;
            }
        }
        return answer;
    }
}
