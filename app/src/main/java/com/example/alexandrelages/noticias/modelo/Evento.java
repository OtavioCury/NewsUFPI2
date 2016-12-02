package com.example.alexandrelages.noticias.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alexandrelages on 02/12/16.
 */

public class Evento implements Serializable{
    private String titulo;
    private String conteudo;
    private Date dataInicio;
    private Date dataFim;

    public Evento(String titulo, String conteudo, Date dataInicio, Date dataFim) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}