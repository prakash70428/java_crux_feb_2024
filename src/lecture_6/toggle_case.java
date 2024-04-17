package lecture_6;
import java.util.*;
public class toggle_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(togglecase(str));
	}
	
	public static String togglecase(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i < str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				sb.append((char)(ch - 'a' + 'A'));
			}else {
				sb.append((char)(ch - 'A' + 'a'));
			}
		}
		
		return sb.toString();
	}

}
