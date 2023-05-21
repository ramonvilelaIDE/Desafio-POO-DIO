package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    /*Criando atributos da classe Conteudo*/
    protected static double XP_PADRAO =10d;//somente classes filhas de conteudo terão acesso, pois está 'protected'

    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    /* 1) Criando Constructors Getters and Setters
    * Não foi criado do XP_PADRAO porque é um 'final' */

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
