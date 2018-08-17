
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1534236469;
		int result = reverse(num);
		System.out.println(result);

	}
	
	public static int reverse(int x){
		
		int ans = 0;
		int temp = 0;
		
		
		int new_ans = 0;
		
		
		
		
		while(x!=0){
			temp = x%10;
			new_ans = ans*10 + temp;
			x = x/10;
			
			if((new_ans-temp)/10 != ans){
				return 0;
			}
			ans = new_ans;
			
		}
		
		return ans;
		
	}

}
