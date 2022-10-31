package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList{
    public static void main(String[] args) {
        //dada uma lista com 7 notas de um aluno {7,8.5,9.3,5,7,0,3.6}, faça:
        //forma de inicializar uma lista, antes do java 5 = List notas = new ArrayList();

        System.out.println("Crie uma lista e adicione sete notas: ");

        //forma de inicializar uma lista (collections interface list )
        List<Double> notas = new ArrayList<Double>(); //Generics(jdk5) - Diamond Operator jdk7
        
        //método para adicionar elementos na lista
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        
        //primeira forma para imprimir 
        System.out.println(notas);
        //segunda forma para imprimir
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.print(nota + " ");

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        //classe Double implements "Comparable" posibilitando os valores minimos e maximos
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        //método iterator para realizar a iteração dos elementos dessa list 
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        //iterator.hasNext() checa a existência do próximo elemento
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);
        
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            //armazenamento do proximo valor na variavel next
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia :" + notas.isEmpty());

    }
};