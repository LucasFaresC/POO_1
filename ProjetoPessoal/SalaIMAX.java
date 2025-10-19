// Lucas Fares Corrêa Auad Pereira

public class SalaIMAX extends Sala implements Calc{
    private boolean poltronaPremium;
    private float taxaAdicional = 32.50f;

    //Sobrecarga
    public SalaIMAX(boolean pol_pre, float tax_add) {
        this.poltronaPremium = pol_pre;
        this.taxaAdicional = tax_add;
    }
    

    // Getters e Setters
    public boolean getPoltronaPremium() {
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