package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{ // A classe Mentoria é filha da class Conteudo

    private LocalDate data;//uma das classes que trabalha com data

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    /* Constructor vazio*/
    public Mentoria() {
    }

    /* Constructors Getter and Setter */



    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    /* Constructor ToString() */

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
