import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class day6 {

	public static void main(String[] args) throws Exception {
		
		//declare variables
		File file = new File("C:\\Users\\isabel\\Downloads\\aocd6.txt");
        Scanner sc = new Scanner(file);
        ArrayList<Integer> fishList = new ArrayList<Integer>();
        String line;
        
 
    	line = sc.nextLine();
    	line = line.replaceAll(",", "");
    	
    	for(int i = 0; i <line.length(); ++i)
    	{
    		fishList.add((int)Character.getNumericValue(line.charAt(i)));
    	}
    	
    	//check to make sure input values are correct
        //System.out.println(fishList);

        //cycle through each fish. pass length of list as static so you don't touch the newly added fish
        
        for(int day = 1; day <=80; ++day)
        {
        	int numFish = fishList.size();
        	//System.out.println(numFish);
        	for(int fish= 0; fish<numFish; ++fish)
        	{
        		if(fishList.get(fish) == 0)
        		{
        			//produce another fish
        			fishList.add(8);
        			//reset current fish
        			fishList.set(fish, 6);
        		}
        		else
        		{
        			//decrease internalTimer
        			int internalTimer = fishList.get(fish);
        			fishList.set(fish, internalTimer - 1);
        		}
        	}
        	//System.out.println("After " + day + " days: " + fishList);
        }

    	System.out.println("There are " + fishList.size() + " fish");
	}

}
