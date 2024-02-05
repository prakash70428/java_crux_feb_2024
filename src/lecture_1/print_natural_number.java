package lecture_1;
import java.util.*;
public class print_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int i = 1;
        while(i <= n) {
        	System.out.println(i);
        	i = i + 1;
        }
	}

}
