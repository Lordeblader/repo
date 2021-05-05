public class Vacuna {

    private String nom;
    private float efectivitat;
    private int durada;

    public Vacuna() {
        nom = "";
    }

    public Vacuna(String nom, float e, int d) {
        this.nom = nom;
        efectivitat = e;
        durada = d;
    }

    public Vacuna(Vacuna that) {
        this.nom = that.nom;
        this.efectivitat = that.efectivitat;
        this.durada = that.durada;
    }

    @Override
    public String toString() {
        return "Vacuna{nom: " + nom + ", efectivitat: " + efectivitat + ", durada: " + durada + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vacuna) {
            Vacuna that = (Vacuna) obj;
            return this.nom.equals(that.nom) && this.efectivitat == that.efectivitat && this.durada == that.durada;
        }

        return false;
    }
}