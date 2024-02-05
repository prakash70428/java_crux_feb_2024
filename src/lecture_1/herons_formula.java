package lecture_1;
import java.util.*;
public class herons_formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        
        int s = (a+b+c) / 2;
        int A = (int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println(A);
        
	}

}
