package lecture_2;
import java.util.*;
public class pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int star = 1;
        
        while(row <= 2*n - 1) {
        	//star
        	int i = 1;
        	while(i <= star) {
        		System.out.print("* ");
        		i = i + 1;
        	}
        	
        	//next row prepration
        	//mirror concept
        	if(row < n) {
        		star = star + 1;
        	}else {
        		star = star - 1;
        	}
        	
        	row = row + 1;
        	System.out.println();
        }
	}

}
