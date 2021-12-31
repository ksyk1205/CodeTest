package programers.level_1;

public class _1차비밀지도 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] str = solution(n,arr1,arr2);
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}

	}
	 public static String[] solution(int n, int[] arr1, int[] arr2) {
		 String[] answer = new String[arr1.length];
		 for(int i=0; i<arr1.length; i++) {
			 String str1 = Integer.toBinaryString(arr1[i]);
			 StringBuilder sb1 = new StringBuilder(str1);
			 while(sb1.length()<n) {
				 sb1.insert(0, "0");
			 }
			 String str2 = Integer.toBinaryString(arr2[i]);
			 StringBuilder sb2 = new StringBuilder(str2);
			 while(sb2.length()<n) {
				 sb2.insert(0, "0");
			 }
			 String arrSt = "";
			 for(int j=0; j<sb1.length(); j++) {
				 if(sb1.substring(j, j+1).equals("1")
						 || sb2.substring(j, j+1).equals("1")) {
					 arrSt+="#";
				 }else {
					 arrSt+=" ";
				 }
			 }
			 answer[i] = arrSt;
			 
			 
		 }
	     return answer;
	 }  
}
