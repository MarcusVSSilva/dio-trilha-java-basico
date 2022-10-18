public class ExercicioOperadoresRelacionais {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Cicrano";
    
        System.out.println("Relação entre tipos inteiros");
        System.out.println("i1 == i2" + (i1 == i2));
        System.out.println("i1 != i2" + (i1 != i2));
        System.out.println("i1 > i2" + (i1 > i2));
        System.out.println("i1 <= i2" + (i1 <= i2));

        System.out.println("Relação entre tipos float");        
        System.out.println("f1 == f2" + (f1 == f2));
        System.out.println("f1 != f2" + (f1 != f2));
        System.out.println("f1 >= f2" + (f1 >= f2));
        System.out.println("f1 < f2" + (f1 < f2));

        System.out.println("Relação entre tipos char");
        System.out.println("c1 == c2" + (c1 == c2));
        System.out.println("c1 != c2" + (c1 != c2));
        System.out.println("c1 > c2" + (c1 > c2));
        System.out.println("c1 <= c2" + (c1 <= c2));

        System.out.println("Relação entre tipos String");
        System.out.println("s1 != s2" + (s1 != s2));

        System.out.println("Relação entre tipo inteiro e tipo double");
        System.out.println("i1 <= d1" + (i1 <= d1));

    }
}