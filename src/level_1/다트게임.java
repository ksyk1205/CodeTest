package level_1;

public class ��Ʈ���� {

	public static void main(String[] args) {
		/*
		���� ����
		��Ʈ ����
		īī���忡 �� �� ��° ��! �ɽ��� ��? īī���� ���Ӻ�~

		Game Star

		īī���� ���Ӻ��� �Ϲݱ� �ű� ���񽺷� ��Ʈ ������ ����ϱ�� �ߴ�. ��Ʈ ������ ��Ʈ�ǿ� ��Ʈ�� �� ���� ���� �� ������ �հ�� �Ƿ��� �ܷ�� ��������, ��ΰ� ������ ��� �� �ִ�.
		�� �Ի��� ������ �ڵ� �Ƿ��� �����޾� ������ �ٽ� �κ��� ���� ��� ������ �ð� �Ǿ���. ��Ʈ ������ ���� ��� ������ �Ʒ��� ����.

		��Ʈ ������ �� 3���� ��ȸ�� �����ȴ�.
		�� ��ȸ���� ���� �� �ִ� ������ 0������ 10�������̴�.
		������ �Բ� Single(S), Double(D), Triple(T) ������ �����ϰ� �� ���� ��÷ �� �������� 1����, 2����, 3���� (����1 , ����2 , ����3 )���� ���ȴ�.
		�ɼ����� ��Ÿ��(*) , ������(#)�� �����ϸ� ��Ÿ��(*) ��÷ �� �ش� ������ �ٷ� ���� ���� ������ �� 2��� �����. ������(#) ��÷ �� �ش� ������ ���̳ʽ��ȴ�.
		��Ÿ��(*)�� ù ��° ��ȸ������ ���� �� �ִ�. �� ��� ù ��° ��Ÿ��(*)�� ������ 2�谡 �ȴ�. (���� 4�� ����)
		��Ÿ��(*)�� ȿ���� �ٸ� ��Ÿ��(*)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ��Ÿ��(*) ������ 4�谡 �ȴ�. (���� 4�� ����)
		��Ÿ��(*)�� ȿ���� ������(#)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ������(#)�� ������ -2�谡 �ȴ�. (���� 5�� ����)
		Single(S), Double(D), Triple(T)�� �������� �ϳ��� �����Ѵ�.
		��Ÿ��(*), ������(#)�� �������� �� �� �ϳ��� ������ �� ������, �������� ���� ���� �ִ�.
		0~10�� ������ ���� S, D, T, *, #�� ������ ���ڿ��� �Էµ� �� �������� ��ȯ�ϴ� �Լ��� �ۼ��϶�.

		�Է� ����
		"����|���ʽ�|[�ɼ�]"���� �̷���� ���ڿ� 3��Ʈ.
		��) 1S2D*3T

		������ 0���� 10 ������ �����̴�.
		���ʽ��� S, D, T �� �ϳ��̴�.
		�ɼ��� *�̳� # �� �ϳ��̸�, ���� ���� �ִ�.
		��� ����
		3���� ��ȸ���� ���� ���� �հ迡 �ش��ϴ� �������� ����Ѵ�.
		��) 37

		����� ����
		����	dartResult	answer	����
		1	1S2D*3T		37	11 * 2 + 22 * 2 + 33
		2	1D2S#10S	9	12 + 21 * (-1) + 101
		3	1D2S0T		3	12 + 21 + 03
		4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
		5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
		6	1T2D3D#	-4	13 + 22 + 32 * (-1)
		7	1D2S3T*	59	12 + 21 * 2 + 33 * 2
		*/ 
		String dartResult = "1S2D*3T";
		int answer = solution(dartResult);
		System.out.println(answer);
		
	}
	public static int solution(String dartResult) {
        int[] arr = new int[3];
        int count=0;
        for(int i=0; i<dartResult.length(); i++) {
        	char n = dartResult.charAt(i);
        	int dartInt = Character.getNumericValue(n);
        	if(dartInt>=0&&dartInt<=9) {
        		if(dartInt ==1) {
        			//10�� ��� 
	        		if(Character.getNumericValue(dartResult.charAt(i+1))==0) {
	        			dartInt = 10;
	        			i++;
	        		}
        		}
        		arr[count++] = dartInt;
        	}else {
        		switch(n){
        			case 'S' :
        				arr[count-1] = (int) Math.pow(arr[count-1], 1);
        				break;
        			case 'D' :
        				arr[count-1] = (int) Math.pow(arr[count-1], 2);
        				break;
        			case 'T' :
        				arr[count-1] = (int) Math.pow(arr[count-1], 3);
        				break;
        			case '*' :
        				int option = count-1;
        				if(option!=0) {
        					for(int j=option-1; j<=option; j++ ) {
        						arr[j] =arr[j]*2;
        					}
        				}else {
        					arr[option] = arr[option]*2;
        				}
        				break;
        			case '#' :
        				arr[count-1] = arr[count-1]*-1;
        				break;
        		}
        	}
        	
        }
        int answer = 0;
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
        return answer;
    }


}
