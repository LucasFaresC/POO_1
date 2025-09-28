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
        K1LucasFares teste = new K1LucasFares();
        int i, j;

        for(i = 0; i < linha; i++) { // preenchendo a matriz
            for( j = 0; j < coluna; j++){
                matriz[i][j] = Integer.parseInt(teste.entDadosEmString("a"+(i+1)+(j+1)+" = "));
            }
        }
         
        for(i = linha; i > 0 ;i--) {
            for(j = coluna; j > 0; j--){
                System.out.println("a["+i+"]["+j+"] = " + matriz[i-1][j-1]);
            }
        }



    }
}
