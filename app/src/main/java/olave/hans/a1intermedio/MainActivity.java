package olave.hans.a1intermedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonAscii=findViewById(R.id.botonAscii);
        Button botonPotencia= findViewById(R.id.botonPotencia);
        Button botonTexto=findViewById(R.id.botonTexto);

    }
}