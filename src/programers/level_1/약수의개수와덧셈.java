package programers.level_1;

public class ����ǰ����͵��� {
	public static void main(String[] args) {
		int answer = solution(13,17);
		System.out.println(answer);
	}
	public static int solution(int left, int right) {
		int answer = 0;
        for(int i=left; i<=right; i++){
            if(i%Math.sqrt(i)==0){ //�������� ��� ����� Ȧ��
                answer -=i;
            }else{
                answer +=i;
            }
        }
        return answer;
    }
}
