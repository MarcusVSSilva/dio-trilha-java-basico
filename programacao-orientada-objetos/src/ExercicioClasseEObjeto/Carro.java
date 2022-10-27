package ExercicioClasseEObjeto;
/*
Exercicio definindo uma classe, atributos, métodos get e set, construtores
*/


public class Carro{
    //lista de atributos 
    String cor;
    String modelo;
    int capacidadeTanque;

    //método construtor sem parametros
    public Carro(){};

    //método construtor com parametros
    public Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    };


    public void setCor(String cor){
        this.cor = cor;
    };

    public String getCor(){
        return cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //método do total para encher o tanque
    public double valorTotal (double valorGasolina){
        double valorTotal = valorGasolina * capacidadeTanque;
        return valorTotal;
    }

}