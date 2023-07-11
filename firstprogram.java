import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class firstprogram {

    /**
     * 
     * @param args
     */

    public static void main(String[] args) throws IOException {

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
                        break;

                    case 2:
                        System.out.println("Digite o primeiro número: ");
                        a = keyboard.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        b = keyboard.nextDouble();
                        System.out.println("Digite o terceiro número: ");
                        c = keyboard.nextDouble();
                        res = a + b + c;
                        System.out.println("O resultado da soma é igual a" + res);
                        break;

                    case 3:
                        System.out.println("Digite o primeiro número: ");
                        a = keyboard.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        b = keyboard.nextDouble();
                        System.out.println("Digite o terceiro número: ");
                        c = keyboard.nextDouble();
                        res = a + b + c;
                        System.out.println("O resultado da soma é igual a " + res);
                        break;

                }

                break;

            case 2:
                // Subtração
                double a, b, c, res;
                String escolha;
                BufferedReader ler;


                ler = new BufferedReader(new InputStreamReader(System.in));
            try {
                
            
                while(true){

                System.out.println("Deseja fazer com 2 números? [s/n] ");
                System.out.println("Por favor digite somente s ou n");

                    escolha = ler.readLine();
                    if(escolha.equals("s")){

                        System.out.println("Digite o primeiro número: ");
                        a = keyboard.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        b = keyboard.nextDouble();
                        res = a - b;
                        System.out.println("O resultado é igual a: " + res);
                        break;

                    } else if (escolha.equals("n")){

                        System.out.println("No máximos faremos com três números..");
                        System.out.println("Digite o primeiro número: ");
                        a = keyboard.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        b = keyboard.nextDouble();
                        System.out.println("Digite o terceiro número: ");
                        c = keyboard.nextDouble();
                        res = a - b - c;
                        System.out.println("O resultado é igual a " + res);
                        break;
                    
                    } else{
                        System.out.println("Por favor digite somente [s ou n]");
                        break;
                        
                    }
                }
            }
             catch (Exception e) {
                System.out.println("Aconteceu um erro, por favor reinicie o programa");
            }
            
            case 3:
            // Bhaskara
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
                //Regra de três 
                double numero1, numero2, grz22, grz11, resgrzs ;
                String escolhart,  grzescolha, grzou ;
                BufferedReader lerrg, grzpdt, propor;
                
            
                
            
                lerrg = new BufferedReader(new InputStreamReader(System.in));
                grzpdt =  new BufferedReader(new InputStreamReader(System.in));
                propor =  new BufferedReader(new InputStreamReader(System.in));


                System.out.println("Deseja fazer a regra de três simples? ");
                System.out.println("Digite somente [s/n]");
        try {
                    escolhart = lerrg.readLine();
                     
                if(escolhart.equals("s"));
                {
                    System.out.println("Vamos fazer regra de três simples então.");
                    System.out.println("Digite o valor da primeira grandeza(Na primeira linha): ");
                    numero1 = keyboard.nextDouble();
                    System.out.println("Digite o valor da segunda grandeza(Na primeira linha): ");
                    numero2 = keyboard.nextDouble();

                    
                    System.out.println("Será os valores são diretamente proporcionais? ");
                    System.out.println("Digite somente s/n");
                    grzescolha = grzpdt.readLine();
                 } 
                 
                 else if {

                    System.out.println("Faremos então regra de três composta. ");
                }
                
                    
                    if (grzescolha.equals("s"));{

                        
                        System.out.println("É a primeira grandeza na segunda linha que está pendente?");
                        System.out.println("Digite somente s/n");
                        grzou = propor.readLine();
                    } else if(grzescolha.equals("n")) {

                        System.out.println("É a segunda grandeza na segunda linha que está pendente?");
                    }
                        if (grzescolha.equals("s")){
                            System.out.println("Digite o valor da segunda grandeza na segunda linha: ");
                            grz22 = keyboard.nextDouble();
                            resgrzs = (numero1 * grz22)/numero2;
                            System.out.println("O valor da regra de três desses números é igual a " + resgrzs);
                
                }
             }finally{
    }
    }
}
}
