package programers.level_1;

import java.util.Arrays;

public class k¹øÂ°¼ö {

	public static void main(String[] args) {

		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1},{1, 7, 3}};
		
		int[] solution = solution(array,commands);
		
		System.out.println(Arrays.toString(solution));
		
	}
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
        for(int a=0; a<commands.length; a++){
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            
            int[] arr = new int[j-i+1];
            for(int b=0; b<arr.length; b++){
                arr[b] = array[i+b-1];
            }
            Arrays.sort(arr);
            answer[a] = arr[k-1];
        }
        return answer;
    }

}
