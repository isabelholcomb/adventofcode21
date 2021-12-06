import java.io.File;
import java.util.Scanner;

public class day5 {

	public static int determineMax(int array[][])
	{
		int max = -1;
		
		for(int i = 0; i<array.length; ++i)
		{
			for(int j = 0; j<array[i].length; ++j)
			{
				if(array[i][j] > max)
				{
					max = array[i][j];
				}
			}
		}
		
		return max;
	}
	
	//only checks for vertical or horizontal, not diagonal
	public static boolean checkLine(int coordinates[])
	{
		boolean straightLine = false;
		if(coordinates[1]==coordinates[3] || coordinates[0] == coordinates[2])
		{
			straightLine = true;
		}
		return straightLine;
	}
	
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\isabel\\Downloads\\aocd5.txt");
        Scanner sc = new Scanner(file);
        
        //declare variables
        int inputs[][] = new int[500][4]; //stored as x1, y1, x2, y2
        String line;
        String coordinates[] = new String[4]; //split up the inputs into here
        int numInputs = 0;
        
        //parse the inputs
        while(sc.hasNextLine())
        {
        	line=sc.nextLine();
        	//System.out.println(line);
        	line = line.replaceAll(" -> ", ",");
        	coordinates = line.split(",");
    		for(int i = 0; i< 4; ++i)
        	{
        		inputs[numInputs][i] = Integer.parseInt(coordinates[i]);
        	}
        	
        	++numInputs;
        }
        
        //view all th inputs
        /*for(int i =0; i<numInputs; ++i)
        {
        	System.out.println("inputs:" + inputs[i][0]+","+inputs[i][1]+","+inputs[i][2]+","+inputs[i][3]);
        }*/
        
        //determine how big the coordinate array should be
        int max = determineMax(inputs);
        
        System.out.println("max is: " + max);
        
        //make Coordinate Array
        int vents[][] = new int[max+1][max+1];
        
        //fill out the array, increasing the int stored at a point if the line goes through that coordinate
        for(int i = 0; i < numInputs; ++i)
        {
        	int xDiff = inputs[i][2] - inputs[i][0];
        	int yDiff = inputs[i][3] - inputs[i][1];
        	
        	//y-coordinate is the same
        	if(yDiff == 0)
    		{
        		if(inputs[i][0]<inputs[i][2])
        		{
        			for(int j=inputs[i][0]; j <= inputs[i][2]; ++j)
        			{
        				++vents[j][inputs[i][1]];
        			}
        		}
        		else
        		{
        			for(int j=inputs[i][2]; j <= inputs[i][0]; ++j)
        			{
        				++vents[j][inputs[i][1]];
        			}
        		}
    		}
        	//x-coordinate is the same
        	else if(xDiff == 0)
        	{
        		if(inputs[i][1]<inputs[i][3])
        		{
        			for(int j=inputs[i][1]; j <= inputs[i][3]; ++j)
        			{
        				++vents[inputs[i][0]][j];
        			}
        		}
        		else
        		{
        			for(int j=inputs[i][3]; j <= inputs[i][1]; ++j)
        			{
        				++vents[inputs[i][0]][j];
        			}
        		}
        	}
        	else if(xDiff == yDiff) //diagonal positive line
        	{
        		if(yDiff < 0)
        		{
        			for(int j =0; j <=-yDiff; ++j)
        			{
        				++vents[inputs[i][2]+j][inputs[i][3]+j];
        			}
        		}
        		else
        		{
        			for(int j =0; j <=yDiff; ++j)
        			{
        				++vents[inputs[i][0]+j][inputs[i][1]+j];
        			}
        		}
        	}
        	else if(xDiff == -yDiff) //diagonal negative line
        	{
        		if(yDiff < 0)
        		{
        			for(int j =0; j <=-yDiff; ++j)
        			{
        				++vents[inputs[i][2]-j][inputs[i][3]+j];
        			}
        		}
        		else
        		{
        			for(int j =0; j <=yDiff; ++j)
        			{
        				++vents[inputs[i][0]-j][inputs[i][1]+j];
        			}
        		}
        	}
        	
        	//prints each iteration of vents after adding a new line
        	/*for(int m = 0; m < max+1; ++m) {
            	for(int n= 0; n < max+1; ++n) {
            		System.out.print(vents[n][m]);
            	}
            	System.out.println();
            }
        	System.out.println();*/
        }
        
        int numOverlappingPoints = 0;
        for(int i = 0; i < max+1; ++i) {
        	for(int j= 0; j < max+1; ++j) {
        		System.out.print(vents[j][i]);
        		if(vents[j][i]>=2)
        		{
        			++numOverlappingPoints;
        		}
        	}
        	System.out.println();
        }
        
        System.out.println(numOverlappingPoints);
	}

}
