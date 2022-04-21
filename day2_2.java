import java.io.File;
import java.util.Scanner;

public class day2 {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\isabel\\Downloads\\aocd2.csv");
        Scanner sc = new Scanner(file);
        
        //declare variables
        int dist; //distance
        String line; //a line of instruction
        String info[]; //parse the line of instruction
        int depth = 0; //vertical distance
        int hor = 0; //horizontal distance
        
        
        //cycle through each line
        while(sc.hasNextLine()){
        	line = sc.nextLine();
        	info = line.split(" ");
        	dist = Integer.parseInt(info[1]);
        	
        	//determine which direction we're traveling
        	if(info[0].startsWith("f"))
        	{
        		hor = hor + dist;
        	}
        	else if(info[0].startsWith("d"))
        	{
        		depth = depth + dist;
        	}
        	else if(info[0].startsWith("u"))
        	{
        		depth = depth - dist;
        	}
        	
        	System.out.println("forward: " + hor + ", depth: " + depth);
        }
        System.out.print(hor*depth);
        
        sc.close();
        
	}

}
