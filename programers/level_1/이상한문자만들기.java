package level_1;

import java.util.Arrays;

public class �̻��ѹ��ڸ���� {

	public static void main(String[] args) {
		/*
		���� ����
		���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. 
		�� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. 
		�� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

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
		String answer = solution("try hello world");
		
		System.out.println(answer);

	}
	public static String solution(String s) {
        String[] arr = s.split("");
        int count = 1;
        for(int i=0; i<arr.length; i++) {
        	if(" ".equals(arr[i])) {
        		arr[i] = arr[i];
        		count=1;
        	}else {
            	if(count%2==0) {
            		arr[i] =arr[i].toLowerCase();
            	}else {
            		arr[i] =arr[i].toUpperCase();
            	}
            	count++;
        	}
        }
        String answer = "";
        for(int i=0; i<arr.length; i++) {
        	answer+=arr[i];
        }
        return answer;
    }

}
