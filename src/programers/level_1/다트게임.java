package programers.level_1;

import java.util.Arrays;

public class 다트게임 {

	public static void main(String[] args) {
		String dartResult = "1D2S3T*";
		int answer = solution(dartResult);
		System.out.println(answer);
		
	}
	public static int solution(String dartResult) {
		int[] arr = new int[3];
		int cnt = 0;
		for(int i=0; i<dartResult.length(); i++) {
			char ch = dartResult.charAt(i);
			int num = Character.getNumericValue(ch);
			if(num>=0 && num<=9) {
				if(num==1) {
					if(Character.getNumericValue(dartResult.charAt(i+1))==0) {
						num = 10;
						i++;
					}
				}
				arr[cnt++] = num;
			}else {
				switch(ch) {
					case 'S' : 
						arr[cnt-1] = (int) Math.pow(arr[cnt-1], 1);
						break;
					case 'D' :
						arr[cnt-1] = (int) Math.pow(arr[cnt-1], 2);
						break;
					case 'T' :
						arr[cnt-1] = (int) Math.pow(arr[cnt-1], 3);
						break;
					case '*' :
						int option = cnt-1;
						if(option!=0) {
							for(int j=option-1; j<=option; j++) {
								arr[j]*=2;
							}
						}else {
							arr[option]*=2;
						}
						
						break;
					case '#' :
						arr[cnt-1] *=(-1);
						break;
				}
			}
		}
		return Arrays.stream(arr).reduce(0,(a,b)->a+b);
    }
}
