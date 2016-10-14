/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoria;
import java.util.ArrayList;
import static java.lang.Integer.toBinaryString;
/**
 *
 * @author felip
 */
public class Memoria {

    public static ArrayList<String> memoria = new ArrayList<>();
    private static final int tamanhoMemoria = 1024;
    private static final int tamanhoPilha = 30;
    private static final int posIniPilha = 3;
    private static final int posIniInstrucoes = 34;
    private static final int posIniDados = 701;

     public static void main(String[] args) {
        // TODO code application logic here
        inicializaMemoria();
        System.out.println(PC.get());
        
    }
    
    
    public static void inicializaMemoria()
    {
       
        for (int i=0;i<tamanhoMemoria-1;i++)
        {
            //algoritmo para preencher instruções passadas pelo Matheus
            //por enquanto preenche toda a memoria com null
            memoria.add(null);
        }
        
        //tamanho da pilha na posição 2
        memoria.set(1, paraStringBin16(tamanhoPilha));
        
    }
    
    public static int stringParaInt(String string)
    {
        int binary = 0;
        for (int i=0; i<string.length(); i++)
        {
            if(string.charAt(i)== '1')
            {
                binary += Math.pow(2,(string.length()-1)-i);
            } 
        }
        return binary;
    }
    
    public static String paraStringBin16(int inteiro)
    {
        String string;
        
        //tratamento para casos maiores que 16 bits = 65535
        if(inteiro>65535)
        {
            System.out.println("Erro: palavra maior que 16 bits");
            return null;
        }
        
        string = toBinaryString(inteiro);
        int stringLength = string.length();
        for(int i=0;i<=15-stringLength;i++)
        {
            string = "0" + string;
        }
        
        return string;
    }
    
    public static int getTamMemoria()
    {
        return tamanhoMemoria;
    }
    public static int getPosIniPilha()
    {
        return posIniPilha;
    }
    public static int getPosIniInst()
    {
        return posIniInstrucoes;
    }
    public static int getPosIniDados()
    {
        return posIniDados;
    }
    /*public static void setPosIniDados(int pos)
    {
        posIniDados = pos;
    }*/
    
    /*public static String[] getVetorInstrucoes()
    {
        
    }
    
    public static String[] getVetorDados()
    {
        
    }
    
    public static String[] getVetorPilha()
    {
        
    }*/
}

