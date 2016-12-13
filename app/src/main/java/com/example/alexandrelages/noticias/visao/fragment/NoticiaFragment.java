package com.example.alexandrelages.noticias.visao.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.FrameStats;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.alexandrelages.noticias.R;
import com.example.alexandrelages.noticias.modelo.Noticia;
import com.example.alexandrelages.noticias.service.NoticiaServiceJSON;
import com.example.alexandrelages.noticias.visao.adapter.NoticiaAdapter;
import com.example.alexandrelages.noticias.visao.service.NoticiaService;

import java.io.IOException;
import java.util.List;

/**
 * Created by alexandrelages on 02/12/16.
 */

public class NoticiaFragment extends Fragment{
    protected RecyclerView recyclerView;
    private List<Noticia> noticias;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_noticia, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_noticia);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        try {
            pesquisaNoticias();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pesquisaNoticias() throws IOException{
        this.noticias = NoticiaServiceJSON.getNoticias(getContext());
        recyclerView.setAdapter(new NoticiaAdapter(this.getContext(), noticias, onClickNoticia()));
    }

    public NoticiaAdapter.NoticiaOnClickListener onClickNoticia() {
        return new NoticiaAdapter.NoticiaOnClickListener(){
            @Override
            public void onClickNoticia(View view, int idx){
                Noticia n = noticias.get(idx);
                Toast.makeText(getContext(), n.getTitle(), Toast.LENGTH_SHORT).show();
            }
        };
    }
}
