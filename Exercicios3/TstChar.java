// Lucas Fares Corrêa Auad Pereira

public class TstChar {
    private Character caracter;

    /*
    i) Classe Character: metodo .isDIgit 
    ii)O metodo ehDigito confere se o caracter DIgitado é um numeral, retornando um valor bool
    iii) Referencias: https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
    */
    public boolean ehDigito(char c){
        return Character.isDigit(c);
    }

    /*
    i) Classe Charactere: metodo .toUpperCase
    ii) O metodo maiusculo, retorna o caracter do parametro maiusculo
    iii) Referencias: https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
     */

    public char maiusculo(char c){
        return Character.toUpperCase(c);
    }


    public Character getCaracter(){
        return this.caracter;
    }

    public void setCaracter(char c){
        this.caracter = c;
    }

}
