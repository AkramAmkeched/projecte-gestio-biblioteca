public class Llibre {
    private String titol;
    private String autor;
    private boolean prestat;

    // Métode que crea un Llibre (Constructor)
    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public boolean esPrestat() {
        return prestat;
    }

    public void prestar() {
        prestat = true;
    }

    public void retornar() {
        prestat = false;
    }

    // Métode que modifica les dades del llibre
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

    @Override
    public String toString() {
        return titol + " de " + autor + (prestat ? " (En préstec)" : " (Disponible)");
    }
}