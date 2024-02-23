package lecture_3;
import java.util.*;
public class anybase_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        
        int sol = getsum(n1,n2,b);
        System.out.println(sol);
	}
	
	public static int getsum(int n1,int n2,int b) {
		int ans = 0;
		int carry = 0;
		int power = 1;
		
		while(n1 != 0 || n2 != 0 || carry != 0) {
			int ldn1 = n1 % 10;
			int ldn2 = n2 % 10;
			n1 /= 10;
			n2 /= 10;
			
			int sum = ldn1 + ldn2 + carry;
			int q = sum / b;
			int r = sum % b;
			
			ans += (r * power);
			carry = q;
			power *= 10;
		}
		
		return ans;
	}

}
