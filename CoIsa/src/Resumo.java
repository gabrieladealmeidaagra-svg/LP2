/**
 * Representação de um resumo de estudo, contendo um tema
 * e o conteúdo correspondente.
 *
 * @author Gabriela de Almeida Agra
 */
public class Resumo {

    /**
     * Tema principal do resumo.
     */
    private String tema;

    /**
     * Conteúdo textual do resumo.
     */
    private String conteudo;

    /**
     * Cria um resumo com o tema e o conteúdo informados.
     *
     * @param tema tema principal do resumo.
     * @param conteudo conteúdo textual do resumo.
     */
    public Resumo (String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna uma representação textual do resumo,
     * contendo o tema seguido de seu conteúdo.
     *
     * @return String no formato "tema: conteúdo.".
     */
    @Override
    public String toString() {
        return tema + ": " + conteudo + ".";
    }

    /**
     * Retorna o tema do resumo.
     *
     * @return tema do resumo.
     */
    public String getTema() {
        return tema;
    }

    /**
     * Retorna o conteúdo do resumo.
     *
     * @return conteúdo textual do resumo.
     */
    public String getConteudo() {
        return conteudo;
    }
}
