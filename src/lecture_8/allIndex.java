package lecture_8;
import java.util.*;
public class allIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     int[] arr = new int[n];
	     for(int i=0;i < n;i++) {
	    	 arr[i] = scn.nextInt();
	     }
	     
	     int x = scn.nextInt();
	     
	     
	}
	
	public static int[] allIndices(int[] arr,int idx,int x,int fsf) {
		if(idx == arr.length) {
			int[] ans = new int[fsf];
			return ans;
		}
		
		if(arr[idx] == x) {
			fsf++;
		}
		int[] rr = allIndices(arr,idx + 1,x, fsf);
		if(arr[idx] == x) {
			rr[fsf - 1] = idx;
		}
		
		return rr;
	}

}
