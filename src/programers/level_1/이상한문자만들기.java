package programers.level_1;

import java.util.Arrays;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		String answer = solution("try hello world");
		
		System.out.println(answer);

	}
	public static String solution(String s) {
		char[] arr = s.toCharArray();
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(" ".equals(arr[i])){
                cnt=0;
            }else{
                cnt++;
                if(cnt%2==0){
                	arr[i] = Character.toLowerCase(arr[i]);
                }else{
                	arr[i] = Character.toUpperCase(arr[i]);
                }
            }
        }
            
        return String.valueOf(arr);
    }

}
