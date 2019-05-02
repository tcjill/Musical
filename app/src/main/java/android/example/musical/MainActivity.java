package android.example.musical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the classical category
        TextView classical = (TextView) findViewById(R.id.classical);

        // Set a click listener on that View
        classical.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent numbersIntent = new Intent(MainActivity.this, ClassicalActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });


        // Find the View that shows the rock category
        TextView rock = (TextView) findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockActivity}
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(rockIntent);
            }
        });

        // Find the View that shows the Punk category
        TextView punk = (TextView) findViewById(R.id.punk);

        // Set a click listener on that View
        punk.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PunkActivity}
                Intent punkIntent = new Intent(MainActivity.this, PunkActivity.class);

                // Start the new activity
                startActivity(punkIntent);
            }
        });
    }
}