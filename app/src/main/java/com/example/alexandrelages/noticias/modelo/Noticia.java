package com.example.alexandrelages.noticias.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alexandrelages on 02/12/16.
 */

public class Noticia implements Serializable {
    private String title;
    private String content;
    private Date published_date;

    public Noticia(){
    }

    public Noticia(String title, String content, Date published_date) {
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

    public Date getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", published_date=" + published_date +
                '}';
    }
}