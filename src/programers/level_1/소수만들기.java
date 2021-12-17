package programers.level_1;

public class 소수만들기 {
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		int result = solution(nums);
		System.out.println(result);
	}
	public static int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length; i++) {
        	for(int j=i+1; j<nums.length; j++) {
        		for(int z=j+1; z<nums.length; z++) {
        			if(sosu(nums[i]+nums[j]+nums[z])) {
        				answer++;
        			}
        		}
        	}
        }

        return answer;
    }
	private static boolean sosu(int num) {
		if(num==2) {
			return true;
		}
		for(int i=2; i<num; i++ ) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
