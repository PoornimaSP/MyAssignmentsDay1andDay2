package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
	
		int n=19;
		int flag=0;
				
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				flag=1;
			
							
		}
		if (flag==0)
			System.out.println(n + " Is  a Prime Number");
		else
			System.out.println(n +" Is not a Prime Number");
	}

}
