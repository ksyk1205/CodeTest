
public class test {
	
	public static void main(String[] arg) {
		 reLoad(0);
	}
	private static void reLoad(int i) {
		if(i==2) {
			return;
		}
		for(int j=0;j<6;++j) {
	         System.out.println(j+1);
	         reLoad(i+1);         
	     }
	}
}
