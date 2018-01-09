class Fibo
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int n1=0;
		int n2=1;
		int n3;
int i;
		System.out.println(n1);
		System.out.println(n2);
		for(i=n1;i<n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		}
}