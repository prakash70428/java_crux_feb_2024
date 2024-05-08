package lecture_8;
import java.util.*;
public class lastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     int[] arr = new int[n];
	     for(int i=0;i < n;i++) {
	    	 arr[i] = scn.nextInt();
	     }
	     
	     int x = scn.nextInt();
	     
	     int ans = lastIndex(arr,0,x);
	     System.out.println(ans);
	}

	public static int lastIndex(int[] arr,int idx,int x) {
		if(idx == arr.length) {
			return -1;
		}
		
		int rr = lastIndex(arr,idx + 1,x);
		if(rr == -1) {
			if(arr[idx] == x) {
				return idx;
			}else {
				return -1;
			}
		}else {
			return rr;
		}
	}
}
