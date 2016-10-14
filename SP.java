package memoria;

public class SP
{
	private static int topo=0;
	
	public static int get()
	{
		return topo;
	}
	
	public static void pushSP()
	{
		topo++;
	}
	
	public static void popSP()
	{
		topo--;
	}

}
