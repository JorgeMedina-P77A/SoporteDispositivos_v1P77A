package jorgemedina.soportededispositivos_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView miTitulo;
    TextView miTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miTitulo = (TextView) findViewById(R.id.text_hola);
        miTexto = (TextView) findViewById(R.id.text_parraf);


        miTitulo.setText(R.string.hello);
        miTexto.setText(R.string.parraf);


    }
}
