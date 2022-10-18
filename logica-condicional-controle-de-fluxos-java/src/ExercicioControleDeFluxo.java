public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
    
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchFerias();
    
    }

    
    //estrutura if para imprimir os meses do ano de acordo com seus números
    private static void ifSemFlecha(){
    
        int mes = 5;
        if (mes == 1){
            System.out.println("Janeiro");
        }else if(mes == 2){
            System.out.println("Fevereiro");
        }else if(mes == 3){
            System.out.println("Março");
        }else if(mes == 4){
            System.out.println("Abril");
        }else if(mes == 5){
            System.out.println("Maio");
        }else if(mes == 6){
            System.out.println("Junho");
        }else if(mes == 7){
            System.out.println("Julho");
        }else if(mes == 8){
            System.out.println("Agosto");
        }else if(mes == 9){
            System.out.println("Setembro");
        }else if(mes == 10){
            System.out.println("Outubro");
        }else if(mes == 11){
            System.out.println("Novembro");
        }else if(mes == 12){
            System.out.println("Dezembro");
        }else {
            System.out.println("Número digitado não corresponde a nenhum mês");
        }
    }

    //estrutura if para identificar meses referentes a ferias 
    private static void ifFerias(){
        String mes = "Julho";
        if(mes == "Julho" || mes =="Dezembro" || mes == "Janeiro"){
            System.out.println("Ferias");
        }else{
            System.out.println("Aula normal");
        }
    }

    //estrutura if sendo dividida em variaveis intermediarias (boa pratica)
    private static void ifMenor(){
        double salarioMensal = 11093.58d;
        double mediaSalario = 105000d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionario deve receber o auxilio");
        }

        boolean salariobaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if((salariobaixo) && (muitosDependentes)){
            System.out.println("Funcionario deve receber o auxilio");
        }

        boolean recebeAuxilio = (salariobaixo) && (muitosDependentes);
        if(recebeAuxilio){
            System.out.println("Funcionario deve receber o auxilio");
        }else {
            System.out.println("Funcionario não deve receber o auxilio");
        }
    }

    //estrutura switch sendo utilizada, dia como sendo a única variável 
    private static void switchSemana(){
        String dia = "Domingo";
        switch(dia){
            case "Segunda":
            System.out.println(2);
            break;
            case "Terça":
            System.out.println(3);
            break;
            case "Quarta":
            System.out.println(4);
            break;
            case "Quinta":
            System.out.println(5);
            break;
            case "Sexta":
            System.out.println(6);
            break;
            case "Sábado":
            System.out.println(7);
            break;
            case "Domingo":
            System.out.println(1);
            break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }

    //estrutura switch sendo utilizada, mes como sendo a única variável
    private static void switchFerias(){
        
        String mes = "Dezembro";
        switch(mes){
            case "Dezembro":
            case "Julho":
            case "Janeiro":
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Aula normal");
                break;
        }
    }

}
