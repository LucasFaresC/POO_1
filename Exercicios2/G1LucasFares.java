import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G1LucasFares {   
    
    public  String entDados(String var){
        System.out.print(var);

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        String retorno = "";

        try{
            retorno = buffer.readLine();

        }catch(IOException ioe){

            System.out.println("\nDeu Ruim");

        }

        return retorno;
    }

    public void menu(){
        System.out.println("\n<<< MENU >>> \n1 - Somar (a + b)\n2 - Multiplicar (a x b) \n3 - Subtrair (a - b) \n4 - Dividir (a ÷ b)");
    }

    public static void main(String args[]){
        G1LucasFares teste = new G1LucasFares();

        float a = Float.parseFloat(teste.entDados("a = "));
        float b = Float.parseFloat(teste.entDados("b = "));

        teste.menu();

        int opcao = Integer.parseInt(teste.entDados("\n>>> "));
        
        switch(opcao){
            case 1:
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
                
            case 2:
                System.out.println(a + " x " + b + " = " + (a*b));
                break;
                
            case 3:
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
                
            case 4:
                System.out.println(a + " ÷ " + b + " = " + (a/b));
                break;
            }
    }
}

