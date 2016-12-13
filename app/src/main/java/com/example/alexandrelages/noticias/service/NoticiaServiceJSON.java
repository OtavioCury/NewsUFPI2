package com.example.alexandrelages.noticias.service;

import android.content.Context;
import android.util.Log;

import com.example.alexandrelages.noticias.constante.URL;
import com.example.alexandrelages.noticias.modelo.Noticia;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

/**
 * Created by alexandrelages on 13/12/16.
 */

public class NoticiaServiceJSON {
    public static List<Noticia> getNoticias(Context context){
        List<Noticia> noticias = new ArrayList<Noticia>();
        AsyncHttpClient client = new AsyncHttpClient();

        RequestParams params = new RequestParams();
        //params.put("idDoAluno", idDoAluno);
        //params.put("idProva", idProva);

        client.get(URL.URL_NOTICIAS, params, new TextHttpResponseHandler() {
                    @Override
                    public void onFailure(int statusCode, Header[] headers, String response, Throwable t) {
                        Log.i("LOG", "Bad requiicao" + response);
                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, String response) {
                        Log.i("LOG", "OK requisicao" + response);
                    }
                }
        );
        return null;
    }
}
