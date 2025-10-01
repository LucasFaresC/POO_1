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
                boolean a = Boolean.parseBoolean(teste_wrappers.entDados("True \n(False\nA = "));
                boolean b = Boolean.parseBoolean(teste_wrappers.entDados("B = "));

                boolean and = teste_wrappers.getTstBool().operadorAND(a, b);
                boolean or = teste_wrappers.getTstBool().operadorOR(a, b);

                System.out.println("a + b = "+ or+ "; a x b =  "+ and);

                break;
            case 3:

                String charInput = teste_wrappers.entDados("Digite um caractere: ");
                
                if (!charInput.isEmpty()) {

                    char c = charInput.charAt(0);
                    boolean ehDigito = teste_wrappers.getTstChar().ehDigito(c);
                    char maiusculo = teste_wrappers.getTstChar().maiusculo(c);
                
                    System.out.println("Caractere '" + c + "' é dígito? " + ehDigito);
                    System.out.println("Em maiúsculo: '" + maiusculo + "'");
                    }

                break;

            case 4:

                String strDouble = teste_wrappers.entDados("Digite um número double: ");
                teste_wrappers.getTstDoub().converterEVerificar(strDouble);
                
                System.out.println("Conversão double realizada com sucesso!");
                    
                break;

            case 5:

                String strDecimal = teste_wrappers.entDados("Digite um número decimal para byte: ");
                String strHex = teste_wrappers.entDados("Digite um número hexadecimal para byte (ex: 0x1F): ");
            
                teste_wrappers.getTstByte().converterBytes(strDecimal, strHex);
                System.out.println("Conversões byte realizadas com sucesso!");

                break;

            case 6:

                String strShort = teste_wrappers.entDados("Digite um número para short: ");
                teste_wrappers.getTstShort().converterEInverter(strShort);
        
                System.out.println("Conversão short realizada com sucesso!");
                break;

            case 7:
                String strFloat = teste_wrappers.entDados("Digite uma string para converter para float: ");
                float numFloat = Float.parseFloat(teste_wrappers.entDados("Digite um float para converter para string: "));
                
                teste_wrappers.getTstFloat().converteStringFloat(numFloat, strFloat);
                System.out.println("Conversões float realizadas com sucesso!");
                
                break;

            case 8:

                String strLong = teste_wrappers.entDados("Digite um número long: ");
                teste_wrappers.getTstLong().converterEContarZeros(strLong);
                
                System.out.println("Conversão long realizada com sucesso!");
                
                break;

            case 0:

                System.out.println("Saindo do programa...");

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