import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] tarefas = new String[10];
        boolean[] concluidas = new boolean[10];
        
        int opcao = 0;
        
        while(opcao !=5){
            System.out.println("Lista De Tarefas");
            System.out.println("1.Adicionar tarefa");
            System.out.println("2.Listar tarefa");
            System.out.println("3.Concluir tarefa");
            System.out.println("4.Excluir tarefa");
            System.out.println("5.Sair");
            
            System.out.println("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    int posicaoLivre = -1;
                    
                    for(int i = 0; i < tarefas.length; i++){
                        if(tarefas[i] == null){
                            posicaoLivre = i;
                            break;
                            
                        }
                    }
                    if (posicaoLivre == -1){
                        System.out.println("A lista de tarefas está cheia!");
               }
                 else{
               System.out.println("Digite a tarefa: ");
               tarefas[posicaoLivre] = scanner.nextLine();
               System.out.println("Tarefa adicionada com sucesso!");
               concluidas[posicaoLivre] = false;
                        System.out.println("Tarefa adicionada com sucesso");
           }
                    
           break;    
           
                case 2:
                System.out.println("Minhas tarefas");
                
                boolean existeTarefa = false;
                
                for(int i = 0; i < tarefas.length; i++){
                    if(tarefas[i] != null){
                        existeTarefa = true;
                        if(concluidas[i] == true){
                            System.out.println((i + 1) + " - [x] " + tarefas[i]);
                        } else{
                            System.out.println((i + 1) + " - [] " + tarefas[i]);
                        }
                    }
                }
                
                if (existeTarefa == false){
                    System.out.println("Nenhuma tarefa registrada!");
                }
                
                break;
                
                case 3:
                    System.out.println("Digite o numero da tarefa que deseja concluir: ");
                    int numeroConcluir = scanner.nextInt();
                    
                    int indiceConcluir = numeroConcluir = -1;
                    
                    if (indiceConcluir >= 0 && 
                            indiceConcluir < tarefas.length &&
                            tarefas[indiceConcluir] != null){
                        concluidas[indiceConcluir] = true;
                        
                        System.out.println("Tarefa concluida com sucesso!");
            }
                    else{
                        System.out.println("Tarefa invalida.");
                    }
          }
        }
      }
    }