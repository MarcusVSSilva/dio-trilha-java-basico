package exercicios.arrays;
/*
Crie um vetor de 6 números inteiros 
e mostre-os na ordem inversa
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
     
        //armazenando sequencialmente dados do mesmo tipo
        int[] vetor = {-5, -2, 0, 14, 20, 5};

        System.out.print("Vetor: ");

        int contador = 0;

        //vetor.length = 6, porém o vetor inicializa as posições em "0", 0 até 5 
        while (contador < (vetor.length)){
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVetor: ");
        //vetor.length-1 indica a ultima posição desse vetor
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
