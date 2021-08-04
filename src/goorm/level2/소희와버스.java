package goorm.level2;

import java.util.Scanner;

public class ¼ÒÈñ¿Í¹ö½º {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	    int n= Integer.parseInt(str.split(" ")[0]);
	    int t= Integer.parseInt(str.split(" ")[1]);
	    int[][] arr = new int[n][2];
	    for(int i = 0; i<n;++i) {
	       str = sc.nextLine();
	       int s= Integer.parseInt(str.split(" ")[0]);
	       int d= Integer.parseInt(str.split(" ")[1]);
	       arr[i][0] =s;
	       arr[i][1] =d;
	    }
		
		
		System.out.println(solution(arr,n,t));
	    System.out.println();
	    System.out.println();

			
		}
		public static int solution(int[][] arr,int n, int t) {
			int idx = 0;
			int min = Integer.MAX_VALUE;
				for(int i =0;i<arr.length;++i) {
						int s = arr[i][0];
						int d = arr[i][1];
						while(s < t) {
							s+=d;
						}
						if(t == s)
							return i+1;
						if(min > s-t) {
							min = s-t;
							idx = i;
						}
				}
				return idx+1;
	    }

}
