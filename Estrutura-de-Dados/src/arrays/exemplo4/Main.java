package arrays.exemplo4;

public class Main {
    public static void main(String[] args) {

        //Instanciamos um vetor e passamos o tamanho 5 para ele
        Vetor vetor = new Vetor(10);

        //Usamos o método adicionar para adicionar elementos no vetor
        vetor.adicionar("elemento 1"); // 0
        vetor.adicionar("elemento 2"); // 1

        System.out.println(vetor.buscar(15)); // Retorna Posição invalida, pois nosso vetor só tem 2 elementos, ou seja, até a posição 1
        System.out.println(vetor);

    }
}
