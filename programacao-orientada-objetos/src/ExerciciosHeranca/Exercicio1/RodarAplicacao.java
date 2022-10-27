package ExerciciosHeranca.Exercicio1;
/*
Crie as classes "Funcionario", "Gerente", "Vendedor" e "Faxineiro"
Realizar upcasts e downcasts 
*/

public class RodarAplicacao {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //dowcast, embora exista, seu uso deve ser evitado, por conta dos erros.
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
