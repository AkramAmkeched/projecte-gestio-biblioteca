public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Llibre llibre1 = new Llibre("1984", "George Orwell");
        Llibre llibre2 = new Llibre("El petit príncep", "Antoine de Saint-Exupéry");
        Llibre llibre3 = new Llibre("Cien años de soledad", "Gabriel García Márquez");
        biblioteca.afegirLlibre(llibre1);
        biblioteca.afegirLlibre(llibre2);
        biblioteca.afegirLlibre(llibre3);

        Usuari usuari = new Usuari("Carla");
        GestorBiblioteca gestor = new GestorBiblioteca();

        System.out.println("Llistat de llibres:");
        biblioteca.llistarLlibres();

        System.out.println("\nBuscar llibre per títol exacte:");
        Llibre trobat = biblioteca.buscarLlibre("1984");
        System.out.println(trobat);

        System.out.println("\nBuscar llibre sense accents:");
        Llibre trobatSenseAccents = biblioteca.buscarLlibreSenseAccents("El petit princep");
        System.out.println(trobatSenseAccents);

        System.out.println("\nPrestar llibre:");
        gestor.prestarLlibre(usuari, llibre2);

        System.out.println("\nLlistat de llibres després de prestar:");
        biblioteca.llistarLlibres();

        System.out.println("\nLlibres prestats per l'usuari:");
        for (Llibre l : usuari.getLlibresPrestats()) {
            System.out.println(l);
        }

        System.out.println("\nModificar títol del llibre:");
        llibre1.modificar("titol", "Mil nou-cents vuitanta-quatre");
        System.out.println(llibre1);

        System.out.println("\nEliminar llibre:");
        llibre3.eliminar();
        System.out.println(llibre3);
    }
}
