import java.util.Arrays;
class MinNumCoin4change {
  public static int minNumberOfCoinsForChange(int n, int[] denoms) {
    // Write your code here.
		if (n == 0){
			return 0;
		}
		int [] numsCoin = new int[n + 1];
		Arrays.fill(numsCoin, Integer.MAX_VALUE);
	  numsCoin[0] = 0;
		int compareNum = 0; 
		for (int denom : denoms){
			for (int amount = 0 ; amount < numsCoin.length; amount++ ){
				if (denom <= amount){
					if(numsCoin[amount - denom] == Integer.MAX_VALUE){
							compareNum = numsCoin[amount - denom];
				}else{
					compareNum = numsCoin[amount - denom]+ 1;
				}
				numsCoin[amount] = Math.min(numsCoin[amount], compareNum);
				}
			}
		}
		if(numsCoin[n] == Integer.MAX_VALUE){
			return -1;
		}
   	return numsCoin[n];
  }
}
