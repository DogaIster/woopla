import java.io.*;
 
public class Coin {
   
    static int minCoins(int coins[], int amount)
    {
       int size = coins.length;

       // base case
       if (amount == 0) return 0;
       // base case
       if (size == 0) return -1;
     
       // Initialize result as the biggest number
       int result = Integer.MAX_VALUE;
     
       for (int i = 0; i < size; i++)
       {
         if (coins[i] <= amount)
         {
             int currentResult = minCoins(coins, amount-coins[i]);
     
             if (currentResult != Integer.MAX_VALUE && currentResult + 1 < result)
                result = currentResult + 1;
         }
       }
       if(result == Integer.MAX_VALUE) { // if it can't make the amount, it will return the biggest number
         return -1;
       } else{
         return result;
       }

    }
}