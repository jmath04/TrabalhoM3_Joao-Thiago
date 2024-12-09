package src;

public class RemoveTexto implements Command {
    private final EditorTexto editor;
    private final int tamanho;
    private Memento backup;

    public RemoveTexto(EditorTexto editor, int tamanho){
        this.editor = editor;
        this.tamanho= tamanho;
    }
    @Override
    public void executar(){
        backup = editor.CriaMemento();
        editor.removeTexto(tamanho);
    }
    @Override
    public void desfazer(){
        if(backup != null){
            editor.restauraMemento(backup);
        }
    }
}
