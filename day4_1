import java.io.File;
import java.util.Scanner;

public class day4 {

	public static boolean checkForWinner(boolean[][] table) 
	{
		boolean winner = false;
		
		//cycle through the rows to see if there are 5 in a row
		for(int i = 0; i <5;++i)
		{
			if (table[i][0] && table[i][1] && table[i][2] && table[i][3] && table[i][4])
			{
				winner = true;
				return winner;
			}
		}
		//cycle through the columns to see if there are 5 in a row
		for(int j = 0; j <5; ++j)
		{
			if (table[0][j] && table[1][j] && table[2][j] && table[3][j] && table[4][j])
			{
				winner = true;
				return winner;
			}
		}
		
		return winner;
	}
	
	
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\isabel\\Downloads\\aocd4test.txt");
        Scanner sc = new Scanner(file);

        //declare variables
        String input[]; //single line of inputs
        
        input = sc.nextLine().split(",");
       
        int inputs[] = new int[input.length];
        
        for(int i = 0; i<input.length; i++)
        {
        	inputs[i] = Integer.parseInt(input[i]);
        	//System.out.println(input[i] + ", " + inputs[i]);
        }
        
        int cardCounter = 0;
        
        //only can take 100 cards with this initialization
        int[][][] stackOfCards = new int[5][5][100];
        
        //place the bingo numbers into a 3 dimensional array of rows x columns x next card
    	while(sc.hasNextInt())
        {
    		for(int i =0; i< 25;)
            {
    			System.out.println("card " + cardCounter + " reads:");
    			for(int j = 0; j<5;++j)
    			{
    				for(int k=0; k<5;++k)
    				{
    					stackOfCards[j][k][cardCounter] = sc.nextInt();
    					System.out.print(stackOfCards[j][k][cardCounter] + " ");
    					++i;
    				}
    				System.out.println();
    			}
            }
    		cardCounter++;
        }
        
    	int currentPosition = 0; //which number is being read off from inputs
    	int currentNumber = inputs[0];
    	boolean tf[][][] = new boolean[100][5][5];
    	int winningCard = -1;
    	
    	
    	playBingo: {
    		while(currentPosition<input.length)
	    	{
	    		for(int i = 0; i<cardCounter; ++i)
	    		{
	    			for(int j = 0; j<5; ++j)
	    			{
	    				for(int k = 0; k<5; ++k)
	    				{
	    					if (currentNumber == stackOfCards[j][k][i])
	    					{
	    						System.out.println("we have a match! current number is: " + currentNumber
	    								+ " current card is: " + i);
	    						tf[i][j][k] = true;
	    						
	    						if(checkForWinner(tf[i]))
		    					{
		    						winningCard=i;
		    						System.out.println("winningCard is:" + winningCard);
		    						break playBingo;
		    					}
	    					}
	    					
	    				}
	    			}
	    		}
	    		++currentPosition;
	    		currentNumber= inputs[currentPosition];
	    	}
    	}
    	
    	System.out.println("current position is: " + currentPosition + " currentNumber is: " + currentNumber
    			+ " winning card is: " + winningCard);
    	
    	int sum = 0; //sum of all unmarked numbers on the board
    	
    	for(int j = 0; j<5; ++j)
		{
			for(int k = 0; k<5; ++k)
			{
				if(!tf[winningCard][j][k])
				{
					sum += stackOfCards[j][k][winningCard];
				}
			}
		}
    	System.out.println("sum is: " + sum);
    	
    	System.out.println("answer is: " + sum*currentNumber);
    	
    	
        sc.close();
	}

}
