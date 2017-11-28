package f17comp1030nov28;

import java.security.SecureRandom;

/**
 *
 * @author jwright
 */
public class DiceDistribution {
    public static void main(String[] args)
    {
        int[] sumOfDice = new int[13];
        
        //create a random number generator
        SecureRandom rng = new SecureRandom();
        
        //loop 1,000,000 times
        for (int i=1; i<=1000000; i++)
        {
            int die1 = rng.nextInt(6)+1;
            int die2 = rng.nextInt(6)+1;
            
            sumOfDice[die1+die2] = sumOfDice[die1+die2] + 1;
            //alternate ways of writing this
            //sumOfDice[die1+die2]++;
            //sumOfDice[die1+die2] += 1;
        }
        
        //display the results, start with the header
        for (int i=2; i<sumOfDice.length; i++)
        {
            System.out.printf("%8d", i);
        }
        
        System.out.println();
        
        //display the array contents
        for (int i=2; i<sumOfDice.length; i++)
        {
            System.out.printf("%8d", sumOfDice[i]);
        }
        
        System.out.println();
    }
}
