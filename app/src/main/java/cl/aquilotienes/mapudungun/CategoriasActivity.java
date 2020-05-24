/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.aquilotienes.mapudungun;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;


/**
 * Created by Germán Riveros S.
 */

public class CategoriasActivity extends AppCompatActivity
{

    private Button btn_interrogativos,btn_pronunciacion, btn_pronombres,
            btn_numeros, btn_saludos, btn_frases, btn_calendario;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_interrogativos  = (Button) findViewById(R.id.btn_interrogativos);
        btn_pronunciacion   = (Button) findViewById(R.id.btn_pronunciacion);
        btn_frases          = (Button) findViewById(R.id.btn_frases);
        btn_pronombres      = (Button) findViewById(R.id.btn_pronombres);
        btn_calendario      = (Button) findViewById(R.id.btn_calendario);
        btn_numeros         = (Button) findViewById(R.id.btn_numeros);
        btn_saludos         = (Button) findViewById(R.id.btn_saludos);

    }

    public void ejecutarBotonesCategorias(View view)
    {

        switch (view.getId())
        {

            case R.id.btn_interrogativos:
                traspasarTexto(btn_interrogativos.getTag().toString()); break;

            case R.id.btn_pronunciacion:
                traspasarTexto(btn_pronunciacion.getTag().toString()); break;

            case R.id.btn_frases:
                traspasarTexto(btn_frases.getTag().toString()); break;

            case R.id.btn_pronombres:
                traspasarTexto(btn_pronombres.getTag().toString()); break;

            case R.id.btn_calendario:
                traspasarTexto(btn_calendario.getTag().toString()); break;

            case R.id.btn_numeros:
                startActivity(new Intent(CategoriasActivity.this,
                        NumerosActivity.class));break;

            case R.id.btn_saludos:
                traspasarTexto(btn_saludos.getTag().toString()); break;

        }
    }

    protected void traspasarTexto(String textoBtn)
    {

        intent = new Intent(CategoriasActivity.this, TodoCategoriasActivity.class);
        intent.putExtra("categoria", textoBtn);
        startActivity(intent);

    }


}
