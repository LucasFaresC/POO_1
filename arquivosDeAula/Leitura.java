import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura{
    
    public static Leitura leituraUnic; // Primeiro Passo -> Criar objeto unico

    private Leitura(){}; // Segundo Passo -> metodo construtor agora só pode ser usado na propria classe 

    public static Leitura geraLeitura(){ // Terceiro Passo -> se não tiver o objeto unico criado, cria; se já tiver então só retorna ele
        if(leituraUnic == null){
            leituraUnic = new Leitura();

        }
        return leituraUnic;
    }

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