package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ���ڿ���������������ϱ� {

	public static void main(String[] args) {
		/*
		���� ����
		���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
		���� ��� strings�� ["sun", "bed", "car"]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� "u", "e", "a"�� strings�� �����մϴ�.

		���� ����
		strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
		strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
		strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
		��� strings�� ������ ���̴� n���� Ů�ϴ�.
		�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
		����� ��
		strings					n	return
		["sun", "bed", "car"]	1	["car", "bed", "sun"]
		["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
		����� �� ����
		����� �� 1
		"sun", "bed", "car"�� 1��° �ε��� ���� ���� "u", "e", "a" �Դϴ�. 
		�̸� �������� strings�� �����ϸ� ["car", "bed", "sun"] �Դϴ�.

		����� �� 2
		"abce"�� "abcd", "cdx"�� 2��° �ε��� ���� "c", "c", "x"�Դϴ�. 
		���� ���� �Ŀ��� "cdx"�� ���� �ڿ� ��ġ�մϴ�. 
		"abce"�� "abcd"�� ���������� �����ϸ� "abcd"�� �켱�ϹǷ�, ���� ["abcd", "abce", "cdx"] �Դϴ�.
		*/
		String[] strings = {"abce","abcd","cdx"};
		
		String[] answer = solution(strings,1);
		
		System.out.println(Arrays.toString(answer));

	}
	public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        List<String> list = new ArrayList<String>();
        for(int i=0; i<answer.length; i++) {
        	list.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++) {
        	answer[i] =list.get(i).substring(1);
        }
        return answer;
    }

}
