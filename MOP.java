/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoria;

/**
 *
 * @author felip
 */
public class MOP 
{
    private static String modoDeOperacao;
	
        public static String getReg()
	{
		return modoDeOperacao;
	}
        
	public static void setReg(String s)
	{
            //tratamento para caso de s ser maior q 16 bits
            if(s.length()>8)
            {
                System.out.println("Erro: Palavra maior que 8 bits");
                return;
            }
		modoDeOperacao=s;
	}
        /*public static int getInd()
        {
            return Memoria.stringParaInt(Memoria.memoria.get(Memoria.stringParaInt(modoDeOperacao)));
        }*/
}
