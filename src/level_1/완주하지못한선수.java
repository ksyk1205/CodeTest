package level_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class �����������Ѽ��� {

	public static void main(String[] args) {
		/*
		���� ����
		������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

		�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

		���ѻ���
		������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
		completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
		�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
		������ �߿��� ���������� ���� �� �ֽ��ϴ�.
		����� ��
		participant	completion	return
		["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
		["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
		["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
		����� �� ����
		���� #1
		"leo"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

		���� #2
		"vinko"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

		���� #3
		"mislav"�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.
		*/
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String solution = solution(participant,completion);
		System.out.println(solution);
		
	}
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<String, Integer>();
        
        
        for(int i=0; i<participant.length; i++) {
        	int count =0;
        	if(map.containsKey(participant[i])) {
        		count = map.get(participant[i]);
        	}
        	map.put(participant[i], ++count);
        	
        }	
        
        for(int i=0; i<completion.length; i++) {
        	map.put(completion[i], map.get(completion[i])-1);
        }
        
        for(String key : map.keySet()) {
            if(map.get(key)==1) {
            	answer = key;
            }
        }

        
        return answer;
    }

}
