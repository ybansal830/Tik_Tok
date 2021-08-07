package com.myfirst.tiktok;

import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private VideoView video;
    private ProgressBar progress;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        video = itemView.findViewById(R.id.video);
        progress = itemView.findViewById(R.id.progress);
    }

    public void setData(String url){
        video.setVideoURI(Uri.parse(url));
        progress.setVisibility(View.VISIBLE);
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                progress.setVisibility(View.INVISIBLE);
                video.start();
            }
        });
        video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                video.start();
            }
        });
    }
}
