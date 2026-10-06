import java.util.*;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] notas = {0, 0, 0, 0};
    private double media;

    public Disciplina (String nomeDisciplina) {

        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras (int horasDeEstudo) {

        this.horasDeEstudo += horasDeEstudo;
    }

    public void cadastraNota (int nota, double valorNota) {

        this.notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        this.media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + horasDeEstudo + " " + media + " " + Arrays.toString(notas);
    }
}
