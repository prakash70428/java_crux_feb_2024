package lecture_3;
import java.util.*;
public class dtoanybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int b = scn.nextInt();
	    
	    int ans = anybasetodecimal(n,b);
	    System.out.println(ans);
	}
	
	public static int anybasetodecimal(int n,int b) {
		int ans = 0 ;
		int power = 1;
		
		while(n != 0) {
			int r = n % 10;
			n = n / 10;
			
			ans = ans + (r*power);
			power *= b;
		}
		
		return ans;
	}
	
//	public static int dtoanybase(int n,int b) {
//		int ans = 0;
//		int power = 1;
//		
//		while(n != 0) {
//			int r = n % b;
//			n = n / b;
//			
//			ans = ans + (r * power);
//			power *= 10;
//		}
//		
//		return ans;
//	}

}
