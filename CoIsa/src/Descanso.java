public class Descanso {
    private int horasDeDecanso;
    private int numeroDeSemanas;

    public void defineHorasDescanso(int horasDeDescanso) {
        this.horasDeDecanso = horasDeDescanso;
    }

    public void defineNumeroDeSemanas( int numeroDeSemanas) {
        this.numeroDeSemanas = numeroDeSemanas;
    }

    public void getStatusGeral() {
        double status = horasDeDecanso / numeroDeSemanas;
        if(status >= 26) {
            return "descansado";
        }
        else {
            return "cansado";
        }

    }
}
