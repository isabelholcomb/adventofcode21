import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

//this didn't work exactly, but by printing out results in enough places, I was able to see the final binary number for each
//rating and take it from there. I spent a long time trying to figure this one out.
public class day3 {

	//recursive method to shrink down the list of binary numbers
	public static ArrayList<String> pareDown(ArrayList<String> initialList, int position, int option) //option is 1(co2) or 0(o2) for if we want the most prevalent or least
	{
		//declare variables
		int size = initialList.size();
		ArrayList<String> updatedList = initialList;
		int total = 0;
		double prevalence = 0;
		char target;
		
		//find the prevalence of 1s and 0s
		for (int i=0; i < size; ++i)
		{
			total = total + Character.getNumericValue(initialList.get(i).charAt(position));
		}
		
		prevalence = (double)total/(double)size;
		
		//determine which bits to keep
		if (prevalence < .5) //0 is more prevalent
		{
			if(option==1)
			{
				target = '1';
			}
			else //if(option==0)
			{
				target = '0';
			}
		}
		else //prevalence >= .5 //1 is more prevalent or they're equal
		{
			if(option==1)
			{
				target = '0';
			}
			else //option==0
			{
				target = '1';
			}
		}
		
		//remove the binary numbers that don't match the target
		for (int i=0; i < updatedList.size(); i++)
		{
			if(updatedList.get(i).charAt(position) != target)
			{
				updatedList.remove(i);
				--i; //need to check the new number at this position
			}
		}
		
		System.out.println(updatedList);
		System.out.println("list size is: " + updatedList.size());
		
		
		//recurse through if more than one binary number left
		//this code wasn't breaking out correctly for me, but idk how to fix it
		if(updatedList.size() > 1)
		{
			return pareDown(updatedList, position+1, option);
		}
		else 
		{
			return initialList;
		}
		//return updatedList;
	}
	
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\isabel\\Downloads\\aocd3.txt");
        Scanner sc = new Scanner(file);
        
        //declare variables
        int[] totals = new int[12]; //a counter for each bit
        String input; //single line of inputs
        ArrayList<String> inputs = new ArrayList<String>(); //all inputs
        
        
        //build line of inputs
        while(sc.hasNextLine())
        {
        	input = sc.nextLine();
        	inputs.add(input);
        }
        
        
        int o2GenRating = 0; //most prevalent bits
        int co2ScrubRating = 0; //least prevalent bits
        
        //I was able to mostly get one or the other of these to work at a time
        String winnerCO2 = pareDown(inputs,0,1).get(0);
        String winnerO2 = pareDown(inputs,0,0).get(0);
        //String winnerCO2 = pareDown(inputs,0,1).get(0);
        
        //convert from boolean
        for(int i = winnerO2.length()-1; i>=0; --i)
        {
        	o2GenRating = o2GenRating + (int)(Character.getNumericValue(winnerO2.charAt(i))*Math.pow(2, (12-i-1)));
        	co2ScrubRating += (int)((Character.getNumericValue(winnerCO2.charAt(i)))*Math.pow(2, (12-i-1)));
        }
        
        //print out results
        System.out.println(Arrays.toString(totals));
        System.out.println(o2GenRating);
        System.out.println(co2ScrubRating);
        System.out.println(o2GenRating*co2ScrubRating);
        
        sc.close();
	}

}
