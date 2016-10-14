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
public class RE
{
	
        public static String getReg()
	{
		return Memoria.paraStringBin16(Memoria.getPosIniDados());
	}
        
	/*public static void setReg(int s)
	{
            //tratamento para caso de s ser maior que a última posição da memória
            if(s > Memoria.getTamMemora()-1 || s < Memoria.getPosIniDados())
            {
                System.out.println("Erro: Posição fora de limite");
                return;
            }
		Memoria.setPosIniDados(s);
	}
        /*public static int getInd()
        {
            return Memoria.stringParaInt(Memoria.memoria.get(Memoria.stringParaInt(Memoria.posIniDados)));
        }*/
}
