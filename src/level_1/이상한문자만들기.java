package level_1;

public class �̻��ѹ��ڸ���� {

	public static void main(String[] args) {
		/*
		���� ����
		���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

		���� ����
		���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
		ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
		����� ��
		s	return
		"try hello world"	"TrY HeLlO WoRlD"
		����� �� ����
		"try hello world"�� �� �ܾ� "try",
		 "hello", "world"�� �����Ǿ� �ֽ��ϴ�.
		  �� �ܾ��� ¦����° ���ڸ� �빮�ڷ�,
		   Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� "TrY", "HeLlO", "WoRlD"�Դϴ�. ���� "TrY HeLlO WoRlD" �� �����մϴ�.
		   */
		String answer = solution("try hell world");
		
		System.out.println(answer);

	}
	public static String solution(String s) {
		String answer = "";
        String[] array = s.split("");
        int cnt = 0;
        for(int i=0; i<array.length; i++) {
        	if(" ".equals(array[i])) {
        		cnt=0;
        	}else {
        		if(cnt%2==0) {
        			array[i] = array[i].toUpperCase();
        			cnt++;
        		}else {
        			array[i] = array[i].toLowerCase();
        			cnt++;
        		}
        	}
        	answer += array[i];
        }
        
        return answer;
    }

}
