public class inData {

    public static void main(String arg[]){

        Leitura lei1 = new Leitura();

        int y = Integer.parseInt(lei1.entDados("Valor 1: "));
        
        int x = Integer.parseInt(lei1.entDados("Valor 1: "));

        System.out.println("x + y = " + (x+y));


    }
}
