package lecture_2;
import java.util.*; 
public class pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int spaces = -1;
        int stars = n/2 + 1;
        
        while(row <= n) {
        	//star
        	int i=1;
        	while(i <= stars) {
        		System.out.print("* ");
        		i = i + 1;
        	}
        	
        	//spaces
        	int j = 1;
        	while(j <= spaces) {
        		System.out.print("  ");
        		j = j + 1;
        	}
        	
        	//star
        	int k=1;
        	if(row == 1 || row == n) {
        		k = 2;
        	}
        	while(k <= stars) {
        		System.out.print("* ");
        		k = k + 1;
        	}
        	
        	//next row prepration
        	//mirror concept
        	if(row < n/2 + 1) {
        		spaces += 2;
        		stars--;
        	}else {
        		spaces -= 2;
        		stars++;
        	}
        	
        	row = row + 1;
        	System.out.println();
        }
	}

}
