

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int opcao;
        
        while(true){
   System.out.println("LISTA DE TAREFAS");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Concluir tarefa");
        System.out.println("4 - Excluir tarefa");
        System.out.println("5 - Sair.");
        
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        if(opcao == 1){
            System.out.println("Digite a tarefa: ");
            
            System.out.println("Tarefa adicionada com sucesso!");
            
        }
        
        }   
    }
}