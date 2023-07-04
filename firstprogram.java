import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

class Operamath {
    /**
     * @param args
     * @param string TODO
     */
    public static void main(String[] args) {

        System.out.println("************** SEJA BEM-VINDO A OPERA.MATH ELYSOFT ************** ");
        System.out.println("Deseja escolher qual das operações para ser feita?");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Fórmula de Bhaskara");
        System.out.println("4 - Regra de três");
        System.out.println("5 - Perímetro dos polígonos");
        System.out.println("6 - Área dos polígonos");
        System.out.println("7 - Fórmula da trigonometria (Hipotenusa e Catetos)");

        Scanner keyboard = new Scanner(System.in);// Criação do teclado
        int desc;
        desc = keyboard.nextInt();

        switch (desc) {
            case 1:
                int soma;
                System.out.println("Deseja fazer com:");
                System.out.println("1 - 2 números");
                System.out.println("2- 3 números");
                System.out.println("3 - + de 4 números");
                soma = keyboard.nextInt();
                switch (soma) {
                    case 1:
                        // Soma
                        double a, b, c, res;
                        System.out.println("Digite o primeiro número: ");
                        a = keyboard.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        b = keyboard.nextDouble();
                        res = a + b;
                        System.out.println("O resultado da soma é igual a " + res);

                    case 2:
                        System.out.println("Digite o primeiro número: ");
                        a = keyboard.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        b = keyboard.nextDouble();
                        System.out.println("Digite o terceiro número: ");
                        c = keyboard.nextDouble();
                        res = a + b + c;
                        System.out.println("O resultado da soma é igual a" + res);

                    case 3:
                        System.out.println("Digite o primeiro número: ");
                        a = keyboard.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        b = keyboard.nextDouble();
                        System.out.println("Digite o terceiro número: ");
                        c = keyboard.nextDouble();
                        res = a + b + c;
                        System.out.println("O resultado da soma é igual a" + res);

                }

                break;

            case 2:
                // Subtração
                double a, b, c, res;
                String escolha;
                BufferedReader ler;

                ler = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Deseja fazer com 2 números? [s/n] ");
                System.out.println("Por favor digite somente s ou n");
                try {
                    escolha = ler.readLine();
                    If(escolha.equalsIgnoreCase("sim"));
                    {
                        System.out.println("Digite o primeiro número: ");
                        a = keyboard.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        b = keyboard.nextDouble();
                        res = a - b;
                        System.out.println("O resultado é igual a: " + res);
                    }

                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                break;

            // Bhaskara
            case 3:
                double delt, res1, res2;
                System.out.println("Digite o coeficiente a: ");// Pedindo coeficiente a
                a = keyboard.nextDouble();
                System.out.println("Digita o coeficiente b: ");// Pedindo coeficiente b
                b = keyboard.nextDouble();
                System.out.println("Digite o coeficiente c: ");// Pedindo coeficiente c
                c = keyboard.nextDouble();

                delt = (b * b) - (4 * a * c);// Fórmula para descobrir o delta
                System.out.println("O delta dos coeficientes é igual a: " + delt);

                res1 = (-(b) + Math.sqrt(delt)) / (2 * a);// Fórmula para descobrir o x1
                res2 = (-(b) - Math.sqrt(delt)) / (2 * a);// Fórmula para descobrir o x2

                System.out.println("O resultado de x1 é: " + res1);
                System.out.println("O resultado de x2 é: " + res2);// Finalização do programa de Bhaskara
                break;

            case 4:
                
                double rtsimples,spl1, spl2,spl3, spl4, rtcompósta, descrg, d;
                String escolhart;
                BufferedReader lerrg;

                lerrg = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Deseja fazer a regra de três simples? ");
                System.out.println("Digite somente [s/n]");

                try {

                    escolhart = lerrg.readLine();
                    
                
                
                If(escolhart.equalsIgnoreCase("sim"));
                {
                    System.out.println("Vamos fazer regra de três simples então.");
                    System.out.println("Digite o nome da primeira grandeza: ");
                    spl1 = keyboard.nextDouble();
                    System.out.println("Digite o valor da primeira grandeza: ");
                    spl1 = keyboard.nextDouble();
                    System.out.println("Digite a segunda grandeza do primeira linha: ");
                    spl2 = keyboard.nextDouble();
                    System.out.println("Digite a primeira grandeza da segunda linha: ");
                    spl3 = keyboard.nextDouble();
                    System.out.println("Digite a segunda grandeza da segunda linha: ");
                    spl4 = keyboard.nextDouble();
                } }
              catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                    break;
            
        }}
    }

    private static void If(boolean equalsIgnoreCase) {
    }
}
