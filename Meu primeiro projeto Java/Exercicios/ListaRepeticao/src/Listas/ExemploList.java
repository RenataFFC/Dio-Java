package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(5.0);
        notas.add(8.0);
        notas.add(3.0);
        notas.add(5.0);
        notas.add(8.0);
        notas.add(2.0);

        System.out.println(notas);
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 10 na posição 4 :  ");
        notas.add(4, 10d);
        System.out.println(notas);

        System.out.println("Subtitua a nota 5.0 pela nota 6.0 :  ");
        notas.set(notas.indexOf(5d), 4.0);
        System.out.println(notas);

        System.out.println("Confira se a not 2 esta na lista:  " + notas.contains(4d));
        notas.set(notas.indexOf(5d), 4.0);
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados");
        for (Double nota : notas)
            System.out.println(nota);

    }
}
