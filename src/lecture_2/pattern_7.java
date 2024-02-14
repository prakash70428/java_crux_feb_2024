package lecture_2;
import java.util.*; 
public class pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int spaces = 0;
        int stars = n;
        
        while(row <= 2*n - 1) {
        	//spaces
        	int i = 1;
        	while(i <= spaces) {
        		System.out.print("  ");
        		i = i + 1;
        	}
        	
        	//stars
        	int j = 1;
        	while(j <= stars) {
        		System.out.print("* ");
        		j = j + 1;
        	}
        	
        	//next row prepration
        	//mirror concept
        	if(row < n) {
        		spaces += 2;
        		stars--;
        	}else {
        		spaces -= 2;
        		stars++;
        	}
        	
        	row++;
        	System.out.println();
        	
        }
	}

}
