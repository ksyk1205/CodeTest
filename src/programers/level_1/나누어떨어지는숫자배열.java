package programers.level_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor =5;
		int[] answer = solution(arr,divisor);
		
		System.out.println(Arrays.toString(answer));
	}
	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        
        if(list.size()==0){
        	int[] answer = {-1};
            return answer;
        }else{
            return list.stream().sorted().mapToInt(Integer :: intValue).toArray();
        }
		
    }

}
