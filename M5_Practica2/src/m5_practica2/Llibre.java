package m5_practica2;

public abstract class Llibre {

    private String nom;

    private String tipus;

    private String editorial;

    private int any;

    private String autor;

    public Llibre(String nom, String tipus, String editorial, int any, String autor) {
        this.nom = nom;
        this.tipus = tipus;
        this.editorial = editorial;
        this.any = any;
        this.autor = autor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
