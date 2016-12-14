package com.example.alexandrelages.noticias.visao.service;

import android.content.Context;
import android.util.Log;

import com.example.alexandrelages.noticias.modelo.Noticia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by alexandrelages on 02/12/16.
 */

public class NoticiaService {
    public static List<Noticia> getNoticias(Context context){
        List<Noticia> noticias = new ArrayList<Noticia>();
        Date data = new Date();

        Noticia n = new Noticia();
        n.setTitle("Centro de Ciências da Natureza promove o I Encontro Científico Cultural");
        n.setContent("O Centro de Ciências da Natureza (CCN) promove hoje (06) o I Encontro Científico Cultural. O evento terá início às 8h30, com a apresentação musical dos alunos de Ciências da Computação, Física e Química. Logo após esse momento cultural, o médico e professor Dr. Luiz Ayrton Santos Júnior vai ministrar a palestra “Ética, meio ambiente e adoecimento”.\n" +
                "\n" +
                "O encontro segue até às 17h50 com mais atividades e será realizado no Auditório Afonso Sena.\n" +
                "\n" +
                "Confira a programação completa:");
        n.setPublished_date(0);
        noticias.add(n);

        Noticia n1 = new Noticia();
        n1.setTitle("PPGCF divulga resultado da prova escrita pós-recurso");
        n1.setContent("A Universidade Federal do Piauí (UFPI), por meio da Comissão de Seleção do Processo Seletivo do Edital 003/2016-PPGCF/UFPI para ingresso no Programa de Pós-Graduação em Ciências Farmacêuticas da UFPI referente ao biênio 2017-2019 torna pública, para os devidos fins, o resultado da prova subjetiva referente ao processo seletivo após avaliação dos recursos.");
        n1.setPublished_date(0);
        noticias.add(n1);

        Noticia n2 = new Noticia();
        n2.setTitle("Divulgado resultado da V etapa do Mestrado em Sociologia");
        n2.setContent("A Universidade Federal do Piauí (UFPI), por meio do Programa de Pós-Graduação em Sociologia torna público o resultado referente à V Etapa do processo seletivo do Mestrado em Sociologia - avaliação de currículos.");
        n2.setPublished_date(0);
        noticias.add(n2);

        return noticias;
    }
}