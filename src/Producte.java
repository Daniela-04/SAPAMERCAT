public abstract class Producte {
    protected float preu;
    protected String nom;
    protected String codi;

    public Producte(int preu, String nom, String codi) {
        this.preu = preu;
        this.nom = nom;
        this.codi = codi;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }
}