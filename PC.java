package memoria;

public class PC
{
	private static int proximo = 34;

	public static int get()
	{
		return proximo;
	}

	
	public static void set(int N)
	{
		proximo=N;
		
	}
        
        public static void incrementa()
        {
            proximo += 1;
        }
        
}
