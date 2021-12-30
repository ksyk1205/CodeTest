package programers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] solution = solution(numbers);
		
		System.out.println(Arrays.toString(solution));

	}
	public static int[] solution(int[] numbers) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				int sum = numbers[i]+numbers[j];
				if(list.indexOf(sum)<0) {
					list.add(sum);
				}
			}
		}
		
		Collections.sort(list);
		
		return list.stream().mapToInt(Integer::intValue).toArray();
		
    }

}
