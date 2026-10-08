import java.util.*;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] notas;
    private double media;
    private int numeroDeNotas;
    private int[] pesos;

    public Disciplina (int numeroDeNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroDeNotas = numeroDeNotas;
        notas = new double[numeroDeNotas];
        pesos = new int[]{1, 1, 1, 1};
    }

    public Disciplina (String nomeDisciplina, int numeroDeNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroDeNotas = numeroDeNotas;
        notas = new double[numeroDeNotas];
        this.pesos = pesos;

    }

    public Disciplina (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroDeNotas = 4;
        notas = new double[numeroDeNotas];
        pesos = new int[]{1, 1, 1, 1};
    }

    public void cadastraHoras (int horasDeEstudo) {

        this.horasDeEstudo += horasDeEstudo;
    }

    public void cadastraNota (int nota, double valorNota) {

        this.notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        double numerador = 0;
        int denominador = 0;
        for (int i = 0; i < numeroDeNotas; i++) {
            numerador += notas[i] * pesos[i];
            denominador += pesos[i];
        }
        double media = numerador / denominador;
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
