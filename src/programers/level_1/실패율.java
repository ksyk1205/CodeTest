package programers.level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ½ÇÆÐÀ² {

	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4,4,4,4,4};
		int[] arr = solution(N,stages);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}

    static class Solves{
    	int key;
    	double value;
    	public Solves(int key, double value) {
    		this.key = key;
    		this.value = value;
    	}
    }
    public static int[] solution(int N, int[] stages) {
    	int people = stages.length;
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int i=0; i<people; i++) {
    		map.put(stages[i], map.getOrDefault(stages[i], 0)+1);
    	}
    	
    	List<Solves> list = new ArrayList<>();
    	for(int i=1; i<=N; i++) {
    		if(map.containsKey(i)) {
    			list.add(new Solves(i, (double)map.get(i)/people));
    			people-= map.get(i);
    		}else {
    			list.add(new Solves(i, 0));
    		}
    		
    	}
    	
    	Collections.sort(list,(o1,o2)->{
    		if(o1.value==o2.value) {
    			return o1.key -o2.key;
    		}
    		return Double.compare(o2.value, o1.value);
		});
    	
		return list.stream().mapToInt(o->o.key).toArray();
        
    }

}
