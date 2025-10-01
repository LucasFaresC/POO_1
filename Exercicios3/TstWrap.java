// Lucas Fares Corrêa Auad Pereira

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TstWrap{
    private TstBool teste_bool = new TstBool();
    private TstFloat teste_float = new TstFloat();
    private TstInt teste_int = new TstInt();
    private TstChar teste_char = new TstChar();
    private TstLong teste_long = new TstLong();
    private TstShort teste_short = new TstShort();
    private TstDoub teste_double = new TstDoub();
    private TstByte teste_byte = new TstByte();
    

    public static void main(String arg[]){
        TstWrap teste_wrappers = new TstWrap(); // esse objeto tem que ficar dentro da main por algum motivo magico
        teste_wrappers.menu();  

        int opcao = teste_wrappers.getTstInt().stringPraInt(teste_wrappers.entDados(""));

        switch(opcao){
            case 1:
                String var = teste_wrappers.entDados("Digite um número inteiro: ");
                int var_int = teste_wrappers.getTstInt().stringPraInt(var);
                var = teste_wrappers.getTstInt().intPraBinarioEmString(var_int);
                
                System.out.println("Seu numero pra String: ''" + var_int + "'' e esse mesmo numero em binario é "+ var);
                break;

            case 2:
                String sentenca = teste_wrappers.entDados("Digite um ")
                break;
            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                break;

            case 7:

                break;

            case 8:

                break;

            case 0:

                break;

            default:
                System.out.println("Opção invalida, reinicie o programa");
                break;

        }
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

    public String entDados(String rotulo){
        System.out.print(rotulo);

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        String output = "";


        try{
            output = buffer.readLine();

        }catch(IOException ioe){

            System.out.println("\nEDeve ter dado ruim");

        }

        return output;
    }

    public void setTstBool (TstBool bool){
        this.teste_bool = bool;
    }

    public TstBool getTstBool(){
        return this.teste_bool;
    }

    public void setTstFloat(TstFloat f){
        this.teste_float = f;
    }

    public TstFloat getTstFloat(){
        return this.teste_float;
    }

    public void setTstInt(TstInt i){
        this.teste_int = i;
    }

    public TstInt getTstInt() {
        return this.teste_int;
    }

    public void setTstChar(TstChar c) {
        this.teste_char = c;
    }

    public TstChar getTstChar() {
        return this.teste_char;
    }

    public void setTstLong(TstLong l) {
        this.teste_long = l;
    }

    public TstLong getTstLong() {
        return this.teste_long;
    }

    public void setTstShort(TstShort s) {
        this.teste_short = s;
    }

    public TstShort getTstShort() {
        return this.teste_short;
    }

    public void setTstDoub(TstDoub d) {
        this.teste_double = d;
    }

    public TstDoub getTstDoub() {
        return this.teste_double;
    }

    public void setTstByte(TstByte b) {
        this.teste_byte = b;
    }

    public TstByte getTstByte() {
        return this.teste_byte;
    }

}