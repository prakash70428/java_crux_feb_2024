package lecture_1;
import java.util.*;
public class count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
