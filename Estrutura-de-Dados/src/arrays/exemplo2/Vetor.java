package arrays.exemplo2;
/**
 * Essa é nossa classe vetor, nela vamos estudar a estrutura de dados Array.
 * 
 * Agora a gente vai aprender a:
 * Adicionar um elemento no final do vetor ✅
 * 
 * Este processo envolve alguns passos simples:
 *
 * Localizar o Último Elemento:
 * Antes de adicionar um novo elemento ao final do vetor, precisamos identificar onde está o último elemento atualmente. 
 * Isso é crucial para garantir que o novo elemento seja colocado corretamente.
 * 
 * Incrementar o Tamanho do Vetor:
 * Para acompanhar a adição de elementos, criaremos uma variável chamada "tamanho" que representará o número de elementos atualmente no vetor. 
 * Esta variável será fundamental para garantir que novos elementos sejam inseridos na posição correta e para evitar sobrescrita de dados.
 * 
 * Adicionar o Novo Elemento:
 * Com o conhecimento do último elemento e o tamanho do vetor atualizado, podemos adicionar facilmente o novo elemento ao final do vetor,
 * simplesmente colocando-o na posição seguinte após o último elemento.
 * 
 * 
 * @author uluizeduardo
 */
public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0; //inicializando o tamanho do vetor com 0.
    }

    /**
     * Método para adicionar um elemento no vetor.
     * @param elemento
     * @return true se o elemento foi adicionado com sucesso, false se o vetor está cheio.
     */
    public boolean adicionar(String elemento) {
       //verificando se o vetor está cheio.
       if (this.tamanho < elementos.length) {
            this.elementos[tamanho] = elemento; //adicionando o elemento no vetor.
            this.tamanho++; //incrementando o tamanho do vetor.
            return true;
       }
       return false; //caso o vetor esteja cheio.
    }
    
}
