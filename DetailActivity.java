package com.example.animeselect;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textViewTitle = findViewById(R.id.textViewTitle);
        TextView textViewDescription = findViewById(R.id.textViewDescription);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        int image = intent.getIntExtra("image", 0);
        String description = intent.getStringExtra("description");

        textViewTitle.setText(title);
        imageView.setImageResource(image);
        textViewDescription.setText(description);
    }
}
