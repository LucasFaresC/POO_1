//José Antonio - EC

public class TstPes {
    
    public static void main(String[] args) {
        Leitura l1 = new Leitura();
        Pessoa p1 = new Pessoa();
        
        p1.setCpf(Integer.parseInt(l1.entDados("\nCPF...:")));
        p1.setNome(l1.entDados("NOME..: "));
        
        System.out.println("\nCPF...: "+p1.getCpf());
        System.out.println("NOMe..: "+p1.getNome());
        
    }
    
}
