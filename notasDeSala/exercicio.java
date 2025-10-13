
public class exercicio {
    public static void main(String[] args) {
        menu();
        Leitura lei = Leitura.geraLeitura();
        int resposta;

        resposta = Integer.parseInt(lei.entDados(">>>"));

        
        
    }

    public static void menu(){

        System.out.println("<< Calculadora >>\n1) Somar\n2) Subtração\n3) Multiplicação\n4) Divisão\n5) Sair do Sistema");

    }


}
