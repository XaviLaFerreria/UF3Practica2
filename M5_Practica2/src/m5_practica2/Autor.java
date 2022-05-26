package m5_practica2;


import java.time.LocalDate;

public class Autor {

    private String nom;

    private String nacionalitat;

    private LocalDate data_naixement;

    public Autor(String nom, String nacionalitat, LocalDate data_naixement) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.data_naixement = data_naixement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public LocalDate getData_naixement() {
        return data_naixement;
    }

    public void setData_naixement(LocalDate data_naixement) {
        this.data_naixement = data_naixement;
    }
}
