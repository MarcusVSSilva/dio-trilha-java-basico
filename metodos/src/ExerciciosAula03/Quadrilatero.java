package ExerciciosAula03;
/*
 * Exercicio focado na utilização a instrução de interrupção "return" dentro do método.
 * Modificando o tipo do retorno do método como double. 
 */

public class Quadrilatero {
    
    //quadrado
    public static double area(double lado){
        return lado * lado;
    }

    //retângulo
    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    //trapézio
    public static double area(double baseMaior, double baseMenor, double altura){
        return((baseMaior+baseMenor) * altura)/2;
    }
}
