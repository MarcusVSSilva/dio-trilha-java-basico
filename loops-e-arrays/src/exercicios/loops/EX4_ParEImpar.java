package exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares 
 * e a quantidade de números impares.
 */

public class EX4_ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Digite a quantidade desejada de números: ");
        quantidadeNumeros= sc.nextInt();

        int contador = 0;

        do{
            System.out.println("Número: ");
            numero = sc.nextInt();

            if(numero % 2 == 0){
                quantidadePares++;
            }else{
                quantidadeImpares++;
            }

            contador++;
        }while(contador < quantidadeNumeros);

        System.out.println("Quantidade Par: " + quantidadePares);
        System.out.println("Quantidade Ímpares: " + quantidadeImpares);
        
    }
}
