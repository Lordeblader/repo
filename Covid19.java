public class Covid19 extends Vacuna {

    private String efectesSecundaris;

    public Covid19() {
        efectesSecundaris = "";
    }

    public Covid19(String nom, float efectivitat, int durada, String efectesSecundaris) {
        super(nom, efectivitat, durada);
        this.efectesSecundaris = efectesSecundaris;
    }

    public Covid19(Covid19 that) {
        super(that);

        this.efectesSecundaris = that.efectesSecundaris;
    }

    public void setEfectesSecundaris(String efectesSecundaris) {
        this.efectesSecundaris = efectesSecundaris;
    }

    public String getEfectesSecundaris() {
        return efectesSecundaris;
    }

    @Override
    public String toString() {
        return "Vacuna{nom: " + nom + ", efectivitat: " + efectivitat + ", durada: " + durada + ", efectes secundaris: " + efectesSecundaris + "}";
    }

}
