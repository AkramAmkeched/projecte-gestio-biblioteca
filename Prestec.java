import java.time.LocalDate;

// Classe que representa un préstec d'un llibre a un usuari
public class Prestec {
    // Usuari que agafa el llibre en préstec
    private Usuari usuari;
    // Llibre prestat
    private Llibre llibre;
    // Data en què es fa el préstec
    private LocalDate dataPrestec;
    // Data de retorn prevista (2 setmanes després del préstec)
    private LocalDate dataRetorn;

    // Constructor: crea un préstec amb usuari, llibre i data de préstec
    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataPrestec.plusWeeks(2); // El retorn és dues setmanes després
    }

    // Retorna l'usuari que ha agafat el llibre
    public Usuari getUsuari() {
        return usuari;
    }

    // Retorna el llibre prestat
    public Llibre getLlibre() {
        return llibre;
    }

    // Retorna la data de retorn prevista
    public LocalDate getDataRetorn() {
        return dataRetorn;
    }
}