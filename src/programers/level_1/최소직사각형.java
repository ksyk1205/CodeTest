package programers.level_1;

import java.util.PriorityQueue;
import java.util.Queue;

public class 최소직사각형 {

	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(sizes));

	}
	public static int solution(int[][] sizes) {
        Queue<Integer> width = new PriorityQueue<>((o1,o2)->{
        	return o2 - o1;
        });
        
        Queue<Integer> height = new PriorityQueue<>((o1,o2)->{
        	return o2 - o1;
        });
        

      for(int i=0; i<sizes.length; i++) {
        	int num1 = sizes[i][0];
        	int num2 = sizes[i][1];
        	if(num1<num2) {
        		width.add(num2);
        		height.add(num1);
        	}else {
        		width.add(num1);
        		height.add(num2);
        	}
        }

        return width.peek()*height.peek();
    }
}	
