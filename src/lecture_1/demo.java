package lecture_1;
import java.util.*;
public class demo {
	public static void main(String[] args){
//       System.out.println("* * * * *");
//       System.out.println("      *");
//       System.out.println("    *");
//       System.out.println("  *");
//       System.out.println("* * * * *");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int count = 0;
		while(n != 0) {
			n = n / 10;
			count = count + 1;
		}
		
		System.out.println(count);
	}

}
 