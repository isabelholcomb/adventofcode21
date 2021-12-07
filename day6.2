import java.io.File;
import java.util.Scanner;

public class day6 {

	public static void main(String[] args) throws Exception {
		
		//declare variables
		File file = new File("C:\\Users\\isabel\\Downloads\\aocd6.txt");
        Scanner sc = new Scanner(file);
        long fishList[] = new long[9];
        String line;
        long numFish = 0;
        
 
    	line = sc.nextLine();
    	line = line.replaceAll(",", "");
    	
    	
    	//count how many fish are each time interval
    	for(int i = 0; i <line.length(); ++i)
    	{
    		fishList[(int)Character.getNumericValue(line.charAt(i))]++;
    		numFish++;
    	}
    	
    	//check to make sure input values are correct
        
    	for(int i = 0; i < fishList.length; ++i)
    	{
    		System.out.print(fishList[i] + ",");
    	}
    	

        //cycle through each time interval. move the fish to their newly allocated time interval
        long numNewFish = 0; //keeps track of how many new fish as well as how many to reset
        
        for(int day = 1; day <=256; ++day)
        {
        	//System.out.println(numFish);
        	for(int i= 0; i<fishList.length; ++i)
        	{
        		if(i == 0)
        		{
        			numNewFish = fishList[i]; //keeps track of them in a variable so we can use it later
        		}
        		else
        		{
        			//decrease internalTimer
        			fishList[i-1] = fishList[i];
        		}
        	}
        	//add in new fish at the end of each day
        	fishList[6] = fishList[6] + numNewFish; //the regenerated time interval fish
        	fishList[8] = numNewFish;
        	numFish += numNewFish;
        	
        	System.out.println();
        	for(int i = 0; i < fishList.length; ++i)
        	{
        		System.out.print(fishList[i] + ",");
        	}
        	System.out.println("After " + day + " days: " + numFish);
        }
        sc.close();
	}

}
