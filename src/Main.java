import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1
        List<Integer> listaDeNumerosInteiros = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaDeNumerosInteiros.add(new Random().nextInt());
        }
        System.out.println(listaDeNumerosInteiros);
        System.out.println("Ordenando a lista de numeros inteiros de forma crescente");
        Collections.sort(listaDeNumerosInteiros);
        System.out.println(listaDeNumerosInteiros);

        // 2 e 3
        Titulo filme1 = new Titulo("Avatar");
        Titulo filme2 = new Titulo("Harry Potter e a pedra filosofal");
        Titulo filme3 = new Titulo("Star Wars: O imperio contra ataca");
        Titulo filme4 = new Titulo("De volta para o futuro");

        List<Titulo> tituloList = new ArrayList<>();
        tituloList.add(filme1);
        tituloList.add(filme2);
        tituloList.add(filme3);
        tituloList.add(filme4);

        System.out.println(tituloList);
        Collections.sort(tituloList);
        System.out.println("Lista de titulos ordenada");
        System.out.println(tituloList);

        // 4 e 5

        List<Integer> numerosAleatorio;

        numerosAleatorio = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numerosAleatorio.add(new Random().nextInt(30));
        }
        System.out.println("ArrayList:  " + numerosAleatorio);

        numerosAleatorio = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            numerosAleatorio.add(new Random().nextInt(30));
        }
        System.out.println("LinkedList: " + numerosAleatorio);


    }
}