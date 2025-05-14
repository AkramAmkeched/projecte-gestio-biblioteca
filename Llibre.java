public class Llibre {
    // Atributs privats: títol, autor i estat de préstec del llibre
    private String titol;
    private String autor;
    private boolean prestat;

    // Constructor: crea un llibre amb títol i autor, i el marca com a no prestat
    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    // Retorna el títol del llibre
    public String getTitol() {
        return titol;
    }

    // Retorna l'autor del llibre
    public String getAutor() {
        return autor;
    }

    // Indica si el llibre està prestat o no
    public boolean esPrestat() {
        return prestat;
    }

    // Marca el llibre com a prestat
    public void prestar() {
        prestat = true;
    }

    // Marca el llibre com a retornat (disponible)
    public void retornar() {
        prestat = false;
    }

    // Permet modificar el títol o l'autor del llibre segons la propietat indicada
    public void modificar(String propietat, String nouValor) {
        switch (propietat.toLowerCase()) {
            case "titol":
                this.titol = nouValor;
                break;
            case "autor":
                this.autor = nouValor;
                break;
            default:
                System.out.println("Propietat no vàlida. Les propietats disponibles són: titol, autor.");
        }
    }

    // "Elimina" el llibre posant les propietats a null i el marca com a no prestat
    public void eliminar() {
        this.titol = null;
        this.autor = null;
        this.prestat = false;
    }

    // Retorna una representació en text del llibre, indicant si està en préstec o disponible
    @Override
    public String toString() {
        return titol + " de " + autor + (prestat ? " (En préstec)" : " (Disponible)");
    }
}