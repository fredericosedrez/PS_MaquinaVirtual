package memoria;

public class ACC
{
	private static String valorACC;
	
        public static int get()
	{
		return Memoria.stringParaInt(valorACC);
	}
        
	public static void set(int valor)
	{
		valorACC = Memoria.paraStringBin16(valor);
	}
        public static int getInd()
        {
            return Memoria.stringParaInt(Memoria.memoria.get(Memoria.stringParaInt(valorACC)));
        }
}
