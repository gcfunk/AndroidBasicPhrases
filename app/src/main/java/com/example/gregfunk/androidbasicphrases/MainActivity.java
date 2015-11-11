package com.example.gregfunk.androidbasicphrases;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.util.Log;

public class MainActivity extends ActionBarActivity {

    public void buttonTapped(View view) {
        String buttonId = view.getResources().getResourceEntryName(view.getId());
        Log.i("button id", buttonId);

        int soundId = getResources().getIdentifier(buttonId, "raw", "com.example.gregfunk.androidbasicphrases");
        MediaPlayer mplayer = MediaPlayer.create(this, soundId);
        mplayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
