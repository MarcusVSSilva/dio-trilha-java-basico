package ExerciciosAula02;
/*
Exercicios focados em sobrecarga de método.
Modificando a assinatura do método.
Mantendo-se o nome e alterando os parâmetros.
*/

public class Quadrilatero{

    //quadrado
    public static void area(double lado){
        System.out.println("Área do quadrado: " + lado * lado);
    }

    //retângulo
    public static void area(double lado1, double lado2){
        System.out.println("Área do quadrado: " + lado1 * lado2);
    }

    //trapézio
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor) * altura)/2);
    }

}