import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

// Lucas Fares Corrêa Auad Pereira

public class Principal{
    
    static List<Sala2D> salas2D = new ArrayList<Sala2D>();
    static List<Sala3D> salas3D = new ArrayList<Sala3D>();
    static List<SalaIMAX> salasImax = new ArrayList<SalaIMAX>();
    static List<Filme> filmes = new ArrayList<Filme>();
    static Leitura leitura = Leitura.geraLeitura();
    static int contador_filmes = 0;
    static int var;

    public static void main(String args[]) {
        
        while(true){
            menu(0);
            while(true){
                try{
                    var = Integer.parseInt(leitura.entDados("\n>>> ")); //reflexividade
    
                    if (var > 4 || var < 0){
                        throw new VarOutOfBoundsException("\nOpção deve estar entre 0 e 4!");
                    }
                    break;
                }catch (NumberFormatException nfe){
                    
                    System.out.print("\n**Digite apenas numeros inteiros**\n");
                    
                }catch(VarOutOfBoundsException voobe){
                    
                    System.out.println("\nErro: " + voobe.getMessage());
                    
                }
            }    
            
            switch(var){
                case 0:
                    System.exit(var); // sai do programa
                    break;
                case 1:
                    comprarIngresso();
                
                    break;
                case 2:
                    menu(var);

                    while(true){
                        try{
                            var = Integer.parseInt(leitura.entDados(">>> "));
                            if(var < 1 || var > 3){
                                throw new VarOutOfBoundsException("\nOpção deve estar entre 1 e 3!");
                            }
                            break;

                        }catch(NumberFormatException nfe){
                            System.out.print("\n**Digite apenas numeros inteiros**\n");

                        }catch(VarOutOfBoundsException voobe){
                            System.out.println("\nErro: " + voobe.getMessage());
                        }
                    }

                    if(var == 1){
                        cadastraFilme();

                    }else if(var == 2){
                        deleteFilme();

                    }else if(var == 3){

                    }                   

                    

                    break;
                case 3: 
                    menu(3);
     
     
                    break;
                
                 
            }
     
        }
    }

    
    public static void cadastraFilme(){
        Filme filme = new Filme();
        filme.setId(contador_filmes + 1);

        boolean certeza = false;

        // cadastro de nome de filme
        while(!certeza){
            filme.setNome(leitura.entDados("\nDigite o nome do filme: "));
            try {
                certeza = Integer.parseInt(leitura.entDados("\nID: "+filme.getId()+ " "+ filme.getNome()+ "\nConfirmar(1) ou Cancelar(0): ")) == 1; // Reflexividade
                // não precisa de break o controle da variavel vai pelo certeza
            } catch (NumberFormatException e) {
                System.out.print("\nDigite apenas numeros inteiros.");
            }
                
        }
                
        certeza = false;
        // cadastro de sinopse de filme
        while(!certeza){
            filme.setSinopse(leitura.entDados("\nInsira a sinopse do filme: "));
            try {
                certeza = Integer.parseInt(leitura.entDados("\nID: "+filme.getId()+ " Sinopse: "+ filme.getSinopse()+ "\nConfirmar(1) ou Cancelar(0): ")) == 1; // Reflexividade
                // não precisa de break o controle da variavel vai pelo certeza
            }catch(NumberFormatException e) {
                System.out.print("\nDigite apenas numeros inteiros.");
            }
                    
        }
                
        certeza = false;
        
        // cadastro de diretor de filme
        while(!certeza){
            filme.setDiretor(leitura.entDados("\nInsira o Diretor principal do filme: "));
            try {
                certeza = Integer.parseInt(leitura.entDados("\nID: "+filme.getId()+ " Diretor: "+ filme.getDiretor()+ "\nConfirmar(1) ou Cancelar(0): ")) == 1; // Reflexividade
                // não precisa de break o controle da variavel vai pelo certeza
            } catch (NumberFormatException e) {
                System.out.print("\nDigite apenas numeros inteiros.");
            }
        }
        
        certeza = false;
        // cadastro de genero de FILME
        while(!certeza){
            filme.setGenero(leitura.entDados("Insira o genero do Filme"));
            try {
                certeza = Integer.parseInt(leitura.entDados("\nID: "+filme.getId()+ " Genero: "+ filme.getGenero()+ "\nConfirmar(1) ou Cancelar(0): ")) == 1; // Reflexividade
            } catch (NumberFormatException e) {
                System.out.print("\nDigite apenas numeros inteiros.");
            }
        }

        // cadastro de duracao de filme    
        while(true){
            try {
                filme.setDuracaoMin(Integer.parseInt(leitura.entDados("\nDuração em minutos: "))); //Reflexividade
                break;
            }catch(NumberFormatException nfe) {
                System.out.print("Insira apenas numeros inteiros.");
            }
        }


        //cadastro de lengenda do filme
        while(true){
            try {
                
                String perg = leitura.entDados("\n" + filme.getNome() +"tem opção de legenda ?\n(1) Sim ou (2) Não: ");//Reflexividade
                boolean resp = Integer.parseInt(perg) == 1;
                filme.setLegendado(resp);
                break;

            } catch(NumberFormatException nfe) {
                System.out.print("Insira apenas numeros inteiros.");
            }
        }

        //cadastro de filme dublado
        while(true){
            try {
                
                String perg = leitura.entDados("\n filme é Dublado em PT-BR?\n(1) Sim ou (2) Não: ");
                boolean resp = Integer.parseInt(perg) == 1;
                filme.setDublado(resp);
                break;

            } catch(NumberFormatException nfe) {
                System.out.print("Insira apenas numeros inteiros.");
            }
        }
        
        while(true) {
            try {
                // pq n funciona???
                filme.setEstreia(leitura.entData("Data de estreia (aaaa-mm-dd): ")); //Reflexividade
                
                break;
            } catch (DateTimeParseException dtpe) {
                System.out.println("❌ Data inválida! Use o formato aaaa-mm-dd (ex: 2024-12-25)");
            }
        }

        while(true) {
            try {
                LocalDate fimExibicao = leitura.entData("\nData de fim de exibição (aaaa-mm-dd): "); //Reflexividade
                
                // validação necessaria pra ver se essa bomba não ta com a logica errada
                if (fimExibicao.isBefore(filme.getEstreia())) {
                    throw new DataInvalidaException("Data de fim não pode ser anterior à data de estreia!");
                }
                
                filme.setFimExibicoes(fimExibicao);
                break;
            } catch (DateTimeParseException dtpe) {
                System.out.println("\n❌ Data inválida! Use o formato aaaa-mm-dd (ex: 2024-12-25)");
            } catch (DataInvalidaException die) {
                System.out.println("❌ " + die.getMessage());
            }
        }



        System.out.println("Filme cadastrado com sucesso"+filme);
        filmes.add(filme);
    }

    public static Filme getFilmebyID(List<Filme> movies, int id_pra_achar){
        for 
    }

    public static void deleteFilme(){

    }    

    public static void consulFilme(){

    }

    public static void comprarIngresso(){

    }

    public static void menu(int codigo){
        switch (codigo) {
            case 0:
                System.out.print("\n<<< CINEMA UTPFR >>> " +LocalDateTime.now() +"\nSeja bem-vindo(a)\n0) - Sair do aplicativo\n1) - Comprar ingresso\n2) - Gerenciar Filme\n3) - Cadastrar Sala\n4) - Cadastrar Sessao");
                break;
                
            case 2:
                System.out.print("\n1) - Cadastrar um Novo Filme\n2) - Deletar um Filme\n3) - Consultar Filmes");
                break;    
            case 3:
                // cadastro de Sala de cinema   
                System.out.print("\n1) - Cadastro de uma Sala2D (Normal)\n2) - Cadastro de uma Sala3D\n3) - Cadastro de uma SalaIMAX");
                break;
            case 4:
                break;

        }
    }
    

}