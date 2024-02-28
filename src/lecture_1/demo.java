package lecture_1;
import java.util.*;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        System.out.println("* * * * *");
//        System.out.println("      * ");
//        System.out.println("    *");
//        System.out.println("  *");
//        System.out.println("* * * * *");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int ans = add(a,b);
		System.out.println(ans);
	} 
	
	public static int add(int a,int b) {
		int c = a + b;
		return c;
	}

}
 