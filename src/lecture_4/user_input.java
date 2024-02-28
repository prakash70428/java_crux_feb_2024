package lecture_4;
import java.util.*;
public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        display(arr);
	}
	
	public static void display(int[] arr) {
        for(int i=0 ; i < arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
