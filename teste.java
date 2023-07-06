import java.util.Scanner;

public class teste {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        // Loop enquanto a resposta for "sim"
        while (true) {
            System.out.println("Você quer continuar? (sim/nao)");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                // Ação a ser realizada se a resposta for "sim"
                System.out.println("Continuando...");
            } else if (resposta.equalsIgnoreCase("nao")) {
                // Ação a ser realizada se a resposta for "não"
                System.out.println("Encerrando...");
                break; // Sai do loop while
            } else {
                System.out.println("Resposta inválida. Digite 'sim' ou 'nao'.");
            }
        }

        scanner.close();
    }}
