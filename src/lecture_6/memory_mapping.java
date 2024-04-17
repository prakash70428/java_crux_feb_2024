package lecture_6;
import java.util.*;
public class memory_mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "Hey";
        String s2 = "Bye";
        s1 = s1 + s2;
        
        String str = new String("Hello");
        String str1 = new String("bye");
        str = str + str1;
        
        s2 = s2 + "okay";
        String s = "hello" + "world";
	}

}
