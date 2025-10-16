import java.util.List;
import java.util.ArrayList;



// Lucas Fares Corrêa Auad Pereira

public class Principal{
    static List<Cliente> clientes = new ArrayList<Cliente>();
    static Leitura leitura = Leitura.geraLeitura();
    public static void main(String args[]) {
        
        menu(0);

        
        while(true){ //cadastro inicial do cliente
            int var;
            try {
                var = Integer.parseInt(leitura.entDados("CPF: "));
            } catch (NumberFormatException nfe){
                System.out.print("Digite apenas numeros inteiros");
            }

            
        }
    }
    
    public static void menu(int codigo){
        if(codigo == 0){
            System.out.print("<<< CINEMA UTPFR >>>\nSeja bem-vindo(a) vamos começar seu cadasro de cliente!");
        }else if(codigo == 1){// cadastro de filme
        }
    }

}