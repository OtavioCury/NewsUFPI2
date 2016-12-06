package com.example.alexandrelages.noticias.visao.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alexandrelages.noticias.R;
import com.example.alexandrelages.noticias.modelo.Evento;
import com.example.alexandrelages.noticias.visao.adapter.EventoAdapter;
import com.example.alexandrelages.noticias.visao.adapter.NoticiaAdapter;
import com.example.alexandrelages.noticias.visao.service.EventoService;
import com.example.alexandrelages.noticias.visao.service.NoticiaService;

import java.util.List;

/**
 * Created by alexandrelages on 02/12/16.
 */

public class EventoFragment extends Fragment {
    protected RecyclerView recyclerView;
    private List<Evento> eventos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_evento, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_evento);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        pesquisaEventos();
    }

    public void pesquisaEventos(){
        this.eventos = EventoService.getEventos(this.getContext());
        recyclerView.setAdapter(new EventoAdapter(this.getContext(), eventos));
    }
}