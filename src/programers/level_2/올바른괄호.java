package programers.level_2;

import java.util.Stack;

public class �ùٸ���ȣ {

	public static void main(String[] args) {
		/*
		���� ����
		��ȣ�� �ٸ��� ¦�������ٴ� ���� '(' ���ڷ� �������� �ݵ�� ¦��� ')' ���ڷ� ������ �Ѵٴ� ���Դϴ�. ���� ���

		"()()" �Ǵ� "(())()" �� �ùٸ� ��ȣ�Դϴ�.
		")()(" �Ǵ� "(()(" �� �ùٸ��� ���� ��ȣ�Դϴ�.
		'(' �Ǵ� ')' �θ� �̷���� ���ڿ� s�� �־����� ��, ���ڿ� s�� �ùٸ� ��ȣ�̸� true�� return �ϰ�, �ùٸ��� ���� ��ȣ�̸� false�� return �ϴ� solution �Լ��� �ϼ��� �ּ���.

		���ѻ���
		���ڿ� s�� ���� : 100,000 ������ �ڿ���
		���ڿ� s�� '(' �Ǵ� ')' �θ� �̷���� �ֽ��ϴ�.
		����� ��
		s	answer
		"()()"	true
		"(())()"	true
		")()("	false
		"(()("	false
		����� �� ����
		����� �� #1,2,3,4
		������ ���ÿ� �����ϴ�.
		*/
		String s = "()()";
		boolean answer = solution(s);
		System.out.println(answer);
	}
	static boolean solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) =='('){
                stack.push(s.charAt(i));
            }else {
            	if(stack.isEmpty()) {
            		return false;
            	}
            	stack.pop();
            }
        }
        if(stack.isEmpty()) {
        	return true;
        }
		return false;
     }
}
