package lecture_2;
import java.util.*;
public class pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int spaces = n - 1;
        int stars = 1;
        int val = 1;
        
        while(row <= 2*n - 1) {
        	//spaces
        	int i = 1;
        	while(i <= spaces) {
        		System.out.print("  ");
        		i = i + 1;
        	}
        	
        	//stars
        	int j = 1;
        	int p = val;
        	while(j <= stars) {
        		System.out.print(p + " ");
        		if(j < stars/2 + 1) {
        			p++;
        		}else {
        			p--;
        		}
        		
        		j = j + 1;
        	}
        	
        	//next row prepration
        	//mirror concept
        	if(row < n) {
        		spaces--;
        		stars += 2;
        		val++;
        	}else {
        		spaces++;
        		stars -= 2;
        		val--;
        	}
        	
        	row++;
        	System.out.println();
        	
        }
	}

}
