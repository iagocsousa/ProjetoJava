package br.com.alura;
import java.util.ArrayList;
import java.util.Collections;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("A Revistando as ArrayLists", 21);
        Aula a2 = new Aula("C Listas de objetos", 20);
        Aula a3 = new Aula("B Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        Collections.sort(aulas);

        System.out.println(aulas);
    }
}