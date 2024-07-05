public class basic_program2
{
	public static void main(String [] args)
	{
		int i=7;
		//System.out.println("**1");
		try
		{
			System.out.println("**2");
			if(i==5)
			{
				throw new Exception();
			}
			System.out.println("**3");
		}
		catch(Exception e)
		{
			System.out.println("**4");
		}
	/*	finally
		{
			System.out.println("**5");
		}*/	
	}
}			