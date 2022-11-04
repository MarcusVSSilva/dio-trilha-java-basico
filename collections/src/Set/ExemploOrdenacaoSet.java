package Set;
/*
 * Dadas as seguintes informações sobre as séries
 * crie um conjunto e ordene este conjunto exibindo:
 * (nome - genero - tempo de episódio);
 * 
 * Serie 1 = Nome: got, genero: fantasia; tempoEpisodio: 60
 * Serie 2 = Nome: dark, genero: drama; tempoEpisodio: 60
 * Serie 3 = Nome: that show, genero: comédia; tempoEpisodio: 25 
 */

import java.util.Set;
//import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ExemploOrdenacaoSet{
    public static void main(String[] args) {
       
        System.out.println("Ordem aleatória");

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got","fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("Ordem de inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());


        //necessaria a implementação da classe Comparable (para o tempo de episodio) na classe Serie
        /*System.out.println("Ordem natural (TempoEpisodio)");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio()); */

        /*System.out.println("Ordem Nome/Gênero/TempoEpisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        //método addAll() recebe uma collection 
        minhasSeries3.addAll(minhasSeries);
        
        for(Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisodio()); */


    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;
        
        
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }

}