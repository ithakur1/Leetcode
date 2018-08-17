import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistributeCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,2,2,3,3};
		int ans = distributeCandies(arr);
		System.out.println(ans);
	}
	
	public static int distributeCandies(int[] candies){
		
		
		Set<Integer> unique = new HashSet<Integer>();
		
		for(int candy : candies){
			unique.add(candy);
		}
		
		return Math.min(candies.length/2, unique.size());
	}	

}
