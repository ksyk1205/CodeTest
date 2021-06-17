package level_1;

public class ������ȣ {

	public static void main(String[] args) {
		/*
		���� ����
		� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
		���� ��� "AB"�� 1��ŭ �и� "BC"�� �ǰ�, 3��ŭ �и� "DE"�� �˴ϴ�. 
		"z"�� 1��ŭ �и� "a"�� �˴ϴ�. ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, 
		solution�� �ϼ��� ������.

		���� ����
		������ �ƹ��� �о �����Դϴ�.
		s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
		s�� ���̴� 8000�����Դϴ�.
		n�� 1 �̻�, 25������ �ڿ����Դϴ�.
		����� ��
		s		n	result
		"AB"	1	"BC"
		"z"		1	"a"
		"a B z"	4	"e F d"
		*/
		������ȣ st = new ������ȣ();
		String s = "a B z";
		int n =4;
		String solution = st.solution(s, n);
		
		System.out.println(solution);

	}
	public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
        	char ch = s.charAt(i); 
        	if(ch >='a' && ch <='z') {
        		ch =(char)(ch+n);
        		if(ch>'z') {
        			ch-=26;
        		}
        	}
        	if(ch >='A' && ch <='Z') {
        		ch =(char)(ch+n);
        		if(ch>'Z') {
        			ch-=26;
        		}
        	}
        	answer += ch;
        }
        
        return answer;
    }

}
