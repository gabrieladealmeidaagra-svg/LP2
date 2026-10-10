import java.util.*;

/**
 * Representação do desempenho do aluno em uma disciplina.
 * Armazena o nome da disciplina, as horas de estudo, as notas
 * obtidas pelo aluno e os pesos utilizados no cálculo da média.
 *
 * @author Gabriela de Almeida Agra
 */
public class Disciplina {

    /**
     * Nome da disciplina que o aluno está estudando.
     * No formato X, em que X é o nome da disciplina.
     */
    private String nomeDisciplina;

    /**
     * Horas de estudo dedicadas à disciplina.
     * No formato X, em que X é a quantidade de horas estudadas.
     */
    private int horasDeEstudo;

    /**
     * Array com as notas obtidas pelo aluno na disciplina.
     * Cada posição representa uma nota cadastrada.
     */
    private double[] notas;

    /**
     * Média das notas obtidas pelo aluno na disciplina.
     */
    private double media;

    /**
     * Número de notas que serão cadastradas na disciplina.
     */
    private int numeroDeNotas;

    /**
     * Array com os pesos correspondentes a cada nota.
     * Os pesos são utilizados no cálculo da média ponderada.
     */
    private int[] pesos;

    /**
     * Cria uma disciplina com a quantidade de notas informada.
     * Inicializa as notas e define o peso de cada nota como 1.
     *
     * @param numeroDeNotas quantidade de notas da disciplina.
     */
    public Disciplina (int numeroDeNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroDeNotas = numeroDeNotas;
        notas = new double[numeroDeNotas];
        pesos = new int[]{1, 1, 1, 1};
    }

    /**
     * Cria uma disciplina com nome, quantidade de notas e pesos.
     *
     * @param nomeDisciplina nome da disciplina.
     * @param numeroDeNotas quantidade de notas da disciplina.
     * @param pesos array com os pesos de cada nota.
     */
    public Disciplina (String nomeDisciplina, int numeroDeNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroDeNotas = numeroDeNotas;
        notas = new double[numeroDeNotas];
        this.pesos = pesos;

    }

    /**
     * Cria uma disciplina com o nome informado,
     * considerando quatro notas com pesos iguais a 1.
     *
     * @param nomeDisciplina nome da disciplina.
     */
    public Disciplina (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroDeNotas = 4;
        notas = new double[numeroDeNotas];
        pesos = new int[]{1, 1, 1, 1};
    }

    /**
     * Registra as horas de estudo dedicadas à disciplina,
     * somando-as ao total de horas já cadastradas.
     *
     * @param horasDeEstudo quantidade de horas de estudo a registrar.
     */
    public void cadastraHoras (int horasDeEstudo) {

        this.horasDeEstudo += horasDeEstudo;
    }

    /**
     * Registra uma nota na posição correspondente do array.
     *
     * @param nota número da nota a ser cadastrada,
     *             começando em 1.
     * @param valorNota valor da nota obtida pelo aluno.
     */
    public void cadastraNota (int nota, double valorNota) {

        this.notas[nota - 1] = valorNota;
    }

    /**
     * Verifica se o aluno foi aprovado na disciplina,
     * calculando a média ponderada das notas cadastradas.
     *
     * @return true se a média for maior ou igual a 7;
     *         false caso contrário.
     */
    public boolean aprovado() {
        double numerador = 0;
        int denominador = 0;
        for (int i = 0; i < numeroDeNotas; i++) {
            numerador += notas[i] * pesos[i];
            denominador += pesos[i];
        }
        this.media = numerador / denominador;
        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna uma representação textual da disciplina,
     * contendo seu nome, as horas de estudo, a média
     * e as notas cadastradas.
     *
     * @return String com as informações da disciplina.
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " + horasDeEstudo + " " + media + " " + Arrays.toString(notas);
    }
}
