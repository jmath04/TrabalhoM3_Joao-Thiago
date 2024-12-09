package src;

public class EditorTexto implements Originator{
    private StringBuilder texto = new StringBuilder();

    public void addTexto(String text){
        texto.append(text);
    }
    public void removeTexto(int tamanho){
        if(texto.length() < tamanho){
            tamanho = texto.length();
        }
        texto.delete(texto.length() - tamanho, texto.length());
    }
    @Override
    public Memento CriaMemento(){
        return new Memento(texto.toString());
    }

    @Override
    public void restauraMemento(Memento memento) {
        this.texto = new StringBuilder(memento.toString());
    }

    @Override
    public String toString() {
        return texto.toString();
    }

}
