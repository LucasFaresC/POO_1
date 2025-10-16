// Lucas Fares Corrêa Auad Pereira

public class Sala3D extends Sala{
    private float taxaManutencao;
    private String tecnologia;

    public Sala3D() {
        super();
    }

    // Getters e Setters
    public float getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(float taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    //Sobrescrita
    public String toString() {
        return "Sala 3D - ID: " + getId() + " - Tecnologia: " + tecnologia;
    }

    //Sobrecarga
    public float calcularCustoManutencao() {
        return taxaManutencao * getCapacidade();
    }

    //Sobrecarga
    public float calcularCustoManutencao(int meses) {
        return calcularCustoManutencao() * meses;
    }
     
}