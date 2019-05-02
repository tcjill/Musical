package android.example.musical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PunkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("The Clash", "Train in Vain"));
        songs.add(new Song("Ramones", "Judy is a Punk Rocker"));
        songs.add(new Song("Patty Smith", "Because the Night"));
        songs.add(new Song("Carbon Silicon", "The News"));
        songs.add(new Song("Elvis Costello", "Pump It Up"));
        songs.add(new Song("Blondie", "Atomic"));
        songs.add(new Song("Rancid", "Ruby Soho"));
        songs.add(new Song("The Bouncing Souls", "The Gold Song"));


        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}
