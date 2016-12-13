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
    private final NoticiaOnClickListener noticiaOnClickListener;

    public NoticiaAdapter(Context context, List<Noticia> noticias, NoticiaOnClickListener noticiaOnClickListener) {
        this.context = context;
        this.noticias = noticias;
        this.noticiaOnClickListener = noticiaOnClickListener;
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

    public void onBindViewHolder(final NoticiasViewHolder holder, final int position) {
        Noticia n = noticias.get(position);
        holder.tituloNoticia.setText(n.getTitle());
        holder.conteudoNoticia.setText(n.getContent());
        holder.dataNoticia.setText(n.getPublished_date().toString());

        if(noticiaOnClickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    noticiaOnClickListener.onClickNoticia(holder.itemView, position);
                }
            });
        }
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

    public interface NoticiaOnClickListener{
        public void onClickNoticia(View view, int idx);
    }
}
