// Lucas Fares Corrêa Auad Pereira

public class TstInt {
    private Integer inteiro;

    /*
     i) Classe Interger metodo parseInt
     ii) o metodo stringPraInt retorna a string de parametro em inteiro
     iii) referencia: https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
     */

    public int stringPraInt(String palavra){
        return Integer.parseInt(palavra);
    }
    
    /*
     i) Classe Integer metodo toBinaryString
     ii) o metodo intPraBinario retorna o valor inteiro, covertido em binario, formatado em String
     iii) referencias: https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#parseUnsignedInt-java.lang.String-int- 
     */

    public String intPraBinarioEmString(int i){
        return Integer.toBinaryString(i);
    }


    public void setInteiro(Integer inteiro){
        this.inteiro = inteiro;
    }

    public Integer getInteiro(){
        return inteiro;
    }
}