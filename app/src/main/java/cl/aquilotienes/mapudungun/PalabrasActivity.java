/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.aquilotienes.mapudungun;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.SimpleCursorAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.database.Cursor;
import android.os.Bundle;

/**
 * Created by Germán Riveros S.
 */

public class PalabrasActivity extends AppCompatActivity
{

    private AdministradorBD administradorBD;
    private SimpleCursorAdapter adapter;
    public TextView tv_letra;
    private ListView lista;
    private Cursor cursor;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palabras);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        administradorBD = new AdministradorBD(this);
        tv_letra = (TextView) findViewById(R.id.tv_letra);

        bundle = getIntent().getExtras();
        String recibeLetra = bundle.getString("Letra");
        tv_letra.setText(recibeLetra);

        //Sector - programación del listView

        lista = (ListView) findViewById(R.id.lista);

        char letra = recibeLetra.charAt(0);

        switch (letra)
        {
            case 'A': mostrarPalabrasLetras('A'); break;

            case 'B': mostrarPalabrasLetras('B'); break;

            case 'C': mostrarPalabrasLetras('C'); break;

            case 'D': mostrarPalabrasLetras('D'); break;

            case 'E': mostrarPalabrasLetras('E'); break;

            case 'F': mostrarPalabrasLetras('F'); break;

            case 'G': mostrarPalabrasLetras('G'); break;

            case 'H': mostrarPalabrasLetras('H'); break;

            case 'I': mostrarPalabrasLetras('I'); break;

            case 'J': mostrarPalabrasLetras('J'); break;

            case 'L': mostrarPalabrasLetras('L'); break;

            case 'M': mostrarPalabrasLetras('M'); break;

            case 'N': mostrarPalabrasLetras('N'); break;

            case 'O': mostrarPalabrasLetras('O'); break;

            case 'P': mostrarPalabrasLetras('P'); break;

            case 'Q': mostrarPalabrasLetras('Q'); break;

            case 'R': mostrarPalabrasLetras('R'); break;

            case 'S': mostrarPalabrasLetras('S'); break;

            case 'T': mostrarPalabrasLetras('T'); break;

            case 'U': mostrarPalabrasLetras('U'); break;

            case 'V': mostrarPalabrasLetras('V'); break;

            case 'Y': mostrarPalabrasLetras('Y'); break;

            case 'Z': mostrarPalabrasLetras('Z'); break;

        }

    }

    protected void mostrarPalabrasLetras(char Caracter)
    {

        String[] from_table = new String[]{administradorBD.CN_ESP,administradorBD.CN_MAPU};
        int[] to_table = new int[]{android.R.id.text1, android.R.id.text2 };

        cursor = administradorBD.cargarCursorLetras(Caracter);
        adapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item, cursor,from_table,to_table,0);
        lista.setAdapter(adapter);

    }


}
