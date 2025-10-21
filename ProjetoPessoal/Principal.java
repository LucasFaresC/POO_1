// Lucas Fares Corrêa Auad Pereira
// RA: 2706652


import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Principal{
    static List<Ingresso> seusIngressos = new ArrayList<Ingresso>();
    static List<Sala2D> salas2D = new ArrayList<Sala2D>();
    static List<Sala3D> salas3D = new ArrayList<Sala3D>();
    static List<SalaIMAX> salasImax = new ArrayList<SalaIMAX>();
    static List<Filme> filmes = new ArrayList<Filme>();
    static Leitura leitura = Leitura.geraLeitura();

    // contadores para geracao de ids precedural
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
                            System.out.print("\nErro: " + voobe.getMessage());
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
            filme.setGenero(leitura.entDados("\nInsira o genero do Filme (ex: Ação, Drama, Comédia): ")); // Reflexividade
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
                System.out.print("\nInsira apenas numeros inteiros.");
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
                
                String perg = leitura.entDados("\nO filme é Dublado em PT-BR?\n(1) Sim ou (2) Não: "); // Reflexividade
                boolean resp = Integer.parseInt(perg) == 1;
                filme.setDublado(resp);
                break;

            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira apenas numeros inteiros.");
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

    public static void menu(int codigo){
        switch (codigo) {
            case 0:
                System.out.print("\n<<< CINEMA UTPFR >>> " +LocalTime.now() +"\nSeja bem-vindo(a)\n0) - Sair do aplicativo\n1) - Comprar ingresso\n2) - Gerenciar Filme\n3) - Gerenciar Salas\n4) - Cadastrar Sessao");
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
                int cadeirantes = Integer.parseInt(leitura.entDados("\nNumero de poltronas para cadeirantes: ")); // Reflexividade
                sala.setPoltronasCadeirantes(cadeirantes);
                break;
            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira apenas numeros inteiros.");
            }
        }
          
        while(true){
            try { 
                
                sala.setAcessibilidadeSurdo(Integer.parseInt(leitura.entDados("\nPossui acessibilidade para surdos? (1) Sim (2) Nao: ")) == 1); // Reflexividade
                break;

            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira 1 para Sim ou 2 para Nao.");
            }
        }
        
        while(true){
            try {
                sala.setAcessibilidadeCego(Integer.parseInt(leitura.entDados("\nPossui acessibilidade para cegos? (1) Sim (2) Nao: ")) == 1); // Reflexividade
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
                int cadeirantes = Integer.parseInt(leitura.entDados("\nNumero de poltronas para cadeirantes: ")); // reflexividade
                sala.setPoltronasCadeirantes(cadeirantes);
                break;
            } catch(NumberFormatException nfe) {
                System.out.print("\nInsira apenas numeros inteiros.");
            }
        }
        
        boolean certeza = false;

        while(!certeza){
            try {
                
                sala.setTecnologia(leitura.entDados("\nTecnologia 3D utlizada (ex: RealD, Dolby 3D): ")); // reflexividade
                certeza = Integer.parseInt(leitura.entDados("\nID: "+sala.getId()+ " Tecnologia: "+ sala.getTecnologia() + "\nConfirmar(1) ou Cancelar(0): ")) == 1; // Reflexividade
            } catch (NumberFormatException e){
                System.out.println("\nApenas Digite numeros inteiros");
            }
        }
        
        certeza = false;

        while(!certeza){
            try {
                sala.setTaxaManutencao(Float.parseFloat(leitura.entDados("\nTaxa de manutencao (ex: 10.00): "))); // reflexividade
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
        System.out.println("==============");
        imprimirSalas3D();
        System.out.println("==============");
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
        int id_sala;
        while(true){
            try {
                id_sala = Integer.parseInt(leitura.entDados("\nInsira o ID da sala que deseja cadastrar esta sessão:")); // Reflexividade
                break;
            } catch (NumberFormatException e) {
                System.out.print("\nDigite apenas valores inteiros");
            }
        }

        boolean id_de_sala_3d = false;
        boolean id_de_sala_2d = false;
        boolean id_de_sala_imax = false;

        for(Sala2D sala : salas2D){
            if(id_sala == sala.getId()){
                id_de_sala_2d = true;
            }
        }

        for(Sala3D sala : salas3D){
            if(id_sala == sala.getId()){
                id_de_sala_3d = true;
            }
        }

        for(SalaIMAX sala : salasImax){
            if(id_sala == sala.getId()){
                id_de_sala_imax = true;
            }
        }

        if(id_de_sala_2d){
            Sessao sessao = new Sessao();
            sessao.setId(contador_sessao++);

            while(true){
                try{
                    sessao.setData(leitura.entData("\nInsira a data de exibição do filme (aaaa-mm-dd): ")); // reflexividade
                    sessao.setHora(leitura.entHorario("\nInsira o Horário de início da sessão (hh:mm): "));// reflexividade
                    break;
                }catch(DateTimeException dte){
                    System.out.print("\nERRO Data inválida! Use o formato aaaa-mm-dd (ex: 2024-12-25)\nPara horario use hh:mm (ex: 15:30).");
                }
                
            }
            
            inserirFilmeEmSessao(sessao);
            System.out.print("\nSessão cadastrada!\nID: "+sessao.getId()+ "\nData e horário: "+sessao.getData() + " " +sessao.getHora()+"\n==========\n"+ sessao.getFilme());
            salas2D.get(id_sala).getSessoes().add(sessao); //reflexividade

        }else if(id_de_sala_3d){
            Sessao sessao = new Sessao();
            sessao.setId(contador_sessao++);

            while(true){
                try{
                    sessao.setData(leitura.entData("\nInsira a data de exibição do filme (aaaa-mm-dd): ")); // reflexividade
                    sessao.setHora(leitura.entHorario("\nInsira o Horário de início da sessão (hh:mm): "));// reflexividade
                    break;
                }catch(DateTimeException dte){
                    System.out.print("\nERRO Data inválida! Use o formato aaaa-mm-dd (ex: 2024-12-25)\nPara horario use hh:mm (ex: 15:30).");
                }
                
            }

            inserirFilmeEmSessao(sessao);
            salas3D.get(id_sala).getSessoes().add(sessao); //reflexividade
            System.out.print("\nSessão cadastrada!\nID: "+sessao.getId()+ "\nData e horário: "+sessao.getData() + " " +sessao.getHora()+"\n==========\n"+ sessao.getFilme());
            
        }else if(id_de_sala_imax){
            Sessao sessao = new Sessao();
            sessao.setId(contador_sessao++);

            while(true){
                try{
                    sessao.setData(leitura.entData("\nInsira a data de exibição do filme (aaaa-mm-dd): ")); // reflexividade
                    sessao.setHora(leitura.entHorario("\nInsira o Horário de início da sessão (hh:mm): "));// reflexividade
                    break;
                }catch(DateTimeException dte){
                    System.out.print("\nERRO Data inválida! Use o formato aaaa-mm-dd (ex: 2024-12-25)\nPara horario use hh:mm (ex: 15:30).");
                }
                
            }

            inserirFilmeEmSessao(sessao);
            System.out.print("\nSessão cadastrada!\nID: "+sessao.getId()+ "\nData e horário: "+sessao.getData() + " " +sessao.getHora()+"\n==========\nINFO sobre o filme:"+ sessao.getFilme());
            salasImax.get(id_sala).getSessoes().add(sessao); //reflexividade
            

        }else{
            System.out.print("\nO numero digitado, não tem correspondentes. Retornando");
            return;
        }

        //confeir data → conferir possiveis conflitos
        //calcular tempo de final de sessao

    }   

    public static void inserirFilmeEmSessao(Sessao s){
        impAllFilmes();
        int id_filme;
        while (true){
            try {
                id_filme = Integer.parseInt(leitura.entDados("\nInsira o ID do filme que gostaria agendar um sessão: ")); //reflexividade
                if(idFilmeRegistado(id_filme)){
                    s.setFilme(getFilmebyID(id_filme)); //reflexividade
                    break;
                }else{
                    System.out.println("\nO id digitado não tem correspondente.");
                    return;
                }


            }catch(NumberFormatException nfe) {
                System.out.print("\nDigite apenas numeros inteiros");
            }
        }
    }

    public static void impAllSessoes(){
        boolean sem_salas = true;

        for(Sala2D s2d : salas2D){
            if(!s2d.getSessoes().isEmpty() == false){ // reflexividade
                sem_salas = false;
                System.out.print(s2d);
            }
        }
        System.out.print(sem_salas == false ? "==============": "");
        
        for(Sala3D s3d : salas3D){
            if(!s3d.getSessoes().isEmpty() == false){ // reflexividade
                sem_salas = false;
                System.out.print(s3d);
            }
        }
        System.out.print(sem_salas == false ? "==============": "");
        
        for(SalaIMAX simax : salasImax){ 
            if(!simax.getSessoes().isEmpty() == false){ // reflexividade
                System.out.print(simax);
            }
        }
        
        
    }

    public static void comprarIngresso(){
    // Verifica se há sessões disponíveis
        if (salas2D.isEmpty() && salas3D.isEmpty() && salasImax.isEmpty()) {
            System.out.println("\nNão há salas cadastradas. Impossível vender ingressos.");
            return;
        }
        
        // Listar todas as sessões disponíveis
        System.out.println("\n=== SESSÕES DISPONÍVEIS ===");
        impAllSessoes();
        
        // Selecionar sessão
        int idSessao;
        int idSala = 0;
        Sessao sessaoEscolhida = new Sessao();
        boolean id_de_sala_3d = false;
        boolean id_de_sala_2d = false;
        boolean id_de_sala_imax = false;
        float precoFinal = 0.00f;
        while (true) {
            try {
                idSessao = Integer.parseInt(leitura.entDados("\nDigite o ID da sessão desejada: "));// reflexividade
                
                // Buscar sessão em todas as salas
                for (Sala2D sala : salas2D) {
                    for (Sessao sessao : sala.getSessoes()) {
                        if (sessao.getId() == idSessao) {
                            id_de_sala_2d = true;
                            idSala = sala.getId();
                            break;
                        }
                    }
                }
                
                for (Sala3D sala : salas3D) {
                    for (Sessao sessao : sala.getSessoes()) {
                        if (sessao.getId() == idSessao) {
                            id_de_sala_3d = true;
                            idSala = sala.getId();
                            break;
                        }
                    }
                }
                
                for (SalaIMAX sala : salasImax) {
                    for (Sessao sessao : sala.getSessoes()) {
                        if (sessao.getId() == idSessao) {
                            id_de_sala_imax = true;
                            idSala = sala.getId();
                            break;
                        }
                    }
                }
                
                if (!id_de_sala_2d && !id_de_sala_3d && !id_de_sala_imax) {
                    System.out.print("\nSessão não encontrada! Tente novamente.");
                    return;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("\nDigite um número inteiro válido.");
            }
        }
        
        // Mostrar informações da sessão escolhida
        System.out.print("\n=== SESSÃO SELECIONADA ===");
        System.out.print("\nFilme: " + sessaoEscolhida.getFilme().getNome());
        System.out.print("\nData: " + sessaoEscolhida.getData());
        System.out.print("\nHorário: " + sessaoEscolhida.getHora());
        System.out.print("\nSala: " + getSalaById(idSala));
        
        // Mostrar mapa de poltronas
        exibirMapaPoltronas(sessaoEscolhida);
        
        Ingresso ingresso = new Ingresso();
        // Selecionar poltrona
        while (true) {
            try {
                ingresso.setFileira(Integer.parseInt(leitura.entDados("\nDigite a fileira desejada (1-4): "))); // Reflexividade
                ingresso.setPoltrona(Integer.parseInt(leitura.entDados("\nDigite a poltrona desejada (1-4): "))); // Reflexividade
            
                
                if (ingresso.getFileira() < 1 || ingresso.getFileira() > 4 || ingresso.getPoltrona() < 1 || ingresso.getPoltrona() > 4) {
                    System.out.print("\nFileira e poltrona devem estar entre 1 e 4!");
                    continue;
                }
                
                // Verificar se poltrona está disponível
                if (!sessaoEscolhida.poltronaLivre(ingresso.getFileira() - 1, ingresso.getPoltrona() - 1)) {// Reflexividade
                    System.out.print("\nPoltrona já ocupada! Escolha outra.");
                    continue;
                }
                
                break;
            } catch (NumberFormatException e) {
                System.out.print("\nDigite números inteiros válidos.");
            }
        }
        
        // Verificar se é meia-entrada
        while (true) {
            try {
                ingresso.setMeia(Integer.parseInt(leitura.entDados("\nÉ meia-entrada? (1) Sim (2) Não: ")) == 1); // reflexividade
                break;
            } catch (NumberFormatException e) {
                System.out.print("\nDigite um número inteiro válido.");
            }
        }
        
        // Calcular preço baseado no tipo de sala
        if(id_de_sala_2d){
            precoFinal = calcularPrecoIngresso("2D", getSalaById(idSala), ingresso.isMeia());
            
        }else if(id_de_sala_3d){
            precoFinal = calcularPrecoIngresso("3D", getSalaById(idSala), ingresso.isMeia());
            
        }else if(id_de_sala_imax){
            precoFinal = calcularPrecoIngresso("IMAX", getSalaById(idSala), ingresso.isMeia());
            
        }
        
        ingresso.setId(contador_ingresso++);

        // Criar ingresso
        ingresso.setDataHoraCompra(LocalDateTime.now());
        
        // Marcar poltrona como ocupada
        sessaoEscolhida.ocuparPoltrona(ingresso.getFileira() - 1, ingresso.getPoltrona() - 1);
        
        // Adicionar à lista de ingressos vendidos
        seusIngressos.add(ingresso);
        
        // Mostrar resumo da compra
        System.out.print("\n=== INGRESSO COMPRADO COM SUCESSO! ===");
        System.out.print("\nID do Ingresso: " + ingresso.getId());
        System.out.print("\nFilme: " + sessaoEscolhida.getFilme().getNome());// Reflexividade
        System.out.print("\nData: " + sessaoEscolhida.getData() + " " + sessaoEscolhida.getHora());
        System.out.print("\nPoltrona: Fileira " + ingresso.getFileira() + ", Assento " + ingresso.getPoltrona());
        System.out.print("\nTipo: " + (ingresso.isMeia() ? "Meia-entrada" : "Inteira"));
        System.out.print("\nPreço: R$ " + precoFinal);
        System.out.print("\n=====================================");
    }

    // Método auxiliar para calcular preço baseado no tipo de sala
    public static float calcularPrecoIngresso(String tipoSala, Object sala, boolean meia) {
        float precoBase = 14.50f; // Preço base definido na classe Sala
        
        switch (tipoSala) {
            case "2D":
                if (sala instanceof Sala2D) {
                    precoBase = ((Sala2D) sala).calcularPreco(precoBase);
                }
                break;
            case "3D":
                if (sala instanceof Sala3D) {
                    precoBase = ((Sala3D) sala).calcularPreco(precoBase);
                }
                break;
                case "IMAX":
                if (sala instanceof SalaIMAX) {
                    
                    precoBase = ((SalaIMAX) sala).calcularPreco(precoBase);
                }
                break;
        }
        
        return meia ? precoBase / 2 : precoBase;
    }

    // Método para exibir mapa de poltronas
    public static void exibirMapaPoltronas(Sessao sessao) {
        System.out.print("\n=== MAPA DE POLTRONAS ===");
        System.out.print("\nLegenda: [ ] Disponível  [X] Ocupada");
        System.out.print("   ");
        for (int i = 1; i <= 4; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        
        for (int fileira = 0; fileira < 4; fileira++) {
            System.out.print((char)('A' + fileira) + "  ");
            for (int poltrona = 0; poltrona < 4; poltrona++) {
                if (sessao.poltronaLivre(fileira, poltrona)) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[X]");
                }
            }
            System.out.println();
        }
    }

    public static Sala getSalaById(int id) { // oi professor, tive que fazer uma gambiarra, mas funciona!
        // Procurar nas salas 2D
        for (Sala2D sala : salas2D) {
            if (sala.getId() == id) {
                // Polimorfismo: Sala2D é uma Sala
                return sala; 
            }
        }
        
        // Procurar nas salas 3D
        for (Sala3D sala : salas3D) {
            if (sala.getId() == id) {
                // Polimorfismo: Sala3D é uma Sala
                return sala; 
            }
        }
        
        // Procurar nas salas IMAX
        for (SalaIMAX sala : salasImax) {
            if (sala.getId() == id) {
                // Polimorfismo: SalaIMAX é uma Sala
                return sala; 
            }
        }
        
        return null; // Não encontrada
    }

}