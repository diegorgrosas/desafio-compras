import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 0){
            System.out.print("Digite 0 para sair ou 1 para continuar: ");
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Escolheu continuar!");
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }
        }

    }
}