package ExerciciosAula01;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculadora: ");
        Calculadora.soma(3,6);
        Calculadora.subtracao(10,6);
        Calculadora.multiplicacao(20,6);
        Calculadora.divisao(15,2);
    }

    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + " - " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " * " + numero2 + " é " + resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " / " + numero2 + " é " + resultado);
    }

}

