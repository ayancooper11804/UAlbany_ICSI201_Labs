import java.util.Random;   // Needed for the Random class

/**
   This class simulates rolling a pair of dice 10,000 times
   and counts the number of times doubles of are rolled for
   each different pair of doubles.
*/

public class DiceSimulation
{
   public static void main(String[] args)
   {
      final int NUMBER = 10000;  // Number of dice rolls

      // A random number generator used in
      // simulating the rolling of dice
      Random generator = new Random();

      int die1Value;       // Value of the first die
      int die2Value;       // Value of the second die
      int count = 0;       // Total number of dice rolls
      int snakeEyes = 0;   // Number of snake eyes rolls (rolling two 1s)
      int twos = 0;        // Number of double two rolls
      int threes = 0;      // Number of double three rolls
      int fours = 0;       // Number of double four rolls
      int fives = 0;       // Number of double five rolls
      int sixes = 0;       // Number of double six rolls

      // TASK #1 Enter your code for the algorithm here
      //Requires a while loop, an if statement, and an if-else-if statement nested
      //within the if statement
      
		/*
		Repeat while the number of dice rolls are less than the number of times the dice 
		should be rolled.
			Get the value of the first die by “rolling” the first die
			Get the value of the second die by “rolling” the second die
			If the value of the first die is the same as the value of the second die
				If value of first die is 1
					Increment the number of times snake eyes were rolled
				Else if value of the first die is 2
					Increment the number of times twos were rolled
				Else if value of the first die is 3
					Increment the number of times threes were rolled
				Else if value of the first die is 4
					Increment the number of times fours were rolled
				Else if value of the first die is 5
					Increment the number of times fives were rolled
				Else if value of the first die is 6
					Increment the number of times sixes were rolled
			Increment the number of times the dice were rolled
		 */
      
      while (count < NUMBER) {
    	  die1Value = generator.nextInt(1,7);
    	  die2Value = generator.nextInt(1,7);
    	  if (die1Value == die2Value) {
    		  if (die1Value == 1) {
    			  //snakeEyes
    			  snakeEyes++;
    		  }
    		  else if (die1Value == 2) {
    			  //twos
    			  twos++;
    		  }
    		  else if (die1Value == 3) {
    			  //threes
    			  threes++;
    		  }
    		  else if (die1Value == 4) {
    			  //fours
    			  fours++;
    		  }
    		  else if (die1Value == 5) {
    			  //fives
    			  fives++;
    		  }
    		  else if (die1Value == 6) {
    			  //sixes
    			  sixes++;
    		  }
    	  }
    	  count++;
      }
      
      // Display the results
      System.out.println ("You rolled snake eyes " +
                          snakeEyes + " out of " +
                          count + " rolls.");
      System.out.println ("You rolled double twos " +
                          twos + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double threes " +
                          threes + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double fours " +
                          fours + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double fives " +
                          fives + " out of " + count +
                          " rolls.");
      System.out.println ("You rolled double sixes " +
                          sixes + " out of " + count +
                          " rolls.");
   }
}