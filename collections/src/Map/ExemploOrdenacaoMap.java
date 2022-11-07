package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes infromações sobre meus livros favoritos e seus autores, 
 * crie um dicionário e ordene este dicionario:
 * exibindo(Nome Autor - Nome Livro);
 * 
 * Autor= Hawking, Stephen -Livro= nome: Uma Breve História do Tempo, páginas: 256
 * Autor= Duhigg, Charles - Livro = nome: O Poder do Hábito, páginas: 408 
 * Autor= Harari, Yuval Noah - Livro = 21 Lições Para o Século 21, páginas: 432
 */

public class ExemploOrdenacaoMap{
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatória\t--");
        
        Map<String, Livro> meusLivros = new HashMap<>(){{
            //chave são os nomes dos autores, não sendo declarados como atributos na classe
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder de Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        //imprimir exibindo apenas o (Nome Autor (chave) e Nome Livro);
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        
        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder de Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        //imprimir exibindo apenas o (Nome autor (chave) e Nome livro);
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética autores\t--");
        //ordem alfabetica = ordem natural = treemap
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
                
        System.out.println("--\tOrdem alfabetica nomes dos livros \t--");
        //como se trata do valor (nome) e não de uma chave, utilizamos o Set, sendo necessario um Comparator

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

    }
}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome(){
        return nome;
    }

    public Integer getPaginas(){
        return paginas;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o ==  null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, paginas);
    }

    @Override
    //sobreescrita do method to String() não deixa o endereço de memoria aparecer 
    public String toString(){
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
    
}