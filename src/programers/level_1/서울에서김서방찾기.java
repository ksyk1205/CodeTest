package programers.level_1;

public class ���￡���輭��ã�� {

	public static void main(String[] args) {
		/*
		���� ����
		String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. 
		seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

		���� ����
		seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
		seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
		"Kim"�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
		����� ��
		seoul	return
		["Jane", "Kim"]	"�輭���� 1�� �ִ�"
		*/
		String[] seoul = {"Jane","Kim","Lee"};
		
		String s = solution(seoul);
		
		System.out.println(s);
	}
	public static String solution(String[] seoul) {
        int idx = 0;
        for(;idx<seoul.length; idx++) {
        	if("Kim".equals(seoul[idx])) {
        		break;
        	}
        }
        return "�輭���� "+ idx+"�� �ִ�.";

	}
}
