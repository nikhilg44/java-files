class Box
{
	int width;
	int height;
	int depth;
}
class Boxdemo
{
	public static void main(String args[])
	{
		Box mybox =new Box();
		double vol;
		mybox.width=Integer.parseInt(args[0]);
		mybox.height=Integer.parseInt(args[1]);
		mybox.depth=Integer.parseInt(args[2]);
		vol=mybox.width*mybox.height*mybox.depth;
		System.out.println("volume="+vol);
		}
	}