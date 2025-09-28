import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class K1LucasFares {
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

    public static void main(String[] args) {
        int linha = 3;
        int coluna = 3;
        int matriz[][] = new int[linha][coluna];
        
        



    }
}
