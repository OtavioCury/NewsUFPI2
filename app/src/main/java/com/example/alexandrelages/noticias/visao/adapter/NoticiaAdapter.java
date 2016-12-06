package com.example.alexandrelages.noticias.visao.adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alexandrelages.noticias.R;
import com.example.alexandrelages.noticias.modelo.Noticia;

import java.util.List;

import static com.example.alexandrelages.noticias.R.mipmap.ic_launcher;

/**
 * Created by alexandrelages on 05/12/16.
 */

public class NoticiaAdapter extends RecyclerView.Adapter<NoticiaAdapter.NoticiasViewHolder>{
    private final List<Noticia> noticias;
    private final Context context;

    public NoticiaAdapter(Context context, List<Noticia> noticias) {
        this.context = context;
        this.noticias = noticias;
    }

    @Override
    public int getItemCount(){
        return this.noticias != null ? this.noticias.size() : 0;
    }

    @Override
    public NoticiasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_noticia, parent, false);
        NoticiasViewHolder holder = new NoticiasViewHolder(view);
        return holder;
    }

    public void onBindViewHolder(final NoticiasViewHolder holder, int position) {
        Noticia n = noticias.get(position);
        holder.tituloNoticia.setText(n.getTitulo());
        holder.conteudoNoticia.setText(n.getConteudo());
        holder.dataNoticia.setText(n.getData().toString());
    }

    public static class NoticiasViewHolder extends RecyclerView.ViewHolder {
        public TextView tituloNoticia;
        public TextView conteudoNoticia;
        public TextView dataNoticia;

        public NoticiasViewHolder(View itemView) {
            super(itemView);
            tituloNoticia = (TextView) itemView.findViewById(R.id.tituloNoticia);
            conteudoNoticia = (TextView) itemView.findViewById(R.id.conteudoNoticia);
            dataNoticia = (TextView) itemView.findViewById(R.id.dataNoticia);
        }
    }
}
