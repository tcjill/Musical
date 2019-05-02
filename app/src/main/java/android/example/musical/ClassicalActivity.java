package android.example.musical;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Bach", "Sinfonia"));
        songs.add(new Song("Beethoven", "Mondscheinsonate"));
        songs.add(new Song("Schubert", "Ave Maria"));
        songs.add(new Song("Mozart", "Hello/Lacrimosa"));
        songs.add(new Song("Haydn", "II.Andante"));
        songs.add(new Song("Liszt", "Consolation No. 3"));
        songs.add(new Song("Handel", "Largo From Xerxes"));
        songs.add(new Song("Dvorak", "Silent Woods"));
        songs.add(new Song("Vivaldi", "Winter"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter((ListAdapter) adapter);
    }
}
