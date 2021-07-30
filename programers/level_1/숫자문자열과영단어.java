package level_1;

public class 숫자문자열과영단어 {
//	네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
//
//	다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
//
//	1478 → "one4seveneight"
//	234567 → "23four5six7"
//	10203 → "1zerotwozero3"
//	이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
//
//	참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
//
//	숫자	영단어
//	0	zero
//	1	one
//	2	two
//	3	three
//	4	four
//	5	five
//	6	six
//	7	seven
//	8	eight
//	9	nine
//	
//	입출력 예
//	s	                result
//	"one4seveneight"	1478
//	"23four5six7"	    234567
//	"2three45sixseven"	234567
//	"123"	            123
	
	public static int solution(String s) {
        int answer = 0;
        if(s.contains("zero")){
        	s = s.replace("zero", "0"); 
        }
        if(s.contains("one")){
        	s = s.replace("one", "1"); 
        }
        if(s.contains("two")){
        	s = s.replace("two", "2"); 
        } 
        if(s.contains("three")){
        	s = s.replace("three", "3"); 
        }
        if(s.contains("four")){
        	s = s.replace("four", "4"); 
        }
        if(s.contains("five")){
        	s = s.replace("five", "5"); 
        }
        if(s.contains("six")){
        	s = s.replace("six", "6"); 
        }
        if(s.contains("seven")){
        	s = s.replace("seven", "7"); 
        }
        if(s.contains("eight")){
        	s = s.replace("eight", "8"); 
        }
        if(s.contains("nine")){
        	s = s.replace("nine", "9"); 
        }
        answer = Integer.parseInt(s);
        return answer;
    }
	public static void main(String[] args) {
		int result = solution("one4seveneight");
		System.out.println(result);
	}

}
