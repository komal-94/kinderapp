package com.tvnetwork.kidpire.kidpiretvnetwork;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class HomePageActivity extends AppCompatActivity {
    String TAG = "com.ebookfrenzy.videoplayer";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        final VideoView videoView =
                (VideoView) findViewById(R.id.videoView);
        String path = "android.resource://" + getPackageName() + "/"
                + R.raw.beautiful_video;
        videoView.setVideoURI(Uri.parse(path));
        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setBackgroundColor(Color.WHITE);
        videoView.setOnPreparedListener(new
                                                MediaPlayer.OnPreparedListener()  {
                                                    @Override
                                                    public void onPrepared(MediaPlayer mp) {
                                                        //Log.i(TAG, "Duration = " + videoView.getDuration());
                                                        videoView.setZOrderOnTop(false);
                                                        videoView.setBackgroundColor(Color.TRANSPARENT);
                                                    }
                                                });
        videoView.setZOrderOnTop(true);
        videoView.start();
    }
}
