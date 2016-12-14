package com.example.alexandrelages.noticias.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alexandrelages on 02/12/16.
 */

public class Noticia implements Serializable {
    private String title;
    private String content;
    private String dataDaNoticia;
    private Long published_date;

    public Noticia(){
    }

    public Noticia(String title, String content, Long published_date) {
        this.title = title;
        this.content = content;
        this.published_date = published_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getPublished_date() {
        return published_date;
    }

    public void setPublished_date(long published_date) {
        this.published_date = published_date;
    }

    public String getDataDaNoticia() {
        return dataDaNoticia;
    }

    public void setDataDaNoticia(String dataDaNoticia) {
        this.dataDaNoticia = dataDaNoticia;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", published_date=" + published_date +
                '}';
    }

    public void calculaData(){
        Date data = new Date(this.getPublished_date());
        dataDaNoticia = data.getDay() + "/" + data.getMonth() + "/" + data.getYear();
    }
}