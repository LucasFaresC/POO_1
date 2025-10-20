// Lucas Fares Corrêa Auad Pereira

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Principal{
    
    static List<Sala2D> salas2D = new ArrayList<Sala2D>();
    static List<Sala3D> salas3D = new ArrayList<Sala3D>();
    static List<SalaIMAX> salasImax = new ArrayList<SalaIMAX>();
    static List<Filme> filmes = new ArrayList<Filme>();
    static Leitura leitura = Leitura.geraLeitura();

    // contadores para geracao de ids precerudal
    static int contador_filmes = 0;
    static int contador_salas = 0;
    static int contador_ingresso = 0;
    static int contador_sessao = 0;
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
                            var = Integer.parseInt(leitura.entDados("\n>>> ")); //reflexividade
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
                    }else if(var == 3){ // Mostra todos os filmes e mostra o filme que ele quer com mais delatlhes
                        consulFilme();
                    }                   
                    break;
                case 3: 
                    menu(var);
                    while(true){
                        try{
                            var = Integer.parseInt(leitura.entDados("\n>>> ")); //reflexividade
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
                        cadastrarSala2D();
                    }else if(var == 2){
                        cadastrarSala3D();
                    }else if(var == 3){
                        cadastrarSalaIMAX();
                    }
                    break;
                case 4:
                    cadastrarSessao();
                    break;
                 
            }
     
        }
    }

    
    public static void cadastraFilme(){
        Filme filme = new Filme();
        filme.setId(contador_filmes);

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
            filme.setDiretor(leitura.entDados("\nInsira o Diretor principal do filme: "));//Reflexividade
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
            filme.setGenero(leitura.entDados("Insira o genero do Filme: "));
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
                
                String perg = leitura.entDados("\n" + filme.getNome() +" tem opção de legenda ?\n(1) Sim ou (2) Não: ");//Reflexividade
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
                
                String perg = leitura.entDados("\nO filme é Dublado em PT-BR?\n(1) Sim ou (2) Não: ");
                boolean resp = Integer.parseInt(perg) == 1;
                filme.setDublado(resp);
                break;

            } catch(NumberFormatException nfe) {
                System.out.print("Insira apenas numeros inteiros.");
            }
        }
        
        while(true) {
            try {
                // pq n funciona??? -> Funciona sim
                filme.setEstreia(leitura.entData("\nData de estreia (aaaa-mm-dd): ")); //Reflexividade
                
                break;
            } catch (DateTimeParseException dtpe) {
                System.out.println("\nERRO Data inválida! Use o formato aaaa-mm-dd (ex: 2024-12-25)");
            }
        }

        while(true) {
            try {
                LocalDate fimExibicao = leitura.entData("\nData de fim de exibição (aaaa-mm-dd): ");
                
                // validação necessaria pra ver se essa bomba não ta com a logica errada
                if (fimExibicao.isBefore(filme.getEstreia())) { // reflexividade
                    throw new DataInvalidaException("\nData de fim não pode ser anterior à data de estreia!");
                }
                
                filme.setFimExibicoes(fimExibicao);
                break;
            } catch (DateTimeParseException dtpe) {
                System.out.println("\nERRO Data inválida! Use o formato aaaa-mm-dd (ex: 2024-12-25)");
            } catch (DataInvalidaException die) {
                System.out.println("\nERRO " + die.getMessage());
            }
        }



        System.out.print("\nFilme cadastrado com sucesso\n=================\n"+filme);
        filmes.add(filme);
        contador_filmes++; // pra gerar novos id
    }

    public static Filme getFilmebyID(int alvo){
        
        Filme filme_alvo = new Filme();

        for(Filme f: filmes){
            if(alvo == f.getId()){
                filme_alvo = f;
            }
        }

        return filme_alvo;
    }

    public static void deleteFilme(){

        impAllFilmes();
        int alvo;

        while (true) { 
            try {
                alvo = Integer.parseInt(leitura.entDados("Digite o ID do Filme que deseja deletar\n>>> ")); // reflexividade
                if(!idFilmeRegistado(alvo)){
                    System.out.println("\nO ID digitado não tem correnspondente, tente novamente");
                    
                }else{
                    for(int i = 0; i < filmes.size(); i++){
                        if(filmes.get(i).getId() == alvo){
                            filmes.remove(i);
                        }
                    }
                    break;
                }
                
            } catch (NumberFormatException nfe) {
                System.out.print("\nInsira apenas numeros inteiros.");
            }
        }

        System.out.print("\nO filme selecionado foi deletado. ");


    }    

    public static void impAllFilmes(){
        if(filmes.isEmpty()){
            System.out.println("\nNão há filmes cadastrados.");
            return;
        }

        for(Filme f: filmes){
            System.out.print("\nID: "+ f.getId() + " Titulo: "+ f.getNome());
        }
    }

    public static void consulFilme(){

        impAllFilmes();
        if(filmes.isEmpty()){
            System.out.println("\nNão há filmes cadastrados, consulta, impossivel");
            return;
        }
        
        int alvo;

        while(true){
            try{
                alvo = Integer.parseInt(leitura.entDados("\nDigite o ID, do filme que deseja consultar\n>>> "));// reflexividade
                for(Filme f: filmes){
                    if(alvo == f.getId()){
                        break;
                    }else{
                        System.out.print("\nSeu ID digitado, não tem correspondentes. ");
                        return;
                    }

                }
                break;
            }catch(NumberFormatException nfe){
                System.out.print("\nDigite Apenas numeros inteiros.");
            }
        }

        System.out.print("\n"+ getFilmebyID(alvo));

    }

    public static boolean idFilmeRegistado(int alvo){

        boolean reg = false;

        for(Filme f: filmes){
            if(f.getId() == alvo){
                reg = true;   
            }
        }

        return reg;
    }

    public static void comprarIngresso(){
        
    }

    public static void menu(int codigo){
        switch (codigo) {
            case 0:
                System.out.print("\n<<< CINEMA UTPFR >>> " +LocalDate.now() +"\nSeja bem-vindo(a)\n0) - Sair do aplicativo\n1) - Comprar ingresso\n2) - Gerenciar Filme\n3) - Gerenciar Salas\n4) - Cadastrar Sessao");
                break;
                
            case 2:
                System.out.print("\n1) - Cadastrar um Novo Filme\n2) - Deletar um Filme\n3) - Consultar Filmes");
                break;    
            case 3:
                //cadastro de Sala de cinema   
                System.out.print("\n1) - Gerenciar as Salas 2D (Normal)\n2) - Gerenciar as Salas 3D\n3) - Gerenciar as Salas IMAX");
                break;

        }
    }
   
    public static void cadastrarSala2D(){
        Sala2D sala = new Sala2D();
        
        sala.setId(contador_salas);
        contador_salas++;
        
        System.out.println("\n=== CADASTRO SALA 2D ===");
        
        while(true){
            try {
                int cadeirantes = Integer.parseInt(leitura.entDados("\nNumero de poltronas para cadeirantes: "));
                sala.setPoltronasCadeirantes(cadeirantes);
                break;
            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira apenas numeros inteiros.");
            }
        }
          
        while(true){
            try { 
                
                sala.setAcessibilidadeSurdo(Integer.parseInt(leitura.entDados("\nPossui acessibilidade para surdos? (1) Sim (2) Nao: ")) == 1);
                break;

            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira 1 para Sim ou 2 para Nao.");
            }
        }
        
        while(true){
            try {
                sala.setAcessibilidadeCego(Integer.parseInt(leitura.entDados("\nPossui acessibilidade para cegos? (1) Sim (2) Nao: ")) == 1);
                break;
            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira 1 para Sim ou 2 para Nao.");
            }
        }
        
        salas2D.add(sala);
        System.out.println("\nSala 2D cadastrada com sucesso!\n" + sala);
    
    }

    public static void cadastrarSala3D(){
        Sala3D sala = new Sala3D( );
        
        sala.setId(contador_salas);
        contador_salas++;
        
        while(true){
            try {
                int cadeirantes = Integer.parseInt(leitura.entDados("\nNumero de poltronas para cadeirantes: "));
                sala.setPoltronasCadeirantes(cadeirantes);
                break;
            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira apenas numeros inteiros.");
            }
        }
        
        boolean certeza = false;

        while(!certeza){
            try {
                
                sala.setTecnologia(leitura.entDados("\nTecnologia 3D utlizada (ex: RealD, Dolby 3D): "));
                certeza = Integer.parseInt(leitura.entDados("\nID: "+sala.getId()+ " Tecnologia: "+ sala.getTecnologia() + "\nConfirmar(1) ou Cancelar(0): ")) == 1; // Reflexividade
            } catch (NumberFormatException e){
                System.out.println("\nApenas Digite numeros inteiros");
            }
        }
        
        certeza = false;

        while(!certeza){
            try {
                sala.setTaxaManutencao(Float.parseFloat(leitura.entDados("\nTaxa de manutencao (ex: 10.00): ")));
                certeza = Integer.parseInt(leitura.entDados("\nID: "+sala.getId()+ " Taxa adicional "+ sala.getTaxaManutencao() + "\nConfirmar(1) ou Cancelar(0): ")) == 1; // Reflexividade

            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira um valor valido.");
            }
        }
        
        salas3D.add(sala);
        System.out.println("\nSala 3D cadastrada com sucesso!\n" + sala);
    }

    public static void cadastrarSalaIMAX(){
        SalaIMAX sala = new SalaIMAX();
        
        sala.setId(contador_salas);
        contador_salas++;
        
        
        while(true){
            try {
                sala.setPoltronasCadeirantes(Integer.parseInt(leitura.entDados("\nNumero de poltronas para cadeirantes: "))); // Reflexividade
                break;
            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira apenas numeros inteiros.");
            }
        }
        
        
        while(true){
            try {
                boolean resp = Integer.parseInt(leitura.entDados("\nPossui poltronas premium? (1) Sim (2) Nao: ")) == 1; //Reflexividade
                sala.setPoltronaPremium(resp);
                break;
            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira 1 para Sim ou 2 para Nao.");
            }
        }
        
        while(true){
            try {
                
                sala.setTaxaAdicional(Float.parseFloat(leitura.entDados("\nTaxa adicional IMAX (ex: 32.50): ")));// Reflexividade
                break;
                
            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira um valor decimal valido.");
            }
        }
        
        salasImax.add(sala);
        System.out.println("\nSala IMAX cadastrada com sucesso! ID: " + sala.getId());
    }

    public static void imprimirTodasSalas() {
        imprimirSalas2D();
        System.out.println("");
        imprimirSalas3D();
        System.out.println("");
        imprimirSalasIMAX();
    }

    public static void imprimirSalas2D() {
        
        if (salas2D.isEmpty()) {
            System.out.println("\nNenhuma sala 2D cadastrada.");
            return;
        }
        
        for (Sala2D sala : salas2D) {
            System.out.println(sala);
        }
    }

    public static void imprimirSalas3D() {
        if (salas3D.isEmpty()) {
            System.out.println("\nNenhuma sala 3D cadastrada.");
            return;
        }
        
        for (Sala3D sala : salas3D) {
            System.out.println(sala);
        }
    }

    public static void imprimirSalasIMAX() {
        if (salasImax.isEmpty()) {
            System.out.println("\nNenhuma sala IMAX cadastrada.");
            return;
        }
        
        for (SalaIMAX sala : salasImax) {
            System.out.print(sala);
        }
    }

    public static void cadastrarSessao(){
        imprimirTodasSalas();
        while(true){
            int id_sala;
            try {
                id_sala = Integer.parseInt(leitura.entDados(rotulo));
            } catch (NumberFormatException e) {
            }
        }

        Sessao sessao = new Sessao();

        // Como eu confiro se a array ta cheio ou nao

    }

}