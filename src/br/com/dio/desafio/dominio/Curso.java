package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }


    private int cargaHoraria;

    /* Constructor vazio*/

    public Curso() {
    }

    /*Constructors Getter and Setter */



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    /* Constructor ToString() */

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
