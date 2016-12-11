package com.example.alexandrelages.noticias.visao.service;

import android.app.usage.UsageEvents;
import android.content.Context;
import android.util.Log;

import com.example.alexandrelages.noticias.modelo.Evento;
import com.example.alexandrelages.noticias.modelo.Noticia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by alexandrelages on 05/12/16.
 */

public class EventoService {
    public static List<Evento> getEventos(Context context){
        List<Evento> eventos = new ArrayList<Evento>();
        Date dataInicio = new Date();
        Date dataFim = new Date();

        Evento e = new Evento();
        e.setTitulo("Centro de Ciências da Natureza promove o I Encontro Científico Cultural");
        e.setConteudo("O Centro de Ciências da Natureza (CCN) promove hoje (06) o I Encontro Científico Cultural. O evento terá início às 8h30, com a apresentação musical dos alunos de Ciências da Computação, Física e Química. Logo após esse momento cultural, o médico e professor Dr. Luiz Ayrton Santos Júnior vai ministrar a palestra “Ética, meio ambiente e adoecimento”.\n" +
                "\n" +
                "O encontro segue até às 17h50 com mais atividades e será realizado no Auditório Afonso Sena.\n" +
                "\n" +
                "Confira a programação completa:");
        e.setDataInicio(dataInicio);
        e.setDataFim(dataFim);
        eventos.add(e);

        Evento e1 = new Evento();
        e1.setTitulo("PPGCF divulga resultado da prova escrita pós-recurso");
        e1.setConteudo("A Universidade Federal do Piauí (UFPI), por meio da Comissão de Seleção do Processo Seletivo do Edital 003/2016-PPGCF/UFPI para ingresso no Programa de Pós-Graduação em Ciências Farmacêuticas da UFPI referente ao biênio 2017-2019 torna pública, para os devidos fins, o resultado da prova subjetiva referente ao processo seletivo após avaliação dos recursos.");
        e1.setDataInicio(dataInicio);
        e1.setDataFim(dataFim);
        eventos.add(e1);

        Evento e2 = new Evento();
        e2.setTitulo("Divulgado resultado da V etapa do Mestrado em Sociologia");
        e2.setConteudo("A Universidade Federal do Piauí (UFPI), por meio do Programa de Pós-Graduação em Sociologia torna público o resultado referente à V Etapa do processo seletivo do Mestrado em Sociologia - avaliação de currículos.");
        e2.setDataInicio(dataInicio);
        e2.setDataFim(dataFim);
        eventos.add(e2);
        return eventos;
    }
}