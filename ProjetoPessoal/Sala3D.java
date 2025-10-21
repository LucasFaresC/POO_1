// Lucas Fares Corrêa Auad Pereira
// RA: 2706652

public class Sala3D extends Sala implements Calc{
    private float taxaManutencao = 10.00f;
    private String tecnologia;

    public Sala3D(){}// contructor default

    // Sobrecarga
    public Sala3D(float tex_man, String tec) {
        this.taxaManutencao = tex_man;
        this.tecnologia = tec;
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
        return "Sala 3D - ID: " + getId() + "\nTecnologia: " + tecnologia +"\nTaxa Adional: R$"+taxaManutencao;
    }

    public float calcularPreco(float preco){
        return preco + taxaManutencao;
    }
     
}