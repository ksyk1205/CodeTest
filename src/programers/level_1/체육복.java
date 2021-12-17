package programers.level_1;

import java.util.Arrays;

public class 체육복 {
	public static void main(String[] args) {
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		int result = solution(5,lost,reserve);
		System.out.println(result);
	}
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //여벌 체육복을 가져온 학생이 도난당했을 경우
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(lost[i]==reserve[j]) {
        			answer++;
        			lost[i]=reserve[j]=-1;
        			break;
        		}
        	}
        }
        
        for(int lostP : lost) {
        	for(int i=0; i<reserve.length; i++) {
        		if(reserve[i]==lostP-1 || reserve[i]==lostP+1) {
        			answer++;
        			reserve[i]=-1;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
