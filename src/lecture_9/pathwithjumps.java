package lecture_9;
import java.util.*;
public class pathwithjumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     int m = scn.nextInt();    
	     System.out.println(getMazePathswithJumps(0,0,n-1,m-1));
	}
	
	public static ArrayList<String> getMazePathswithJumps(int sr,int sc,int dr,int dc){
		if(sr == dr && sc == dc) {
			ArrayList<String> bans = new ArrayList<>();
			bans.add("");
			return bans;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		//horizontal
		for(int jump=1;jump <= dc - sc;jump++) {
			ArrayList<String> rr = getMazePathswithJumps(0,sc+jump,dr,dc);
			for(int i=0 ;i < rr.size();i++) {
				mr.add("h" + jump + rr.get(i));
			}
		}
		//veritical
		for(int jump=1;jump <= dr - sr;jump++) {
			ArrayList<String> rr = getMazePathswithJumps(sr+jump,sc,dr,dc);
			for(int i=0 ;i < rr.size();i++) {
				mr.add("v" + jump + rr.get(i));
			}
		}
		//diagnol
		for(int jump=1;jump <= dc - sc && jump <= dr - sr;jump++) {
			ArrayList<String> rr = getMazePathswithJumps(sr+jump,sc+jump,dr,dc);
			for(int i=0 ;i < rr.size();i++) {
				mr.add("d" + jump + rr.get(i));
			}
		}
		
		return mr;
	}

}
