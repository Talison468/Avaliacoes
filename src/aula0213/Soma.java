package aula0213;

import java.util.Scanner;

public class Soma {

    public static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Digite um numero: ");
        a = sc.nextInt();
        System.out.println("Digite outro número: ");
        b = sc.nextInt();
        int resultado = soma(a, b);
        System.out.println(resultado);
    }
}
