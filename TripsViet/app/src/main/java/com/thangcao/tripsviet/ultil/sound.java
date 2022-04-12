package com.thangcao.tripsviet.ultil;

import android.content.Context;
import android.media.MediaPlayer;

public class sound {
    public static void playSound(Context context, int soundFileResId) {
        MediaPlayer mp = MediaPlayer.create(context, soundFileResId);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
                mp.release();
                mp=null;
            }
        });
        mp.start();
    }
}
