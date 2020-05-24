/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.aquilotienes.mapudungun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.app.AlertDialog;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;


/**
 * Created by Germán Riveros S.
 */


public class MainActivity extends AppCompatActivity
{

    private Button btn_diccionario, btn_categorias, btn_informacion;

    private AlertDialog.Builder builder;
    private LayoutInflater inflater;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_diccionario = (Button) findViewById(R.id.btn_diccionario);
        btn_categorias  = (Button) findViewById(R.id.btn_categorias);
        btn_informacion  = (Button) findViewById(R.id.btnInformacion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);

    }

    public void ejecutarBotonesMain(View view)
    {
        switch (view.getId())
        {

            case R.id.btn_categorias:
                startActivity(new Intent(MainActivity.this, CategoriasActivity.class));
                break;

            case R.id.btn_diccionario:
                startActivity(new Intent(MainActivity.this, Abc_Activity.class));
                break;
            case R.id.btnInformacion:
                verInformacion();
                break;
        }


    }

    public void verInformacion()
    {
        builder = new AlertDialog.Builder(this);
        inflater = getLayoutInflater();
        AlertDialog alert;

        builder.setView(inflater.inflate(R.layout.info_layout, null))

                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.cancel();
                    }
                });
        alert = builder.create();
        alert.show();

    }



}//.
