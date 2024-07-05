public class basic_program
{
	public static void main(String [] args)
	{
		System.out.println("**** 1");
		
		try
		{
			System.out.println("**** 2");
			System.out.println(0/2);
			System.out.println("**** 3");
			System.out.println("**** 4");
		}
		catch(Exception e)
		{
			System.out.println("**** 6");
			
		}		

		finally
		{
			System.out.println("**** 5");
			
		}
	}
}
		