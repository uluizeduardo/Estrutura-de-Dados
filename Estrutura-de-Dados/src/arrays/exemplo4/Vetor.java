package arrays.exemplo4;

/**
 * Essa é nossa classe vetor, nela vamos estudar a estrutura de dados Array.
 * 
 * Agora a gente vai aprender a:
 * Obter elemento de uma posição específica ✅
 * 
 * Este processo envolve alguns passos simples:
 *
 * Identificar o tamanho do vetor:
 * Como já temos nosso método tamanho, vamos usar ele para saber qual o tamanho do vetor. 
 * 
 * Pegar um determinado elemento atraves da sua posição:
 * Para isso vamos criar um método chamado buscar, esse método vai retornar nosso elemento, 
 * ou então IllegalArgumentException caso não exista a posição informada no parametro.
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

    // Método para retornar o tamanho do vetor.
    public int tamanho() {
        return this.tamanho;
    }

    // Método para retornar o elemento na posição informada.
    public String buscar(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho())) {
            throw new IllegalArgumentException("Posição invalida");
        }
        return this.elementos[posicao];
    }

    // Método para retornar o vetor formatado.
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Elementos = [ ");

        // percorrendo o vetor e adicionando os elementos no StringBuilder.
        for (int i = 0; i < tamanho(); i++) {
            s.append(elementos[i]);
            // logica para adicionar uma virgula entre os elementos do vetor.
            if(i < tamanho() -1){ // -1 é usado para não adicionar a virgula no último elemento do vetor.
                s.append(", ");
            }
        }

        s.append(" ]");
        s.append("\nTamanho = " + tamanho());
        return s.toString();
    }

    
}
