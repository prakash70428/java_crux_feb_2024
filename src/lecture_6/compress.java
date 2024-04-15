package lecture_6;
import java.util.*;
public class compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(compress1(str));        
	}
	
	public static String compress1(String str) {
		String ans = "";
		ans += str.charAt(0);
		
		for(int i=1;i < str.length();i++) {
			if(str.charAt(i) != ans.charAt(ans.length() - 1)) {
				ans += str.charAt(i);
			}
		}
		
		return ans;
	}

}
