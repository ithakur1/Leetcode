import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "lleetcode";
		
		int ans = firstUniqChar(s);
		System.out.println(ans);

	}
	
	/*
    Direclty compare first occurance of a character && last occurance, see if at same spot
 */
	
	public static int firstUniqChar(String s){
		
		if(s == null || s.length()==0){
			return -1;
		}
		
		for(int i=0;i<s.length();i++){
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
				return i;
			}
		}
		
		return -1;
	}

}
