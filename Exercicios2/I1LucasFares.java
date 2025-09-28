import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I1LucasFares {

    public static  void main(String args[]){
        
        I1LucasFares teste = new I1LucasFares();
        
        String palavra = teste.entDadosEmString("Digite uma palavra: ");
        char letra = teste.entDadosEmChar("Agora, me diga uma letra: ");

        int letra_em_palavra = 0;
        char caracter;
        for (int i = 0; i < palavra.length(); i++) {
            caracter = palavra.charAt(i);
            
            if (letra == Character.toLowerCase(caracter) || letra == Character.toUpperCase(caracter)){
                letra_em_palavra++;
            
            }

        }

        if (letra_em_palavra != 0){
            System.out.println("A letra " + Character.toUpperCase(letra) + " aparece " + letra_em_palavra +  " vezes em " + palavra);
            
        }else{
            System.out.println("Não há nenhuma ocorrência da letra '" + letra + "' na palavra " + palavra);
            
        }

    }

    public char entDadosEmChar(String mensagem) {
        System.out.print(mensagem);
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        
        char retorno = ' ';
        
        try {
            String linha = buffer.readLine();
            if (linha != null && !linha.isEmpty()) {
                retorno = linha.charAt(0); // Pega apenas o primeiro caractere
            }
        } catch (IOException ioe) {
            System.out.println("\nErro na leitura: " + ioe.getMessage());
        }
        
        return retorno;
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
