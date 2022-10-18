public class ExercicioOperadoresLogicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("Operador lógico e");
        System.out.println("b1 && b2" + (b1 && b2));
        System.out.println("b1 && b3" + (b1 && b3));

        System.out.println("Operador lógico ou");
        System.out.println("b2 || b3" + (b2 || b3));
        System.out.println("b2 || b4" + (b2 || b4));

        //só é verdadeiro quando ambos são opostos 
        System.out.println("Operador lógico xor");
        System.out.println("b2 || b3" + (b2 || b3));
        System.out.println("b2 || b4" + (b2 || b4));

        System.out.println("Negação");
        System.out.println(!b1);
        System.out.println(!b2);

    }
}
