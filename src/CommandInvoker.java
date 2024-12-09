package src;

import java.util.Stack;

public class CommandInvoker {
    private final Stack<Command> DesfazerPilha = new Stack<Command>();
    private final Stack<Command> RefazerPilha = new Stack<Command>();

    public void executaComando(Command command){
        command.executar();
        DesfazerPilha.push(command);
        RefazerPilha.clear();
    }
    public void desfazComando(){
        if(!DesfazerPilha.empty()){
            Command command = DesfazerPilha.pop();
            command.desfazer();
            RefazerPilha.push(command);
        }
    }
    public void refazerComando(){
        if(!RefazerPilha.empty()){
            Command command = RefazerPilha.pop();
            command.executar();
            DesfazerPilha.push(command);
        }
    }



}
