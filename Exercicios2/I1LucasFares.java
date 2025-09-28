import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I1LucasFares {
    public  String entDadosEmString(String var){
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

    public void main(String args[]){
        
        I1LucasFares teste = new I1LucasFares();
        
        String palavra = teste.entDadosEmString("Digite uma palavra: ");
        char letra = teste.entDados("Agora, me diga uma letra: ");



    }
}
