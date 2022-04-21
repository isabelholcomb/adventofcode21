import java.io.File;
import java.util.Scanner;

public class day1 {

	public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\isabel\\Downloads\\aocd1.csv");
        Scanner sc = new Scanner(file);
        
        //declare variables
        int A = sc.nextInt(); //2 previous integer
        int B = sc.nextInt(); //previous integer
        int C = sc.nextInt(); //current integer
        int sum = A + B + C; //sum of A, B, and C
        int prevSum; // past sum
        int countDeeper = 0; //keeps track of whether the depth is increasing
        
        //compare values
        while (sc.hasNextInt()) {
        	//update values
        	A = B;
        	B = C;
        	C = sc.nextInt(); //update the current
        	
        	prevSum = sum;
        	sum = A+B+C;
        	if(prevSum<sum)
        	{
        		countDeeper++;
        	}
        	
        }
        
        System.out.print(countDeeper);
        
        sc.close();
        
    }
}
