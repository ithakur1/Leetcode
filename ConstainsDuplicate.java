import java.util.HashMap;
import java.util.Map;

public class ConstainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,3};
		
		System.out.println(containsDuplicate(arr));

	}
	
	public static boolean containsDuplicate(int[] arr){
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int ele: arr){
			if(map.containsKey(ele)){
				return true;
			}else {
				map.put(ele, 1);
			}
		}
		
		
		return false;
	}

}
