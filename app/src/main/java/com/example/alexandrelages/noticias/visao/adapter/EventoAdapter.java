package com.example.alexandrelages.noticias.visao.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alexandrelages.noticias.R;
import com.example.alexandrelages.noticias.modelo.Evento;

import java.util.List;

/**
 * Created by alexandrelages on 05/12/16.
 */

public class EventoAdapter extends RecyclerView.Adapter<EventoAdapter.EventosViewHolder>{
    private final List<Evento> eventos;
    private final Context context;

    public EventoAdapter(Context context, List<Evento> eventos) {
        this.context = context;
        this.eventos = eventos;
    }

    @Override
    public int getItemCount() {
        return this.eventos != null ? this.eventos.size() : 0;
    }

    @Override
    public EventosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_evento, parent, false);
        EventosViewHolder holder = new EventosViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final EventosViewHolder holder, int position) {
        Evento e = eventos.get(position);
        holder.titulo.setText(e.getTitulo());
        holder.conteudo.setText(e.getConteudo());
        holder.dataInicio.setText(e.getDataInicio().toString());
        holder.dataFim.setText(e.getDataFim().toString());
    }

    public static class EventosViewHolder extends RecyclerView.ViewHolder{
        public TextView titulo;
        public TextView conteudo;
        public TextView dataInicio;
        public TextView dataFim;

        public EventosViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView) itemView.findViewById(R.id.tituloEvento);
            conteudo = (TextView) itemView.findViewById(R.id.conteudoEvento);
            dataInicio = (TextView) itemView.findViewById(R.id.dataInicioEvento);
            dataFim = (TextView) itemView.findViewById(R.id.dataFimEvento);
        }
    }
}
