package level_1;

public class ���ڹ��ڿ������ܾ� {
//	�׿��� ���ε��� ���ڳ��̸� �ϰ� �ֽ��ϴ�. �׿��� ���ε����� ���ڸ� �ǳ� �� �Ϻ� �ڸ����� ���ܾ�� �ٲ� ī�带 �ǳ��ָ� ���ε��� ���� ���ڸ� ã�� �����Դϴ�.
//
//	������ ������ �Ϻ� �ڸ����� ���ܾ�� �ٲٴ� �����Դϴ�.
//
//	1478 �� "one4seveneight"
//	234567 �� "23four5six7"
//	10203 �� "1zerotwozero3"
//	�̷��� ������ �Ϻ� �ڸ����� ���ܾ�� �ٲ�����ų�, Ȥ�� �ٲ��� �ʰ� �״���� ���ڿ� s�� �Ű������� �־����ϴ�. s�� �ǹ��ϴ� ���� ���ڸ� return �ϵ��� solution �Լ��� �ϼ����ּ���.
//
//	����� �� ���ڿ� �����Ǵ� ���ܾ�� ���� ǥ�� �����ϴ�.
//
//	����	���ܾ�
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
//	����� ��
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
