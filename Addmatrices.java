class Addmatrices
{
	public static void main(String args[])
{
	int a[][]=new int[2][2];
	int i,j;
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		

			{


			a[i][j]=Integer.parseInt(args[2*i+j]);
			}

		}

	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			System.out.println(a[i][j]);
			}

		}
}
	

}








