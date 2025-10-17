import java.util.List;
import java.util.ArrayList;

// Lucas Fares Corrêa Auad Pereira

public class Principal{
    
    static List<Sala2D> salas2D = new ArrayList<Sala2D>();
    static List<Sala3D> salas3D = new ArrayList<Sala3D>();
    static List<SalaIMAX> salasImax = new ArrayList<SalaIMAX>();
    static List<Filme> filmes = new ArrayList<Filme>();
    static Leitura leitura = Leitura.geraLeitura();

    public static void main(String args[]) {
        int contador_filmes = 0;
        int var;
        
        while(true){ //cadastro inicial do cliente
            menu(0);    
            try{
                var = Integer.parseInt(leitura.entDados("\n>>> "));

                if (var > 4 || var < 0){
                    throw new VarOutOfBoundsException("\nOpção deve estar entre 0 e 4!");
                }else if(var == 0){
                    System.exit(var);
                }
                break;
            }catch (NumberFormatException nfe){
                
                System.out.print("\n**Digite apenas numeros inteiros**\n");
            
            }catch(VarOutOfBoundsException voobe){
                
                System.out.println("\nErro: " + voobe.getMessage());
                
            }
        }

       switch(var){
            case 1:
                Filme filme = new Filme();
                filme.setId(contador_filmes++);
                
                
                filme.setNome(leitura.entDados("\nDigite o nome do filme: "));
                filme.setSinopse(leitura.entDados("\nInsira o Sinopse: "));
                filme.setDiretor(leitura.entDados("\nDigite o Diretor: "));
                    
                while(true){
                    try {
                        filme.setDuracaoMin(Integer.parseInt(leitura.entDados("\nDuracao em minutos: ")));


                    }catch(NumberFormatException nfe) {
                        System.err.print("");
                    }
                    break;
                }                


    



                break;
            case 2: 

            
            
        }

    }
    
    public static void menu(int codigo){
        if(codigo == 0){
            System.out.print("\n<<< CINEMA UTPFR >>>\nSeja bem-vindo(a)\n0) - Sair do aplicativo\n1) - Comprar ingresso\n2) - Cadastrar Filme\n3) - Cadastrar Sala\n4) - Cadastrar Sessao");
        
        }else if(codigo == 1){


        }else if(codigo == 2) {
            System.err.print("");
           
        }else if(codigo == 3){// cadastro de filme
            System.err.print("\n1) - Cadastro de uma Sala2D (Normal)\n2) - Cadastro de uma Sala3D\n3) - Cadastro de uma SalaIMAX");
        
        }
    }

    public static impFilmes

}