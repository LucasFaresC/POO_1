public class tstComputador {
    public static void main(String arg[]){ //Class Loader | Funciona como main, normal
        
        Computador vivobook = new Computador(); // Metódo Construtor = Declaração da Classe 
        Leitura lei = Leitura.geraLeitura();

        vivobook.setArmazenamento(Integer.parseInt(lei.entDados("Armazenamento em TB = ")));

        vivobook.setMemoria(Integer.parseInt(lei.entDados("Memória Ram em GB = ")));

        vivobook.getPlacaDeVideo().setFamilia(lei.entDados("Da placa de video, qual é a Familia ? "));
        vivobook.getPlacaDeVideo().setSerie(Integer.parseInt(lei.entDados("Ainda ná placa, qual o numero de série dela ? ")));

        
       /*
        instancia a variável na RAM. Para isso
        informa ao S.O. as dimensões desta variável, que depois passa se chamar Objeto.
       */                                

        System.out.println("Endereço do vivobook: "+ vivobook + " com " + vivobook.getArmazenamento() + "TB de armazenamento, "
                         + vivobook.getMemoria() + " GB de memória ram, e placa de video " + vivobook.getPlacaDeVideo().getFamilia()
                         + vivobook.getPlacaDeVideo().getSerie());

    }
}
