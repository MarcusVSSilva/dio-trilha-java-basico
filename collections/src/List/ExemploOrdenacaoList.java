package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Dadas as seguintes informações sobre gatos, crie uma lista e ordene esta Lista exibindo: 
(nome - idade - cor);

Gato1 = nome: Jon, idade: 18, cor: preto
Gato2 = nome: Simba, idade: 6, cor: tigrado
Gato3 = nome: Jon, idade: 12, cor: amarelo
*/
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        
        //inicilizando uma lista
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};


        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        //utilizando Collections, com a interface Comparable implementada na classe Gatos  
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        

        //UTILIZANDO A INTERFACE COMPARATOR 
        System.out.println("--\tOrdemIdade\t---");
        //Collections.sort(meusGatos, new ComparatorIdade());  - outra opção
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}


//interface Comparable -- possui o método compareTo
class Gato implements Comparable<Gato>{
    //atributos
    private String nome;
    private Integer idade;
    private String cor;

    //construtor com parametros 
    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    //métodos get para retorno dos dados, com atributos private 
    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

    @Override
    public String toString(){
        return "{" + 
                "nome=" + nome + '\''+
                ", idade=" + idade +
                ", cor='" + cor + '\''+
                '}';
    }

    //método compareTo realiza a comparação entre os dados e retorna números inteiros
    //0 - sendo os dados iguais, 1 como sendo maior e -1 como sendo menor  
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
    
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        //cor é do tipo String, compareToIgnoreCase retorna um int
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        //tipo string, método compareToignoreCase retornando um int 
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;                //nome retornando zero, indica que é igual
        
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor!=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}