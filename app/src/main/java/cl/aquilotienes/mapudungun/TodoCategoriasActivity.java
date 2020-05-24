/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */


package cl.aquilotienes.mapudungun;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

/**
 * Created by Germán Riveros S.
 */


public class TodoCategoriasActivity extends AppCompatActivity
{

    private TextView tv_TituloTodoCat, tv_TextoTodoCat;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_categorias);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_TituloTodoCat = (TextView) findViewById(R.id.tv_TituloTodoCat);
        tv_TextoTodoCat  = (TextView) findViewById(R.id.tv_TextoTodoCat);

        bundle = getIntent().getExtras();
        String recibeTextoBtn = bundle.getString("categoria");

        ejecutaCategoria(recibeTextoBtn);

    }


    private void ejecutaCategoria(String recibeTextoBtn)
    {

        switch(Integer.parseInt(recibeTextoBtn))
        {

            case 1:
                tv_TituloTodoCat.setText(getText(R.string.TitCatPron));
                tv_TextoTodoCat.setText(getText(R.string.TextoPronunciacion));
                break;

            case 2:
                tv_TituloTodoCat.setText(getText(R.string.TitCatPronombre));
                tv_TextoTodoCat.setText(getText(R.string.TextoPronombres));
                break;

            case 3:
                tv_TituloTodoCat.setText(getText(R.string.TitCatSaludoDespedida));
                tv_TextoTodoCat.setText(getText(R.string.TextoSaludoDespedida));
                break;

            case 4:
                tv_TituloTodoCat.setText(getText(R.string.TitCatInterrogativos));
                tv_TextoTodoCat.setText(getText(R.string.TextoInterrogativos));
                break;

            case 5:
                tv_TituloTodoCat.setText(getText(R.string.TitCatFrases));
                tv_TextoTodoCat.setText(getText(R.string.TextoConectores));
                break;

                /*
            case 6:
                tv_TituloTodoCat.setText(getText(R.string.TitCatNum));
                tv_TextoTodoCat.setText(getText(R.string.TextoNumeros));
                break; */

            case 7:
                tv_TituloTodoCat.setText(getText(R.string.TitCatCalendario));
                tv_TextoTodoCat.setText(getText(R.string.TextoCalendario));
                break;
        }

    }

}
