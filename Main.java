public class Main {
    public static void main(String[] args) {
        // Es crea una nova biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Es creen tres llibres amb títol i autor
        Llibre llibre1 = new Llibre("1984", "George Orwell");
        Llibre llibre2 = new Llibre("El petit príncep", "Antoine de Saint-Exupéry");
        Llibre llibre3 = new Llibre("Cien años de soledad", "Gabriel García Márquez");

        // S'afegeixen els llibres a la biblioteca
        biblioteca.afegirLlibre(llibre1);
        biblioteca.afegirLlibre(llibre2);
        biblioteca.afegirLlibre(llibre3);

        // Es crea un usuari
        Usuari usuari = new Usuari("Carla");

        // Es crea el gestor de la biblioteca
        GestorBiblioteca gestor = new GestorBiblioteca();

        // Es mostra el llistat de llibres de la biblioteca
        System.out.println("Llistat de llibres:");
        biblioteca.llistarLlibres();

        // Es busca un llibre pel títol exacte
        System.out.println("\nBuscar llibre per títol exacte:");
        Llibre trobat = biblioteca.buscarLlibre("1984");
        System.out.println(trobat);

        // Es busca un llibre pel títol ignorant els accents
        System.out.println("\nBuscar llibre sense accents:");
        Llibre trobatSenseAccents = biblioteca.buscarLlibreSenseAccents("El petit princep");
        System.out.println(trobatSenseAccents);

        // Es presta un llibre a l'usuari
        System.out.println("\nPrestar llibre:");
        gestor.prestarLlibre(usuari, llibre2);

        // Es mostra el llistat de llibres després de prestar-ne un
        System.out.println("\nLlistat de llibres després de prestar:");
        biblioteca.llistarLlibres();

        // Es mostren els llibres prestats per l'usuari
        System.out.println("\nLlibres prestats per l'usuari:");
        for (Llibre l : usuari.getLlibresPrestats()) {
            System.out.println(l);
        }

        // Es modifica el títol d'un llibre
        System.out.println("\nModificar títol del llibre:");
        llibre1.modificar("titol", "Mil nou-cents vuitanta-quatre");
        System.out.println(llibre1);

        // S'elimina un llibre (es posen les propietats a null)
        System.out.println("\nEliminar llibre:");
        llibre3.eliminar();
        System.out.println(llibre3);
    }
}
