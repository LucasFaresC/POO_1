// Lucas Fares Corrêa Auad Pereira
// RA: 2706652

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
        
        inicializarDadosTeste();

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

    public static void inicializarDadosTeste() {
        
        Filme filme1 = new Filme();
        filme1.setId(contador_filmes++);
        filme1.setNome("Carros 2");
        filme1.setGenero("Animação");
        filme1.setDiretor("John Lasseter");
        filme1.setDuracaoMin(106);
        filme1.setSinopse("Relâmpago McQueen e seu amigo Mate viajam pelo mundo participando do Grand Prix. Enquanto McQueen compete, Mate se envolve em uma perigosa missão de espionagem que coloca ambos em risco.");
        filme1.setLegendado(true);
        filme1.setDublado(true);
        filme1.setEstreia(LocalDate.now().minusDays(20)); //reflexividade
        filme1.setFimExibicoes(LocalDate.now().plusDays(40)); //reflexividade
        filmes.add(filme1);

        // Filme 2: Ne Zha 2  
        Filme filme2 = new Filme();
        filme2.setId(contador_filmes++);
        filme2.setNome("Ne Zha 2");
        filme2.setGenero("Animação");
        filme2.setDiretor("Yu Yang");
        filme2.setDuracaoMin(110);
        filme2.setSinopse("O jovem deus Ne Zha enfrenta uma nova ameaça sobrenatural enquanto luta para proteger o mundo mortal e celestial de forças demoníacas que buscam vingança.");
        filme2.setLegendado(true);
        filme2.setDublado(true);
        filme2.setEstreia(LocalDate.now().minusDays(15)); //reflexividade
        filme2.setFimExibicoes(LocalDate.now().plusDays(45)); //reflexividade
        filmes.add(filme2);

        // Filme 3: Show de Truman
        Filme filme3 = new Filme();
        filme3.setId(contador_filmes++);
        filme3.setNome("O Show de Truman");
        filme3.setGenero("Drama");
        filme3.setDiretor("Peter Weir");
        filme3.setDuracaoMin(103);
        filme3.setSinopse("Truman Burbank descobre que sua vida perfeita é na verdade um reality show televisionado 24 horas por dia, e deve escolher entre a segurança de sua prisão dourada ou a liberdade do mundo real.");
        filme3.setLegendado(false);
        filme3.setDublado(true);
        filme3.setEstreia(LocalDate.now().minusDays(10)); //reflexividade
        filme3.setFimExibicoes(LocalDate.now().plusDays(35)); //reflexividade
        filmes.add(filme3);

        // Filme 4: Superman (James Gunn - 2025)
        Filme filme4 = new Filme();
        filme4.setId(contador_filmes++);
        filme4.setNome("Superman");
        filme4.setGenero("Ação");
        filme4.setDiretor("James Gunn");
        filme4.setDuracaoMin(142);
        filme4.setSinopse("Clark Kent embarca em uma jornada para reconciliar sua herança kryptoniana com sua vida humana em Smallville. Ele deve encontrar o equilíbrio entre seu destino como super-herói e o desejo de viver uma vida normal com as pessoas que ama.");
        filme4.setLegendado(true);
        filme4.setDublado(true);
        filme4.setEstreia(LocalDate.now().minusDays(8)); //reflexividade
        filme4.setFimExibicoes(LocalDate.now().plusDays(37)); //reflexividade
        filmes.add(filme4);

        Filme filme5 = new Filme();
        filme5.setId(contador_filmes++);
        filme5.setNome("Até que a Sorte nos Separe 2");
        filme5.setGenero("Comédia");
        filme5.setDiretor("Roberto Santucci");
        filme5.setDuracaoMin(101);
        filme5.setSinopse("Janeiro continua metendo os pés pelas mãos enquanto tenta administrar seu dinheiro inesperado, mas descobre que riqueza traz tantos problemas quanto pobreza.");
        filme5.setLegendado(false);
        filme5.setDublado(true);
        filme5.setEstreia(LocalDate.now().minusDays(12)); //reflexividade
        filme5.setFimExibicoes(LocalDate.now().plusDays(33));//reflexividade
        filmes.add(filme5);

        Filme filme6 = new Filme();
        filme6.setId(contador_filmes++);
        filme6.setNome("Parasita");
        filme6.setGenero("Drama");
        filme6.setDiretor("Bong Joon-ho");
        filme6.setDuracaoMin(132);
        filme6.setSinopse("Uma família pobre elabora um plano inteligente para se infiltrar na casa de uma família rica\n mas segredos obscuros surgem quando os mundos colidem de forma violenta.");
        filme6.setLegendado(true);
        filme6.setDublado(true);
        filme6.setEstreia(LocalDate.now().minusDays(5));//reflexividade
        filme6.setFimExibicoes(LocalDate.now().plusDays(50)); //reflexividade
        filmes.add(filme6);

        Filme filme7 = new Filme();
        filme7.setId(contador_filmes++);
        filme7.setNome("Homem com H");
        filme7.setGenero("Documentário");
        filme7.setDiretor("João Jardim");
        filme7.setDuracaoMin(92);
        filme7.setSinopse("Documentário íntimo que acompanha a vida e carreira de Ney Matogrosso\n explorando sua trajetória artística, quebra de tabus e a construção de uma identidade única na música brasileira.\nO filme revela o homem por trás do personagem.");
        filme7.setLegendado(false);
        filme7.setDublado(true); 
        filme7.setEstreia(LocalDate.now().minusDays(3)); //relexividade
        filme7.setFimExibicoes(LocalDate.now().plusDays(42)); //reflexividade
        filmes.add(filme7);

        Filme filme8 = new Filme();
        filme8.setId(contador_filmes++);
        filme8.setNome("Ainda Estou Aqui");
        filme8.setGenero("Drama Biográfico");
        filme8.setDiretor("Walter Salles");
        filme8.setDuracaoMin(135); // DURAÇÃO CORRETA CONFIRMADA
        filme8.setSinopse("Durante a ditadura militar no Brasil, Eunice Paiva é forçada a se reinventar e traçar um novo destino para si e seus filhos após o desaparecimento forçado de seu marido, o ex-deputado Rubens Paiva. Baseado na autobiografia de Marcelo Rubens Paiva.");
        filme8.setLegendado(true);
        filme8.setDublado(true);
        filme8.setEstreia(LocalDate.now().minusDays(7));
        filme8.setFimExibicoes(LocalDate.now().plusDays(38));
        filmes.add(filme8);

        // INICIALIZAR SALAS
        // 3 Salas 2D
        for (int i = 0; i < 3; i++) {
            Sala2D sala = new Sala2D();
            sala.setId(contador_salas++);
            sala.setPoltronasCadeirantes(4);
            sala.setAcessibilidadeSurdo(i % 2 == 0);
            sala.setAcessibilidadeCego(i == 2);
            salas2D.add(sala);
        }

        // 3 Salas 3D
        for (int i = 0; i < 3; i++) {
            Sala3D sala = new Sala3D();
            sala.setId(contador_salas++);
            sala.setPoltronasCadeirantes(4);
            sala.setTecnologia(i == 0 ? "RealD" : (i == 1 ? "Dolby 3D" : "IMAX 3D"));
            sala.setTaxaManutencao(i == 2 ? 12.00f : 8.00f);
            salas3D.add(sala);
        }

        // 3 Salas IMAX
        for (int i = 0; i < 3; i++) {
            SalaIMAX sala = new SalaIMAX();
            sala.setId(contador_salas++);
            sala.setPoltronasCadeirantes(6);
            sala.setPoltronaPremium(true);
            sala.setTaxaAdicional(30.00f);
            salasImax.add(sala);
        }

        // CRIAR SESSÕES COM POLTRONAS OCUPADAS
        LocalDate hoje = LocalDate.now();
        int sessaoIdCounter = 0;

        // Criar múltiplas sessões para cada filme
        for (int dia = 0; dia < 5; dia++) {
            LocalDate dataSessao = hoje.plusDays(dia);

            LocalTime horarios []= {
                LocalTime.of(14, 0), LocalTime.of(16, 30), 
                LocalTime.of(19, 0), LocalTime.of(21, 30)
            };

            for (int horarioIndex = 0; horarioIndex < horarios.length; horarioIndex++) {
                LocalTime horario = horarios[horarioIndex];
                
                // Distribuir filmes entre as sessões
                int filmeIndex = (dia * 4 + horarioIndex) % filmes.size();
                Filme filmeAtual = filmes.get(filmeIndex);
                
                // Criar sessões em diferentes tipos de sala
                if (dia % 3 == 0) {
                    // Sala 2D
                    Sala2D sala2D = salas2D.get(dia % salas2D.size());
                    criarSessaoComOcupacao(filmeAtual, dataSessao, horario, sala2D, sessaoIdCounter++);
                }
                
                if (dia % 3 == 1 || horarioIndex >= 2) {
                    Sala3D sala3D = salas3D.get((dia + horarioIndex) % salas3D.size());
                    criarSessaoComOcupacao(filmeAtual, dataSessao, horario.plusMinutes(10), sala3D, sessaoIdCounter++);
                }
                
                if (horarioIndex >= 2) {
                    SalaIMAX salaIMAX = salasImax.get((dia + horarioIndex) % salasImax.size());
                    criarSessaoComOcupacao(filmeAtual, dataSessao, horario.plusMinutes(20), salaIMAX, sessaoIdCounter++);
                }
            }
        }

        contador_sessao = sessaoIdCounter;
        
    }

    // Criadora de sessoes ja ocupadas
    private static void criarSessaoComOcupacao(Filme filme, LocalDate data, LocalTime hora, Object sala, int idSessao) {
        Sessao sessao = new Sessao();
        sessao.setId(idSessao);
        sessao.setFilme(filme);
        sessao.setData(data);
        sessao.setHora(hora);
        
        // Inicializar matriz de poltronas 4x4
        boolean poltronasOcupadas[][] = new boolean[4][4];
        int poltronasOcupadasCount = 0;
        
        // gerador chique de numeros aleatorios
        java.util.Random random = new java.util.Random(idSessao + filme.getId());
        
        for (int fileira = 0; fileira < 4; fileira++) {
            for (int poltrona = 0; poltrona < 4; poltrona++) {
                // Chance de 35% de estar ocupada
                if (random.nextDouble() < 0.35) {
                    poltronasOcupadas[fileira][poltrona] = true;
                    poltronasOcupadasCount++;

                    Ingresso ingresso = new Ingresso();
                    ingresso.setId(contador_ingresso++);
                    ingresso.setSessao(sessao);
                    ingresso.setFileira(fileira+1);
                    ingresso.setPoltrona(poltrona+1);


                    // fazendo aquela gambiarra denovo
                    String tipo = "";
                    if(sala instanceof Sala2D){
                        tipo = "2D";
                    }else if(sala instanceof Sala3D){
                        tipo = "3D";
                    }else if(sala instanceof SalaIMAX){
                        tipo = "IMAX";
                    }
                    ingresso.setPrecoCompra(calcularPrecoIngresso(tipo, sala, random.nextBoolean()));//reflexividade
                    ingresso.setDataHoraCompra(LocalDateTime.now().minusHours(random.nextInt(72)));
                    seusIngressos.add(ingresso);
                }
            }
        }
        
        sessao.setPoltronasOcupadas(poltronasOcupadas);
        sessao.setCheio(poltronasOcupadasCount == 16);
        
        if(sala instanceof Sala2D) {
            ((Sala2D)sala).getSessoes().add(sessao);
        } else if(sala instanceof Sala3D) {
            ((Sala3D)sala).getSessoes().add(sessao);
        } else if(sala instanceof SalaIMAX) {
            ((SalaIMAX)sala).getSessoes().add(sessao);
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
                int cont = 0;
                for(Filme f: filmes){
                    cont++;
                    if(alvo == f.getId()){
                        break;
                    }else if(cont == filmes.size()){ // procuramos e não achamos
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

    public static void menu(int codigo, Integer codig_secundario){
        if(codig_secundario == null){
            menu(codigo);
        }// é sabio fazer mais menus ?

    }

    public static void menu(int codigo){

        switch (codigo) {
            case 0:
                System.out.print("\n<<< CINEMA UTPFR >>> " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd | HH:mm")) +"\nSeja bem-vindo(a)\n0) - Sair do aplicativo\n1) - Comprar ingresso\n2) - Gerenciar Filme\n3) - Gerenciar Salas\n4) - Cadastrar Sessao");
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
        boolean sem_salas = false;
        int contador_regressivo = salas2D.size();
        for(Sala2D s2d : salas2D){
            contador_regressivo--;
            if(s2d.getSessoes().isEmpty()){ // reflexividade
                sem_salas = true;
                break;
            }else if(contador_regressivo == 0){
                break;
            }
            for(Sessao s: s2d.getSessoes()){
                System.out.print(s);
            }
            
        }
        System.out.print(sem_salas == false ? "==============": "");
        
        contador_regressivo = salas3D.size();
        for(Sala3D s3d : salas3D){
            contador_regressivo--;
            if(s3d.getSessoes().isEmpty()){ // reflexividade
                sem_salas = true;
                break;
            }else if(contador_regressivo == 0){
                break;
            }
            for(Sessao s: s3d.getSessoes()){
                System.out.print(s);
            }
        }
        System.out.print(sem_salas == false ? "==============": "");
        
        contador_regressivo = salas3D.size();
        for(SalaIMAX simax : salasImax){ 
            if(simax.getSessoes().isEmpty() || contador_regressivo == 0){ // reflexividade
                break;
            }
            for(Sessao s: simax.getSessoes()){
                System.out.print(s);
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

                
               sessaoEscolhida = getSessaoById(idSessao);

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
        System.out.print("\n=====================================\n");
    }

    public static Sessao getSessaoById(int alvo){

        Sessao s = new Sessao();
        
        for (Sala2D sala : salas2D) {
            for (Sessao sessao : sala.getSessoes()) {
                if (sessao.getId() == alvo) {
                    s = sessao;
                    
                }
            }
        }
                
        for (Sala3D sala : salas3D) {
            for (Sessao sessao : sala.getSessoes()) {
                if (sessao.getId() == alvo) {
                    s = sessao;
                }
            }
        }
        
        for (SalaIMAX sala : salasImax) {
            for (Sessao sessao : sala.getSessoes()) {
                if (sessao.getId() == alvo) {
                    s = sessao;
                }
            }
        }

        return s;

    }

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

    public static void exibirMapaPoltronas(Sessao sessao) {
        System.out.print("\n=== MAPA DE POLTRONAS ===");
        System.out.print("\nLegenda: [ ] Disponível  [X] Ocupada\n");
        System.err.print("   ");
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
        
        boolean tem_sala = false;
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
        
        if (!tem_sala){
            System.out.print("Não há nenhuma sala com este ID. ");
        }

        return null; // Não encontrada
    }

}