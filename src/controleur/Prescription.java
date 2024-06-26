package controleur;

public class Prescription {
    private int idprescription, idpatient, idmedecin;
    private String dateprescription, medicament, priseMedicament;

    public Prescription(int idprescription, String dateprescription, String medicament, int idpatient, int idmedecin, String priseMedicament) {
        super();
        this.idprescription = idprescription;
        this.idpatient = idpatient;
        this.idmedecin = idmedecin;
        this.dateprescription = dateprescription;
        this.medicament = medicament;
        this.priseMedicament = priseMedicament;
    }

    public Prescription(String dateprescription, String medicament, int idpatient, int idmedecin, String priseMedicament) {
        super();
        this.idprescription = 0;
        this.idpatient = idpatient;
        this.idmedecin = idmedecin;
        this.dateprescription = dateprescription;
        this.medicament = medicament;
        this.priseMedicament = priseMedicament;
    }

    public int getIdprescription() {
        return idprescription;
    }

    public void setIdprescription(int idprescription) {
        this.idprescription = idprescription;
    }

    public int getIdpatient() {
        return idpatient;
    }

    public void setIdpatient(int idpatient) {
        this.idpatient = idpatient;
    }

    public int getIdmedecin() {
        return idmedecin;
    }

    public void setIdmedecin(int idmedecin) {
        this.idmedecin = idmedecin;
    }

    public String getDateprescription() {
        return dateprescription;
    }

    public void setDateprescription(String dateprescription) {
        this.dateprescription = dateprescription;
    }

    public String getMedicament() {
        return medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public String getPriseMedicament() {
        return priseMedicament;
    }

    public void setPriseMedicament(String priseMedicament) {
        this.priseMedicament = priseMedicament;
    }
}
