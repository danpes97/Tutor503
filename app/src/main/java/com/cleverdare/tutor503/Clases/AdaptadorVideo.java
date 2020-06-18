package com.cleverdare.tutor503.Clases;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.cleverdare.tutor503.Activity.VerVideoActivity;
import com.cleverdare.tutor503.R;

import java.util.List;

public class AdaptadorVideo extends RecyclerView.Adapter<AdaptadorVideo.VideoViewHolder> {

    //Creacion de Lista de items con los videos
    List<ImagenVideo> videoLista;

    //Constructor de la lista videoLista
    public AdaptadorVideo(List<ImagenVideo> videoLista) {
        this.videoLista = videoLista;
    }

    //Conector con fragments_video_lista
    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.fragments_video_lista, null, false);
        return new VideoViewHolder(view);
    }

    //Comunicador entre el adaptador y la clase VideoViewHolder
    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {

        //Asignacion de valores
        holder.imgTutor.setImageResource(videoLista.get(position).getImagen());
        //Invocamos el metodo para el evento OnClick
        holder.setOnClickListener();
    }

    //Retorna el tamaño de la lista videoLista
    @Override
    public int getItemCount() {

        return videoLista.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        //captura del contexto
        Context context;
        ImageView imgTutor;

        //Referencia a elementos del fragments_video_lista
        public VideoViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgTutor = itemView.findViewById(R.id.imgTutor);
        }

        //Metodo para evento
        void setOnClickListener(){

            imgTutor.setOnClickListener(this);
        }

        //Evento Onclick
        @Override
        public void onClick(View v) {
            Intent inteVerVideoActivity = new Intent(context, VerVideoActivity.class);
            context.startActivity(inteVerVideoActivity);
        }
    }
}
