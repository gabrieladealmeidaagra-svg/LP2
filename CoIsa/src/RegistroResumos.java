public class RegistroResumos {
    private Resumo[] resumos;
    private int contador;

    public RegistroResumos (int quantidade) {
        resumos = new Resumo [quantidade];
    }

    public void adiciona (String tema, String conteudo) {
        resumos[contador] = new Resumo (tema, conteudo);
        contador ++;
    }

    public String[] pegaResumos() {
        String[] resumosEsxistentes = new String[contador];
        for (int i = 0; i < contador; i++) {
            resumosEsxistentes[i] = resumos[i].toString();
        }
    }

    public String imprimeResumos() {
        return "-" + contador + " " + "resumo(s) cadastrado(s)" + "/n" +
    }

    public int conta() {
        return contador;
    }


}
