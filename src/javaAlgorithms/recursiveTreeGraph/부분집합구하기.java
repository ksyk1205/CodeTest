package javaAlgorithms.recursiveTreeGraph;


public class 부분집합구하기 {
	static int n;
	static int[] ch;
	public static void main(String[] args) {
		n = 3;
		ch = new int[n+1];
		DFS(1);
	}
	private static void DFS(int i) {
		if(i>n) {
			String tmp = "";
			for(int j=1; j<ch.length; j++) {
				if(ch[j]==1) {
					tmp+=j+" ";
				}
			}
			if(tmp.length()>0) {
				System.out.println(tmp);
			}
		}else {
			ch[i]=1;
			DFS(i+1);
			ch[i]=0;
			DFS(i+1);
			
		}
	}
}
