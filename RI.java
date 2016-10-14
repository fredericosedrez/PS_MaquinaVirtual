package memoria;

public class RI
{
	private static String opcode;
	
        public static String getReg()
	{
		return opcode;
	}
        
	public static void setReg(String s)
	{
            //tratamento para caso de s ser maior q 16 bits
            if(s.length()>16)
            {
                System.out.println("Erro: Palavra maior que 16 bits");
                return;
            }
		opcode = s;
	}
        /*public static int getInd()
        {
            return Memoria.stringParaInt(Memoria.memoria.get(Memoria.stringParaInt(valorACC)));
        }*/

}
