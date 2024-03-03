package com.example.media_player;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MusicService extends Service {
    private MediaPlayer mediaPlayer;
    private final IBinder binder = new LocalBinder();

    public class LocalBinder extends Binder {
        MusicService getService() {
            return MusicService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public void playSong() {
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(this, R.raw.song);
            mediaPlayer.setOnCompletionListener(mp -> {
                stopSelf();
                Log.d("MusicService", "Song completed");
            });

            mediaPlayer.setOnErrorListener((mp, what, extra) -> {
                Log.e("MusicService", "Error during playback - what: " + what + ", extra: " + extra);
                return false; // returning false will allow onCompletionListener to be called
            });
        }

        if (mediaPlayer != null) {
            mediaPlayer.start();
            Log.d("MusicService", "Song started");
        }
    }


    public void pauseSong() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

    public void stopSong() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopSong();
    }
}
