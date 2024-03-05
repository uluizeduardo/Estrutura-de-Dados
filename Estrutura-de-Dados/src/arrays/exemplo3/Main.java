package arrays.exemplo3;

public class Main {
    public static void main(String[] args) {

        //Instanciamos um vetor e passamos o tamanho 5 para ele
        Vetor vetor = new Vetor(10);

        //Usamos o método adicionar para adicionar elementos no vetor
        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");

        System.out.println(vetor);

    }
}
