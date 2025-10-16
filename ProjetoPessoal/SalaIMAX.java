// Lucas Fares Corrêa Auad Pereira
public class SalaIMAX extends Sala implements Calc{
    private boolean poltronaPremium;
    private float taxaAdicional;

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
    public float calcularPrecoIngresso(float precoBase) {
        return precoBase + taxaAdicional;
    }

    //Sobrecarga
    public float calcularPrecoIngresso(float precoBase, boolean usarPoltronaPremium) {
        float preco = precoBase + taxaAdicional;
        if (usarPoltronaPremium && poltronaPremium) {
            preco += 10.0f; // Acréscimo para poltrona premium
        }
        return preco;
    }
}