// Lucas Fares Correa Auad Pereira

public class TstShort{
    // i) Classe Short: métodos parseShort() e reverseBytes()
    // ii) Converte String para short e inverte bytes
    // iii) Referencias https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html
    
    public void converterEInverter(String str) {
        short numero = Short.parseShort(str);
        short invertido = Short.reverseBytes(numero);
    }
}