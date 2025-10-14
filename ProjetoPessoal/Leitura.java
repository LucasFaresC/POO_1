// Lucas Fares Correa Auad Pereira

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Leitura{

    // Pradrão de Projeto Sigleton
    
    public static Leitura objetoUnico; // Primeiro Passo -> Criar objeto unico

    private Leitura(){}; // Segundo Passo -> metodo construtor agora só pode ser usado na propria classe 

    public static Leitura geraLeitura(){ // Terceiro Passo -> se não tiver o objeto unico criado, cria; se já tiver então só retorna ele
        if(objetoUnico == null){
            objetoUnico = new Leitura();

        }
        return objetoUnico;
    }

    public String entDados(String rotulo){
        System.out.print(rotulo);

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(teclado);

        String retorno = "";


        try{
            retorno = buffer.readLine();

        }catch(IOException ioe){

            System.out.println("\nErro! ou foi maqiuna virtual ou sua Ram");

        }

        return retorno;
    }

}