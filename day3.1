import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class day3 {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\isabel\\Downloads\\aocd3.txt");
        Scanner sc = new Scanner(file);
        
        //declare variables
        int[] totals = new int[12]; //a counter for each bit
        String input;
        char[] inputs = new char[12]; //a storage place for each new line
        int numLines = 0; //counter for the total number of lines in the input
        
        
        //parse through each line of inputs
        while(sc.hasNextLine())
        {
        	++numLines; //increase counter of lines
        	input = sc.nextLine();
        	System.out.println(input);

        	for(int i = 0; i < input.length(); i++)
        	{
        		inputs[i] = input.charAt(i);
        		totals[i] = totals[i] + Character.getNumericValue(inputs[i]);
        	}
        }
        
        //check if 0 or 1 was more prevalent by dividing by number of inputs
        double[] prevalence = new double[12];
        
        for(int i = 0; i < totals.length; i++)
    	  {
    		prevalence[i] = totals[i];
    		prevalence[i] = Math.round(prevalence[i]/numLines);
    	  }
        
        int gamma = 0; //most prevalent bits
        int epsilon = 0; //least prevalent bits
        
        //convert from boolean
        for(int i = prevalence.length-1; i>=0; --i)
        {
        	gamma = gamma + (int)(prevalence[i]*Math.pow(2, (12-i-1)));
        	epsilon += (int)((1-prevalence[i])*Math.pow(2, (12-i-1)));
        }
        
        //print out results
        System.out.println(Arrays.toString(totals));
        System.out.println(Arrays.toString(prevalence));
        System.out.println(gamma);
        System.out.println(epsilon);
        System.out.println(gamma*epsilon);
        
        sc.close();
	}

}
