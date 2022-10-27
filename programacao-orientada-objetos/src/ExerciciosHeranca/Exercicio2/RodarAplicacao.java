package ExerciciosHeranca.Exercicio2;

public class RodarAplicacao {
    public static void main(String[] args) {
        
        //array do tipo ClasseMae chamado classes
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //sobrescrita com polimorfismo, mudando o nome do objeto quando se percorre as posições do vetor
        for (ClasseMae classe : classes){
            classe.metodo1();
        }

        System.out.println("");

        for(ClasseMae classe : classes){
            classe.metodo2();
        }

        System.out.println("");

        //sobrescrita pura 
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();

    }
}
