package exercicios.arrays;

import java.util.Scanner;

/* 
 * Faça um programa que leia um vetor de 6 caracteres
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int contador = 0;

        do{
            System.out.println("Letra: ");
            String letra = sc.next();

            //laço indicando que é uma consoante, por ser diferente das vogais listadas 
            if( !(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e")||
                letra.equalsIgnoreCase("i")||
                letra.equalsIgnoreCase("o")||
                letra.equalsIgnoreCase("u"))){
                consoantes[contador] = letra;
                quantidadeConsoantes++;
            }

            contador++;

        }while(contador < consoantes.length);

        //laço for each (tipo dos dados do vetor e uma nova variavel : nomedovetor)
        //para cada dado no meu vetor

        System.out.print("Consoantes: ");
    
        for (String consoante : consoantes) {
            if(consoante != null)
            System.out.print(consoante + " ");
        }

        System.out.println("\nQuantidade de Consoantes: " + quantidadeConsoantes);


    } 
}
