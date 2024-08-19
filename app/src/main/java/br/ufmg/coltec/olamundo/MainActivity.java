package br.ufmg.coltec.olamundo;

import static android.view.Gravity.CENTER;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSurprise = findViewById(R.id.btn_surprise);
        btnSurprise.setOnClickListener(view -> {
            Toast toast = Toast.makeText(MainActivity.this, R.string.toast, Toast.LENGTH_LONG);
            toast.setGravity(CENTER, 0, 0);
            toast.show();
        });
    }
}