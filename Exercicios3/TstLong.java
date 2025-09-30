// Lucas Fares Correa Auad Pereira

public class TstLong{
    
    // i) Classe Long: métodos parseLong() e numberOfLeadingZeros()
    // ii) Converte String para long e conta zeros à esquerda
    // iii) Referencia: https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html
    public void converterEContarZeros(String str) {
        long numero = Long.parseLong(str);
        int zeros = Long.numberOfLeadingZeros(numero);
    }



}