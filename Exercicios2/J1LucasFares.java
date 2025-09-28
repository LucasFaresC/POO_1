import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1LucasFares{
    public static void main(String[] args) {
        int tamanho = 5;
        int vetor[] = new int[tamanho];
        J1LucasFares teste = new J1LucasFares();


        for (int i = tamanho; i > 0 ; i--) {
            vetor[i - 1] = Integer.parseInt(teste.entDadosEmString("X" + i + " = "));
        }
        
        for (int i = 0; i < tamanho; i++ ){      
            System.out.println("V["+ i+"] = " + vetor[i]);
        }
        
        
        
    }
    
    public String entDadosEmString (String var){
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

}