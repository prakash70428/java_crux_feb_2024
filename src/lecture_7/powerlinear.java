package lecture_7;
import java.util.*;
public class powerlinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        
        System.out.print(Power(x,n));
	}
	
	public static int Power(int x,int n) {
		 if(n == 0) {
			 return 1;
		 }
		
		 int xpnm1 = Power(x , n - 1);
		 int xpn = xpnm1 * x;
		 return xpn;
	}
	
}
