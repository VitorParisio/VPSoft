package util;

/**
 *
 * @author Vitor
 */
public class Formatador {
    
    public double converteVirgulaParaPonto(String pString){
        String retorno = new String();
        int tamanhoString = pString.length();
        for(int i = 0; i < tamanhoString; i++){
            if(pString.charAt(i) == ','){
                retorno += '.';
            }else{
                retorno += pString.charAt(i);
            }
        }
        
        return Double.parseDouble(retorno);
    }
}
