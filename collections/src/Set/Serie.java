package Set;


import java.util.Objects;

public class Serie implements Comparable <Serie> {
    //lista de atributos 
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    
    //construtor com parâmetros
    public Serie(String nome, String genero, Integer tempoEpisodio){
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome(){
        return nome;
    }

    public String getGenero(){
        return genero;
    }

    public Integer getTempoEpisodio(){
        return tempoEpisodio;
    }


    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    //importante sobreescrever os metodos equals e hashCode quando trabalhamos com a palavra hash
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    //método comparable 
    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        //indica que não são iguais 
        if(tempoEpisodio != 0) return tempoEpisodio;

        //sendo iguais, compare pelo genero
        return this.getGenero().compareTo(serie.getGenero());
    }
    

    
}