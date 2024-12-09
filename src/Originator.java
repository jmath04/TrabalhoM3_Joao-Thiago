package src;

public interface Originator {
    Memento CriaMemento();
    void restauraMemento(Memento memento);
}
