// Lucas Fares Correa Auad Pereira

public class Cliente {
    private int cpf;
    private String nome;
    private String email;
    private Ingresso[] ingressos;
    private boolean aptoMeia;

    // Sobrecarga
    public Cliente() {
        // IMPLEMENTAR SOBRECARGA
    }

    // Getters e Setters
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int  cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Ingresso[] getIngressos() {
        return ingressos;
    }

    public void setIngressos(Ingresso[] ingressos) {
        this.ingressos = ingressos;
    }

    public boolean isAptoMeia() {
        return aptoMeia;
    }

    public void setAptoMeia(boolean aptoMeia) {
        this.aptoMeia = aptoMeia;
    }

    //Sobrescrita 
    public String toString() {
        return "Cliente: " + nome + " (CPF: " + cpf + ")";
    }
}