package programers.level_1;

import java.util.Scanner;

public class �Ҽ�ã�� {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		int count = solution(n);
		
		System.out.println("����     �Ҽ��� ����");
		System.out.println(n+"      "+count);

	}
	
	private static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=2; i<=n; i++) {
        	arr[i]=i;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
        	if(arr[i]==0) continue;
        	for(int j=2*i; j<=n; j+=i) {
        		arr[j]=0;
        	}
        }
        for(int i=2; i<arr.length; i++) {
        	if(arr[i]!=0) answer++; 
        }
        return answer;
    }

}
