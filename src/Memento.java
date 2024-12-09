package src;

public class Memento {
    private String texto;

    public Memento(String texto){
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}
