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
		File file = new File("C:\\Users\\isabel\\Downloads\\aocd5test.txt");
        Scanner sc = new Scanner(file);
		// TODO Auto-generated method stub
        
        //declare variables
        int inputs[][] = new int[500][4]; //stored as x1, y1, x2, y2
        String line;
        String coordinates[] = new String[4];
        int numInputs = 0;
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
        

        for(int i =0; i<numInputs; ++i)
        {
        	System.out.println("inputs:" + inputs[i][0]+","+inputs[i][1]+","+inputs[i][2]+","+inputs[i][3]);
        }
        int max = determineMax(inputs);
        
        System.out.println("max is: " + max);
        
        //make Coordinate Array
        int vents[][] = new int[max+1][max+1];
        
        for(int i = 0; i < numInputs; ++i)
        {
        	//y-coordinate is the same
        	if(inputs[i][1]==inputs[i][3])
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
        	else if(inputs[i][0] == inputs[i][2])
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
