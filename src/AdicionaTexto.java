package src;

public class AdicionaTexto implements Command{
    private final EditorTexto editor;
    private final String texto;
    private Memento backup;

    public AdicionaTexto(EditorTexto editor, String texto){
        this.editor = editor;
        this.texto = texto;
    }
    @Override
    public void executar(){
        backup = editor.CriaMemento();
        editor.addTexto(texto);
    }
    @Override
    public void desfazer(){
        if(backup != null){
            editor.restauraMemento(backup);
        }
    }
}
