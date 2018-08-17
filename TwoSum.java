import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 7, 11, 15};
		int target = 9;
		
		int[] ans = twoSum(arr,target);
		
		System.out.print(ans);
		
		

	}
	
		public static int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
        
        Map<Integer,Integer> insertElement = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(insertElement.containsKey((target-nums[i]))){
                res[0] = insertElement.get((target-nums[i]));
                res[1] = i;
                break;
            }
            insertElement.put(nums[i],i);
        }
        
        return res;
        
    }

}
