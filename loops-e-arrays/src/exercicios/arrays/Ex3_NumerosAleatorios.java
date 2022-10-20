package exercicios.arrays;

import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) aramzene-os num vetor
 * Ao final mostre os números e seus sucesores.
 */

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
     
        Random random = new Random();

        int[] numerosAleatorios = new int [20];

        //laço de repetição que percorre todas as posições do vetor armazenando os números 

        for(int i =0; i < numerosAleatorios.length; i++){
            //armazenando os dados na variavel, com limite entre 0 e 100.
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        //laço for each para imprimir os numeros aleatorios
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        //laço for each para os próximos números em relação aos numeros sorteados 
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }        
    }
}
