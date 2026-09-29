public class Descanso {
    private int horasDeDecanso;
    private int numerosDeSemana;

    public void defineHorasDescanso(int horasDeDescanso) {
        this.horasDeDecanso = horasDeDescanso;
    }

    public void defineNumeroSemanas( int numeroDeSemanas) {
        this.numerosDeSemana = numerosDeSemana;
    }

    public String getStatusGeral() {
        if (numerosDeSemana == 0 || horasDeDecanso == 0) {
            return "cansado";
        }
        else {
            double status = horasDeDecanso / numerosDeSemana;
            if (status >= 26) {
                return "descansado";
            } else {
                return "cansado";
            }
        }

    }
}
