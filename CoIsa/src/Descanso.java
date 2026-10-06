/**
 * Representação da rotina de descanso de um aluno, ele deve descansar 26 horas por semana, ou mais, para se considerar descansado.
 *
 * @author Gabriela de Almeida Agra
 */


public class Descanso {
    /**
     * Horas de descanso do aluno. No formato X, em que X é a quantidade de horas descansadas pelo aluno.
     */

    private int horasDeDecanso;
    /**
     * Número de semanas que o aluno está seguinda a rotina. No formato X, em que X é o número de semanas.
     */

    private int numerosDeSemana;

    /**
     * Registra a quantidade de horas descansadas pelo aluno.
     *
     */

    public void defineHorasDescanso(int horasDeDescanso) {
        this.horasDeDecanso = horasDeDescanso;
    }

    /**
     * Registra o número de semanas que o aluno está seguinda a rotina.
     *
     */

    public void defineNumeroSemanas( int numerosDeSemana) {
        this.numerosDeSemana = numerosDeSemana;
    }

    /**
     * Retorna a String que representa se o aluno está cansado ou descansado. A representação segue o formato "cansado" se o aluno descansou menos de 26 horas e "descansado" se o aluno descansou mais de 26 horas por semana.
     *
     * @return a representação em String do descanso do aluno.
     */

    public String getStatusGeral() {
        if (numerosDeSemana != 0) {
            double status = horasDeDecanso / numerosDeSemana;
            if (status < 26) {
                return "cansado";
            } else {
                return "descansado";
            }
        } else {
            return "cansado";
        }

    }
}
