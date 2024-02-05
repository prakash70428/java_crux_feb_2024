package lecture_1;
import java.util.*;
public class sum_of_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int i = 1;
        int sum = 0;
        while(i <= n) {
        	sum = sum + i;
        	i = i + 1;
        }
        
        System.out.println(sum);
	}

}
