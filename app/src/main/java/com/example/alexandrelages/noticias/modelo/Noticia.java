package com.example.alexandrelages.noticias.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alexandrelages on 02/12/16.
 */

public class Noticia implements Serializable {
    private String titulo;
    private String conteudo;
    private Date data;

    public Noticia(String titulo, String conteudo, Date data) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.data = data;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}