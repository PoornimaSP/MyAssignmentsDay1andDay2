package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray
{
	
	public static void main(String[] args)
	{
		int[] array1= {8,1,6,2,5,4,3};
		Arrays.sort(array1);
		int length=array1.length;
		for(int i=1;i<=length;i++)
			{
			 int c=array1[i-1];
			
			 
			 if(c!=i)
			 {
	
				 System.out.println("Missing number in Array is"+i);
				 break;
				
			 }
			
			}
	

		
	}

}

