package com.example.dell.myvideoapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the view
        VideoView videoView=findViewById(R.id.videoView);
        // set to resource video
        videoView.setVideoPath("android.resource://" + getPackageName()+ "/"+"/raw/"+"introvideo");

        // add media controls

        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
