package programers.level_1;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		String solution = solution(participant,completion);
		System.out.println(solution);
		
	}
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(String str : participant) {
        	map.put(str, map.getOrDefault(str, 0)+1);
        }
        
        for(String str : completion) {
        	map.put(str, map.get(str)-1);
        }
        
        for(String key : map.keySet()) {
        	if(map.get(key)==1) {
        		answer=key;
        	}
        }
        
        return answer;
    }

}
