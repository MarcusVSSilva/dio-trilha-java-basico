package ExerciciosAula01;

public class Emprestimo {
    public static void main(String[] args) {
        System.out.println(("Empréstimo"));
        Emprestimo.calcular(1000, getDuasParcelas());
        Emprestimo.calcular(1000, getTresParcelas());
        Emprestimo.calcular(1000,5);
    }

    public static int getDuasParcelas(){
        return 2;   
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }

    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
        if(parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        }else if(parcelas ==3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        }else{
            System.out.println("Quantidade de parcelas não aceita");
        }

    }

}
