package level_1;

import java.util.Scanner;

public class 가운데글자가져오기 {

	public static void main(String[] args) {
		/*
		문제 설명
		단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

		재한사항
		s는 길이가 1 이상, 100이하인 스트링입니다.
		입출력 예
		s	return
		"abcde"	"c"
		"qwer"	"we"
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("단어를 입력하세요");
		
		String s = stdIn.next();
		
		String answer = solution(s);
		System.out.println(answer);

	}
	 public static String solution(String s) {
        String answer = "";
        if(s.length()%2==0) {
        	answer = s.substring(s.length()/2-1,s.length()/2+1);
        }else {
        	answer = s.substring(s.length()/2,s.length()/2+1);
        }
        return answer;
    }

}
