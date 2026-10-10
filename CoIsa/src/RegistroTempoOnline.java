/**
 * Representação do registro de tempo investido online
 * pelo aluno em uma disciplina.
 *
 * @author Gabriela de Almeida Agra
 */
public class RegistroTempoOnline {

    /**
     * Nome da disciplina em que o aluno investe tempo online.
     */
    private String nomedaDisciplina;

    /**
     * Quantidade total de tempo investido online pelo aluno.
     * O valor é acumulado conforme os tempos são registrados.
     */
    private int tempoInvestidoOnline;

    /**
     * Quantidade de tempo esperada para a disciplina.
     * O aluno deve atingir esse tempo para cumprir a meta.
     */
    private int tempoEsperado;

    /**
     * Cria um registro de tempo online para a disciplina informada,
     * definindo o tempo esperado como 120.
     *
     * @param nomedaDisciplina nome da disciplina.
     */
    public RegistroTempoOnline (String nomedaDisciplina) {
        this.nomedaDisciplina = nomedaDisciplina;
        this.tempoEsperado = 120;
    }

    /**
     * Cria um registro de tempo online para a disciplina informada,
     * com o tempo esperado definido pelo usuário.
     *
     * @param nomedaDisciplina nome da disciplina.
     * @param tempoEsperado quantidade de tempo esperada para
     *                      a disciplina.
     */
    public RegistroTempoOnline (String nomedaDisciplina, int tempoEsperado) {
        this.nomedaDisciplina = nomedaDisciplina;
        this.tempoEsperado = tempoEsperado;
    }

    /**
     * Registra o tempo investido online pelo aluno,
     * adicionando-o ao total já acumulado.
     *
     * @param tempoInvestidoOnline quantidade de tempo online
     *                             a ser registrada.
     */
    public void adicionaTempoOnline (int tempoInvestidoOnline) {
        this.tempoInvestidoOnline += tempoInvestidoOnline;
    }

    /**
     * Verifica se o aluno atingiu o tempo esperado para a disciplina.
     *
     * @return true se o tempo investido for maior ou igual
     *         ao tempo esperado; false caso contrário.
     */
    public boolean atingiuMetaTempoOnline() {
        if (tempoInvestidoOnline >= tempoEsperado) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna uma representação textual do registro,
     * contendo o nome da disciplina e o tempo investido
     * em relação ao tempo esperado.
     *
     * @return String no formato "disciplina tempoInvestido/tempoEsperado".
     */
    @Override
    public String toString() {
        return nomedaDisciplina + " " + tempoInvestidoOnline + "/" + tempoEsperado;

    }

}
