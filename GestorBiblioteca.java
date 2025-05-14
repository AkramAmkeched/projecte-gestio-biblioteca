import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {
    // Llista de préstecs realitzats a la biblioteca
    private List<Prestec> prestecs;

    // Constructor: inicialitza la llista de préstecs
    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    // Presta un llibre a un usuari si el llibre no està prestat
    public void prestarLlibre(Usuari usuari, Llibre llibre) {
        if (!llibre.esPrestat()) { // Comprova si el llibre està disponible
            llibre.prestar(); // Marca el llibre com a prestat
            Prestec prestec = new Prestec(usuari, llibre, LocalDate.now()); // Crea el préstec
            prestecs.add(prestec); // Afegeix el préstec a la llista
            usuari.afegirLlibre(llibre); // Afegeix el llibre a la llista de llibres prestats de l'usuari
            System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());
        } else {
            System.out.println("Aquest llibre ja està prestat."); // Missatge si el llibre ja està prestat
        }
    }
}
