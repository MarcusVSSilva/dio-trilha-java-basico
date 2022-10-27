package ExercicioClasseEObjeto;

public class RodarAplicacao {
    public static void main(String[] args) {
        
        //criando o objeto
        Carro ferrari = new Carro();

        ferrari.setCor("Vermelha");
        ferrari.setModelo("911");
        ferrari.setCapacidadeTanque(50);

        System.out.println("Dados primeiro objeto ferrari:");
        System.out.println(ferrari.getCor());
        System.out.println(ferrari.getModelo());
        System.out.println(ferrari.getCapacidadeTanque());
        System.out.println(ferrari.valorTotal(7.0d));

        Carro dodge = new Carro("cinza", "charger", 60);

        System.out.println("Dados segundo objeto dodge:");
        System.out.println(dodge.getCor());
        System.out.println(dodge.getModelo());
        System.out.println(dodge.getCapacidadeTanque());
        System.out.println(dodge.valorTotal(6.0d));


    }
}
