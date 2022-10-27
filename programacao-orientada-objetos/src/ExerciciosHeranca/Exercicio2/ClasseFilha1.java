package ExerciciosHeranca.Exercicio2;
/*
 * Exercicio focado em herança e seus conceitos de polimorfismo e sobrescrita
 */

public class ClasseFilha1 extends ClasseMae {
    
    //override indica a sobreescrita do método
    @Override
    public void metodo1(){
        System.out.println("Método 1 da Classe Filha 1");
    }

}
