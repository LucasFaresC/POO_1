// Lucas Fares Correa Auad Pereira 


public class TstByte {


    /*
    i) Classe Byte: métodos parseByte() e decode()
    ii) Converte String para byte e decodifica hexadecimal
    iii) Referencia Documentacao da Oracle
     */

    public void converterBytes(String strDecimal, String strHex) {
        byte decimal = Byte.parseByte(strDecimal);
        byte hex = Byte.decode(strHex);
    }
}