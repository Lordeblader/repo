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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setEfectivitat(float efectivitat) {
        this.efectivitat = efectivitat;
    }

    public float getEfectivitat() {
        return efectivitat;
    }

    public void setDurada(int durada) {
        this.durada = durada;
    }

    public int getDurada() {
        return durada;
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

    public static void main(String[] args) {
        Vacuna v1 = new Vacuna();
        Vacuna v2 = new Vacuna();
        // 2n commit:
        Vacuna v3 = new Vacuna();
    }
}