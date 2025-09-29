// Lucas Fares Corrêa Auad Pereira

public class TstInt {
    private Integer inteiro;

    /*
     i) Classe Interger metodo parseInt
     ii) o metodo stringPraInt retorna a string de parametro em inteiro
     iii) referencia: 
     */


    public int stringPraInt(String palavra){
        return Integer.parseInt(palavra);
    }
    



    public void setInteiro(Integer inteiro){
        this.inteiro = inteiro;
    }

    public Integer getInteiro(){
        return inteiro;
    }
}