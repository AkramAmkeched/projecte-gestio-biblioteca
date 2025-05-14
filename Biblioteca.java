/* 
 Afegir llibre a la biblioteca.
 Buscar llibre a la biblioteca.
 Buscar llibre a la biblioteca ignorant els accents.
 Llistar llibres. 
*/

import java.text.Normalizer; // Import per normalitzar textos (eliminar accents).
import java.util.ArrayList; // Import per utilitzar ArrayList.
import java.util.List; // Import per utilitzar interfícies de llistes.
import java.util.regex.Pattern; // Import per treballar amb expressions regulars.

public class Biblioteca {
    // Llista que conté els llibres de la biblioteca.
    private ArrayList<Llibre> llibres = new ArrayList<>();

    // Mètode per afegir un llibre a la biblioteca.
    public void afegirLlibre(Llibre llibre) {
        llibres.add(llibre); // Afegeix el llibre a la llista.
    }

    // Mètode per buscar un llibre pel títol (sense tenir en compte majúscules/minúscules).
    public Llibre buscarLlibre(String titol) {
        for (Llibre llibre : llibres) { // Itera sobre tots els llibres de la llista.
            if (llibre.getTitol().equalsIgnoreCase(titol)) { // Compara el títol ignorant majúscules/minúscules.
                return llibre; // Retorna el llibre si el troba.
            }
        }
        return null; // Retorna null si no troba cap llibre amb el títol especificat.
    }

    // Mètode per buscar un llibre pel títol ignorant els accents.
    public Llibre buscarLlibreSenseAccents(String titol) {
        String titolNormalitzat = normalitzarSenseAccents(titol); // Normalitza el títol d'entrada.

        for (Llibre llibre : llibres) { // Itera sobre tots els llibres de la llista.
            String titolLlibreNormalitzat = normalitzarSenseAccents(llibre.getTitol()); // Normalitza el títol del llibre.
            if (titolLlibreNormalitzat.equalsIgnoreCase(titolNormalitzat)) { // Compara els títols normalitzats.
                return llibre; // Retorna el llibre si el troba.
            }
        }
        return null; // Retorna null si no troba cap llibre amb el títol especificat.
    }

    // Mètode privat per normalitzar un text eliminant els accents.
    private String normalitzarSenseAccents(String text) {
        if (text == null) { // Comprova si el text és null.
            return null; // Retorna null si el text és null.
        }
        // Normalitza el text a la forma NFD (descomposició canònica).
        String normalized = Normalizer.normalize(text, Normalizer.Form.NFD);
        // Elimina els caràcters diacrítics (accents) utilitzant una expressió regular.
        return Pattern.compile("\\p{M}").matcher(normalized).replaceAll("");
    }

    // Mètode per llistar tots els llibres de la biblioteca.
    public void llistarLlibres() {
        for (int i = 0; i < llibres.size(); i++) { // Itera sobre tots els llibres de la llista.
            System.out.println(llibres.get(i)); // Imprimeix cada llibre.
        }
    }

    // Mètode per obtenir la llista de llibres.
    public List<Llibre> getLlibres() {
        return llibres; // Retorna la llista de llibres.
    }
}
