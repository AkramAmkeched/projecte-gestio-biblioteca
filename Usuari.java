import java.util.ArrayList;
import java.util.List;

public class Usuari {
    // Nom de l'usuari
    private String nom;
    // Llista de llibres que té prestats l'usuari
    private List<Llibre> llibresPrestats;

    // Constructor: inicialitza el nom i la llista de llibres prestats
    public Usuari(String nom) {
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
    }

    // Retorna el nom de l'usuari
    public String getNom() {
        return nom;
    }

    // Retorna la llista de llibres prestats per l'usuari
    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    // Afegeix un llibre a la llista de llibres prestats
    public void afegirLlibre(Llibre llibre) {
        llibresPrestats.add(llibre);
    }

    // Elimina un llibre de la llista de llibres prestats
    public void retornarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }
}