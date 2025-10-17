// Lucas Fares Corrêa Auad Pereira

public class SalaIMAX extends Sala implements Calc{
    private boolean poltronaPremium;
    private float taxaAdicional = 32.50f;

    public SalaIMAX() {
        super();
    }

    // Getters e Setters
    public boolean isPoltronaPremium() {
        return poltronaPremium;
    }

    public void setPoltronaPremium(boolean poltronaPremium) {
        this.poltronaPremium = poltronaPremium;
    }

    public float getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(float taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    //Sobrescrita
    public String toString() {
        return "Sala IMAX - ID: " + getId() + " - Taxa Adicional: R$ " + taxaAdicional;
    }

    //Sobrecarga
    public float calcularPreco(float precoBase) {
        return precoBase + taxaAdicional;
    }

}