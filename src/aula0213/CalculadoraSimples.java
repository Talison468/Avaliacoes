package aula0213;
import java.util.Scanner;
public class CalculadoraSimples {

    public static double soma(double a, double b) {
        return a + b;
    }
    public static double subtracao(double a, double b) {
        return a - b;
    }
    public static double divisao(double a, double b) {
        return a / b;
    }
    public static double multiplicacao(double a, double b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        int opcao;

        do {
            System.out.println("   ");
            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("0 - Sair");
            System.out.println("Digite sua escolha:");
            opcao = sc.nextInt();
            if(opcao >= 1 && opcao <= 4) {

                System.out.println("Digite um número: ");
                a = sc.nextDouble();
                System.out.println("Digite o outro número: ");
                b = sc.nextDouble();

                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = soma(a, b);
                        System.out.println("resultado: " + resultado);
                        break;
                    case 2:
                        resultado = subtracao(a, b);
                        System.out.println("resultado: " + resultado);
                        break;
                    case 3:
                        resultado = divisao(a, b);
                        System.out.println("resultado: " + resultado);
                        break;
                    case 4:
                        resultado = multiplicacao(a, b);
                        System.out.println("resultado: " + resultado);
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("opção invalida tente novamente");
            }
        } while (opcao != 0);
        System.out.println("Fim do calculo");
        System.out.println("    ");
        sc.close();
    }
}
