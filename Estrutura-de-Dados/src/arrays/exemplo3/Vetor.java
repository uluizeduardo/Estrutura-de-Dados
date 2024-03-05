package arrays.exemplo3;

/**
 * Essa é nossa classe vetor, nela vamos estudar a estrutura de dados Array.
 * 
 * Agora a gente vai aprender a:
 * Verificar tamanho e imprimir elementos do vetor ✅
 * 
 * Este processo envolve alguns passos simples:
 *
 * Identificar o tamanho do vetor:
 * Para isso vamos criar um método chamado tamanho, nele vamos retornar o tamanho do vetor. 
 * 
 * Imprimir elementos do vetor :
 * Para isso vamos criar um método toString que retorna uma string formatada com os elementos do vetor. 
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
