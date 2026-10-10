import java.util.Arrays;
import java.util.*;

/**
 * Representação de um registro de resumos de estudos.
 * Permite cadastrar, consultar e buscar resumos, armazenando
 * uma quantidade limitada de registros.
 *
 * @author Gabriela de Almeida Agra
 */
public class RegistroResumos {

    /**
     * Array que armazena os resumos cadastrados.
     * Possui uma quantidade máxima de posições definida
     * no momento da criação do registro.
     */
    private Resumo[] resumos;

    /**
     * Número de resumos cadastrados no registro.
     */
    private int contador;

    /**
     * Cria um registro de resumos com a capacidade informada.
     *
     * @param quantidade quantidade máxima de resumos que
     *                   podem ser armazenados.
     */
    public RegistroResumos (int quantidade) {
        resumos = new Resumo [quantidade];
    }

    /**
     * Adiciona um novo resumo ao registro.
     * Se ainda houver espaço, o resumo é inserido na próxima
     * posição disponível. Caso o limite seja atingido,
     * o resumo mais antigo é removido e os demais são deslocados
     * para que o novo resumo seja armazenado na última posição.
     *
     * @param tema tema do resumo a ser cadastrado.
     * @param conteudo conteúdo do resumo a ser cadastrado.
     */
    public void adiciona(String tema, String conteudo) {
        if (contador < resumos.length) {
            resumos[contador] = new Resumo(tema, conteudo);
            contador++;
        } else {
            for (int i = 1; i < resumos.length; i++) {
                resumos[i - 1] = resumos[i];
            }
            resumos[resumos.length - 1] = new Resumo(tema, conteudo);
        }
    }

    /**
     * Retorna os resumos cadastrados em formato de String.
     *
     * @return array de Strings contendo a representação
     *         textual dos resumos cadastrados.
     */
    public String[] pegaResumos() {
        String[] resumosExistentes = new String[contador];
        for (int i = 0; i < contador; i++) {
            resumosExistentes[i] = resumos[i].toString();
        }
        return resumosExistentes;
    }

    /**
     * Verifica se existe um resumo cadastrado com o tema informado.
     *
     * @param tema tema que será procurado no registro.
     * @return true se existir um resumo com o tema informado;
     *         false caso contrário.
     */
    public boolean temResumo (String tema) {
        for (int j = 0; j < contador; j ++) {
            if (resumos[j].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna uma representação textual do registro,
     * informando a quantidade de resumos cadastrados
     * e os temas de cada resumo.
     *
     * @return String contendo a quantidade de resumos
     *         cadastrados e seus respectivos temas.
     */
    public String imprimeResumos() {
        String frase = "- " + contador + " " + "resumo(s) cadastrado(s)" + "\n" + "- ";
        for (int n = 0; n < contador; n ++) {
            if (n == contador - 1) {
                frase += resumos[n].getTema();
            } else {
                frase += resumos[n].getTema() + " | ";
            }
        }
        return frase;
    }

    /**
     * Retorna a quantidade de resumos cadastrados no registro.
     *
     * @return número de resumos cadastrados.
     */
    public int conta(){

        return contador;
    }

    /**
     * Busca uma palavra ou expressão nos conteúdos dos resumos,
     * ignorando diferenças entre letras maiúsculas e minúsculas.
     * Os temas dos resumos encontrados são organizados
     * em ordem alfabética.
     *
     * @param chaveDeBusca palavra ou expressão procurada
     *                     nos conteúdos dos resumos.
     * @return array de Strings contendo os temas dos resumos
     *         que possuem a palavra ou expressão pesquisada,
     *         em ordem alfabética.
     */
    public String[] busca(String chaveDeBusca) {
        String[] ArrayTemporario = new String[contador];
        int acumulador = 0;
        String chaveMinuscula = chaveDeBusca.toLowerCase();

        for (int i = 0; i < contador; i++) {
            Resumo novoResumo = resumos[i];
            if (novoResumo.getConteudo().toLowerCase().contains(chaveMinuscula)) {
                ArrayTemporario[acumulador] = novoResumo.getTema();
                acumulador++;
            }
        }
        String[] resultado = Arrays.copyOf(ArrayTemporario, acumulador);
        Arrays.sort(resultado);

        return resultado;
    }


}
