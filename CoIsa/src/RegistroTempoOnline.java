public class RegistroTempoOnline {

    private String nomedaDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline (String nomedaDisciplina) {
        this.nomedaDisciplina = nomedaDisciplina;
        this.tempoEsperado = 120;
    }

    public RegistroTempoOnline (String nomedaDisciplina, int tempoEsperado) {
        this.nomedaDisciplina = nomedaDisciplina;
        this.tempoEsperado = tempoEsperado;
    }

    public void adicionaTempoOnline (int tempoInvestidoOnline) {
        this.tempoInvestidoOnline += tempoInvestidoOnline;
    }

    public boolean atingiuMetaTempoOnline() {
        if (tempoInvestidoOnline >= tempoEsperado) {
            return true;
        } else {
            return false;
        }

    }
    @Override
    public String toString() {
        return nomedaDisciplina + " " + tempoInvestidoOnline + "/" + tempoEsperado;

    }

}
