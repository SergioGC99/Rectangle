package mx.edu.uttijuana.rectanglee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //controles
    private EditText ediAncho, ediAlto, ediArea, ediPerimetro;
    private Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referencia a controles
        ediAncho = (EditText)findViewById(R.id.ediAncho);
        ediAlto = (EditText)findViewById(R.id.ediAlto);
        ediArea = (EditText)findViewById(R.id.ediArea);
        ediPerimetro = (EditText)findViewById(R.id.ediPerimetro);
        btnCalcular =(Button)findViewById(R.id.btnCalcular);

        //escuchar boton
        btnCalcular.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                calcularRectangulo();
            }
        });
    }

    private void calcularRectangulo(){
        try{
            //leer valores
            double ancho = Double.parseDouble(ediAncho.getText().toString());
            double alto =Double.parseDouble(ediAlto.getText().toString());
            //crear objeto
            Rectangulo r = new Rectangulo(ancho, alto);
            //desplegar datos
            ediArea.setText((String.valueOf(r.getArea())));
            ediPerimetro.setText(String.valueOf(r.getPerimetro()));
        }
        catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Los valores deben ser numericos",Toast.LENGTH_LONG).show();
        }
    }
}
