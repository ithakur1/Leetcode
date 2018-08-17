
public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 499979;
		int ans = countPrimes(num);
		System.out.println(ans);

	}

	/*public static int countPrimes(int n) {
		
		int count = 0;
		
		for(int i=2;i<n;i++){
			if(isPrime(i)){
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
*/
	public static int countPrimes(int n){
		boolean[] notPrime = new boolean[n];
	    int count = 0;
	    for (int i = 2; i < n; i++) {
	        if (notPrime[i] == false) {
	            count++;
	            for (int j = 2; i*j < n; j++) {
	                notPrime[i*j] = true;
	            }
	        }
	    }
	    
	    return count;
	}
		
	}
	

