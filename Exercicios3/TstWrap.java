// Lucas Fares Corrêa Auad Pereira

public class TstWrap {
    private TstBool teste_bool = new TstBool();
    private TstFloat teste_float = new TstFloat();
    private TstInt teste_int = new TstInt();
    private TstChar teste_char = new TstChar();
    private TstLong teste_long = new TstLong();
    private TstShort teste_short = new TstShort();
    private TstDoub teste_double = new TstDoub();
    private TstByte teste_byte = new TstByte();
    private TstWrap leituraDeDados = new TstWrap();

    public static void main(String arg[]){
        
    }

    public void menu(){
        System.out.println("\n" + "=".repeat(40));
        System.out.println("       USO DE CLASSES WRAPPERS");
        System.out.println("=".repeat(40));
        System.out.println("1) INTEGER");
        System.out.println("2) BOOLEAN");
        System.out.println("3) CHARACTER");
        System.out.println("4) DOUBLE");
        System.out.println("5) BYTE");
        System.out.println("6) SHORT");
        System.out.println("7) FLOAT");
        System.out.println("8) LONG");
        System.out.println("0) SAIR");
        System.out.println("-".repeat(40));
        System.out.print("ESCOLHA UMA OPCAO: ");
    }




}