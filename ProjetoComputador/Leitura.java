import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{
    
    public String entDados(String rotulo){
        System.out.print(rotulo);

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

        String retorno = "";


        try{
            retorno = buff.readLine();

        }catch(IOException ioe){

            System.out.println("\nERRO: JAVA VIRTUAL MACHINE OU RAM");

        }

        return retorno;
    }

}