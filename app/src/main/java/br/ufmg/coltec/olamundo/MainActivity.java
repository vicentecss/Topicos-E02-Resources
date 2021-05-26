package br.ufmg.coltec.olamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.view.Gravity.CENTER;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSurprise = findViewById(R.id.btn_surprise);
        btnSurprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                TODO(#1): Esse texto não deveria estar aqui
                Toast toast = Toast.makeText(MainActivity.this, "Bem vindo, mestre", Toast.LENGTH_LONG);
                toast.setGravity(CENTER, 0, 0);
                toast.show();
            }
        });
    }
}