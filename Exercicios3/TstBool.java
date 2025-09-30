// Lucas Fares Corrêa Auad Pereira

public class TstBool {

    /*
    i) Classe Boolean metodo logicalAnd
    ii) o metodo operadorAND, efetua uma operação classica "E" da matematica booleana 
    iii) Referencia https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html
     */

    public boolean operadorAND(boolean a, boolean b){
        return Boolean.logicalAnd(a, b);

    }

    /*
    i) Classe Boolean metodo logicalOr
    ii) o metodo operadorOR, efetua a operação OR entre dois valores booleanos
    iii) Referencias: https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html
     */

    public boolean operadorOR (boolean a, boolean b){
        return Boolean.logicalOr(a, b);
    }


}