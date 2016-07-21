package com.daniel;

public class Whatever {

	public static void main(String[] args) 
	{
		// You are awesome:)
		
		//Bang(7) Buzz(5) Fizz(3)

		for(int i = 100; i > 0; i--)                
			
		{
			      if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7)==0))       
			    	  {
			    	  System.out.print("FizzBuzzBang");    
			    	  }
			      
			      else if (((i % 3) == 0) && ((i % 5) == 0))
			      {
			      System.out.print("FizzBuzz"); // 
			      }
			      
			      else if (((i % 3) == 0) && ((i % 7) == 0))
			      {
			    	  System.out.print("FizzBang"); // 
			      }
			      
			      else if (((i % 5) == 0) && ((i % 7) == 0))
			      {
			    	  System.out.println("BuzzBang");
			      }
			      
			      else if (((i % 3) == 0))
			      {
			    	  System.out.println("Fizz");
			      }
			      
			      else if (((i % 5) == 0))
			      {
			    	  System.out.println("Buzz");
			      }
			      
			      else if (((i % 7) == 0))
			      {
			    	  System.out.println("Bang");
			      }
			      
			      else
			      {
			    	  System.out.println(i); 
			      }

		
		}
	}
}

