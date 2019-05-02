package android.example.musical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Led Zeppelin", "Tangerine"));
        songs.add(new Song("Pink Floyd", "Sheep"));
        songs.add(new Song("Rolling Stones", "Beast of Burden"));
        songs.add(new Song("Traffic", "John Barleycorn"));
        songs.add(new Song("The Kinks", "You Really Got Me"));
        songs.add(new Song("Jimi Hendrix", "Little Wing"));
        songs.add(new Song("Cream", "Crossroads"));
        songs.add(new Song("The Who", "Baba O'Riley"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}