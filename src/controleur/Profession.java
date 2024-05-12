package controleur;

public class Profession {
    int idprofession;
    String libelle;

    public Profession(int idprofession, String libelle) {
        this.idprofession = idprofession;
        this.libelle = libelle;
    }

    public Profession (String libelle) {
        this.idprofession = 0;
        this.libelle = libelle;
    }

    public int getIdprofession() {
        return idprofession;
    }

    public void setIdprofession(int idprofession) {
        this.idprofession = idprofession;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
