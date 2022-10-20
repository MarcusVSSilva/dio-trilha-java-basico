package exercicios.loops;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * ex: 5! = 120 (5x4x3x2x1)
 */

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");

        //inicializa, condiciona, incremento/decremento
        for(int i = fatorial; i>=1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
        
    }
}
