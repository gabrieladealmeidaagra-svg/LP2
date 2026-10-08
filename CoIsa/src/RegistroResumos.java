import java.util.Arrays;
import java.util.*;

public class RegistroResumos {
    private Resumo[] resumos;
    private int contador;

    public RegistroResumos (int quantidade) {
        resumos = new Resumo [quantidade];
    }

    public void adiciona (String tema, String conteudo) {
        resumos[contador] = new Resumo (tema, conteudo);
        if (contador < resumos.length) {
            contador++;
        }
    }

    public String[] pegaResumos() {
        String[] resumosExistentes = new String[contador];
        for (int i = 0; i < contador; i++) {
            resumosExistentes[i] = resumos[i].toString();
        }
        return resumosExistentes;
    }

    public boolean temResumo (String tema) {
        for (int j = 0; j < contador; j ++) {
            if (resumos[j].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

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

    public int conta(){

        return contador;
    }

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
