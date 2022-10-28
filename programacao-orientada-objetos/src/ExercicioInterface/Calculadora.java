package ExercicioInterface;
/*
 * Classe que realizar o implemento de uma interface, se "compromete" a utilizar todos
 * os comportamentos (métodos) da interface.
 */

public class Calculadora implements OperacaoMatematica {
    public static void main(String[] args) {
        
    
    }

    @Override
        public void soma(double operando1, double operando2){
            System.out.println("Soma: " + (operando1 + operando2));
        }

        @Override
        public void subtracao(double operando1, double operando2){
            System.out.println("Subtração: " + (operando1 - operando2));
        }

        @Override
        public void multiplicacao(double operando1, double operando2){
            System.out.println("Multiplicação: " + (operando1 * operando2));
        }

        @Override
        public void divisao(double operando1, double operando2){
            System.out.println("Divisão: " + (operando1 / operando2));
        }

}
