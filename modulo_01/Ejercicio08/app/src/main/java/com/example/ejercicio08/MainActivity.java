package com.example.ejercicio08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (ImageButton) findViewById(R.id.imageButton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
// Inflamos el layout, es decir a partir de un layout en .xml
                View layout = inflater.inflate(R.layout.toast_layout, null);
                /*
                 * Opcionalmente se pueden modificar las vistas...
                 */
// TextView text = (TextView) layout.findViewById(R.id.text);
// text.setText("Esto es un toast personalizado");
                /*
                 * se muestra el Toast.
                 */
// Como vamos a personlizar la apariencia del toast haremos una instancia de la clase y no llamando al metodo makeText();
                Toast toast = new Toast(getApplicationContext());
// Configuramos la duracion del toast en pantalla
                toast.setDuration(Toast.LENGTH_LONG);
// Asignamos la vista inflada a nuestro Toast
                toast.setView(layout);
// mostramos el toast en pantalla
                toast.show();
            }
        });
    }
}
