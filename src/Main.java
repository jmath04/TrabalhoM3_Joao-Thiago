package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EditorTexto editor = new EditorTexto();
        CommandInvoker invoker = new CommandInvoker();
        int op = 0;
        do{
            System.out.print("1. Adicionar um texto \n" +
                    "2. Remover parte do texto \n" +
                    "3. desfazer a ultima acao \n" +
                    "4. refazer a ultima acao desfeita\n" +
                    "5. mostrar o texto \n");
            System.out.println("Digite uma opção: ");
            op = scan.nextInt();
            scan.nextLine();
            switch (op){
                case 1:
                    System.out.println("Digite o texto a ser adcionado: ");
                    String texto = scan.nextLine();
                    invoker.executaComando(new AdicionaTexto(editor,texto));
                    break;
                case 2:
                    System.out.println("Digite a quantidade de texto a ser deletada(int): ");
                    int del = scan.nextInt();
                    invoker.executaComando(new RemoveTexto(editor,del));
                    break;
                case 3:
                    invoker.desfazComando();
                    System.out.println("Desfazendo o comando anterior");
                    break;
                case 4:
                    invoker.refazerComando();
                    System.out.println("Refazendo a acao desfeita.");
                    break;
                case 5:
                    System.out.println("Texto atual: \n" + editor);
                    break;
                case 6:
                    System.out.println("Saindo do programa....");
                    break;
                default:
                    System.out.println("opcao invalidada tente novamente.");
                    break;
            }
        }while(op != 6);
    }
}