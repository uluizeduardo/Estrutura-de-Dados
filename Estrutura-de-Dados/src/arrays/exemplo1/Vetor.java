package arrays.exemplo1;
/**
 * Essa é nossa classe vetor, nela vamos estudar a estrutura de dados Array.
 * 
 * Aqui a gente vai aprender a:
 * Adicionar um elemento no vetor ✅
 * 
 * 
 * @author uluizeduardo
 */
public class Vetor {

    private String[] elementos;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    /**
     * Método para adicionar um elemento no vetor.
     * @param elemento
     */
    public void adicionar(String elemento) {
        //Aqui a gente percorre todos os elementos do vetor.
        for (int i = 0; i < elementos.length; i++) {
            //verifica se o elemento na posição [i] está null, caso esteja vamos adicionar o elemento nessa posição.
            if (elementos[i] == null) {
                elementos[i] = elemento; //adiciona elemento ao vetor na posição [i]
                break; // para a execução do for, pois já temos um elemento nessa posição.
            }
        }
    }
    
}
