class Prime
	{
		public static void main(String args[])
		{
			int n=Integer.parseInt(args[0]);
			
			if(n>0)
			{
				if(n%2!=0)
				{
					System.out.println("number is prime");
				}
				else
				System.out.println(" number is not prime");
		}
		if(n<=0)
		System.out.println("number cannot be recognized"); 

		}
}