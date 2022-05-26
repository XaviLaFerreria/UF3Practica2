package m5_practica2;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    public List copias_llibres;

    public Biblioteca(List copias_llibres) {
        this.copias_llibres = new ArrayList();
    }

    public List getCopias_llibres() {
        return copias_llibres;
    }

    
}
