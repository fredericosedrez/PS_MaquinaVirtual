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
public class Pilha 
{
    
    public static void push(String string)
    {
        if(SP.get() < Memoria.stringParaInt(Memoria.memoria.get(1))-1)
        {
            Memoria.memoria.set(SP.get() + Memoria.getPosIniPilha(), string);
            SP.pushSP();
        }
        else
            System.out.println("Stack Overflow");
    }
    
    public static String pop()
    {
        if(SP.get() >= Memoria.getPosIniPilha())
        {
            String string = Memoria.memoria.get(SP.get() + Memoria.getPosIniPilha());
            Memoria.memoria.set(SP.get() + Memoria.getPosIniPilha(), null);
            SP.popSP();
            return string;
        }
        else
        {
            System.out.println("Erro: Empty Stack");
            return null;
        }
    }
    
}
