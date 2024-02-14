package lecture_2;
import java.util.*;
public class pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
	        
	        int row = 1;
	        int space = n - 1;
	        int star = 1;
	        
	        while(row <= n) {
	        	//spaces
	        	int i = 1;
	        	while(i <= space) {
	        		System.out.print("  ");
	        		i = i + 1;
	        	}
	        	
	        	//star
	        	int j = 1;
	        	int val = 1;
	        	while(j <= star) {
	        		System.out.print(val + " ");
	        		j = j + 1;
	        		if(j < star/2 + 1) {
	        			val++;
	        		}else {
	        			val--;
	        		}
	        		
	        	}
	        	
	        	//next row prepration
	        	row = row + 1;
	        	System.out.println();
	        	space = space - 1;
	        	star = star + 2;
	        	
	        }  
	}

}
