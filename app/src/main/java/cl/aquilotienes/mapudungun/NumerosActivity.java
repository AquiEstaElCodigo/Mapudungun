/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.aquilotienes.mapudungun;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Germán Riveros S.
 */


public class NumerosActivity extends AppCompatActivity
{
    Button btnNumeros;
    TextView tvResultadoNumeros;
    EditText etNumeros;
    String resultado;
    Map<Integer, String> numeros;
    final String MENSAJE_ERROR = "Ingrese un número entre 1 y 999999";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        resultado = "";
        numeros = new HashMap<Integer, String>();

        numeros.put(1, "Kiñe");
        numeros.put(2, "Epu");
        numeros.put(3, "Küla");
        numeros.put(4, "Meli");
        numeros.put(5, "Kechu");
        numeros.put(6, "Kayu");
        numeros.put(7, "Regle");
        numeros.put(8, "Pura");
        numeros.put(9, "Aylla");
        numeros.put(10, "Mari");
        numeros.put(100, "Pataka");
        numeros.put(1000, "Waranga");

        btnNumeros = (Button) findViewById(R.id.btnNumeros);
        etNumeros = (EditText) findViewById(R.id.etNumeros);
        tvResultadoNumeros = (TextView) findViewById(R.id.tvResultadoNumeros);

        btnNumeros.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try{
                    int num = Integer.parseInt(etNumeros.getText().toString());

                    if(num == 0 || num == 00 || num == 000 || num == 0000 || num == 00000
                            || num == 000000)

                        tvResultadoNumeros.setText(MENSAJE_ERROR);
                    else
                        transformacionDeNumeros(num);
                }
                catch (NumberFormatException nfe){
                    tvResultadoNumeros.setText(MENSAJE_ERROR);
                }
                catch(Exception e){
                    Toast.makeText(getApplicationContext(), "Error: " + e.toString(),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void transformacionDeNumeros(int num)
    {

        String cadena = Integer.toString(num);
        char[] caracter = cadena.toCharArray();
        int[] digito = new int[6];
        int cantidad = cadena.length();

        switch (cantidad){

            case 1:
                tvResultadoNumeros.setText(numeros.get(num));
                limpiarResultado();

                break;

            case 2:
                for(int i = 0; i < cantidad; i++)
                    digito[i] = Character.getNumericValue(caracter[i]);

                tvResultadoNumeros.setText(dosDigitos(digito));
                limpiarResultado();

                break;

            case 3:
                for(int i = 0; i < cantidad; i++)
                    digito[i] = Character.getNumericValue(caracter[i]);

                tvResultadoNumeros.setText(tresDigitos(digito));
                limpiarResultado();

                break;

            case 4:
                for(int i = 0; i < cantidad; i++)
                    digito[i] = Character.getNumericValue(caracter[i]);

                tvResultadoNumeros.setText(cuatroDigitos(digito));
                limpiarResultado();

                break;

            case 5:
                for(int i = 0; i < cantidad; i++)
                    digito[i] = Character.getNumericValue(caracter[i]);

                tvResultadoNumeros.setText(cincoDigitos(digito));
                limpiarResultado();

                break;

            case 6:
                for(int i = 0; i < cantidad; i++)
                    digito[i] = Character.getNumericValue(caracter[i]);

                tvResultadoNumeros.setText(seisDigitos(digito));
                limpiarResultado();
                break;

            default:
                tvResultadoNumeros.setText(MENSAJE_ERROR);
                break;
        }
    }

    public String dosDigitos(int[] digito)
    {
        if(digito[0] == 1 && digito[1] == 0)
            resultado = numeros.get(10);

        if(digito[0] == 1 && digito[1] != 0)
            resultado = "Mari " + numeros.get(digito[1]);

        if(digito[0] != 0 && digito[0] != 1 && digito[1] == 0)
            resultado = numeros.get(digito[0]) + " Mari";

        if(digito[0] != 0 && digito[0] != 1 && digito[1] != 0)
            resultado = numeros.get(digito[0]) + " Mari " + numeros.get(digito[1]);

        return resultado;
    }

    public String tresDigitos(int[] digito)
    {
        if(digito[0] == 1 && digito[1] == 0 && digito[2] == 0)
            resultado = numeros.get(100);

        if(digito[0] == 1 && digito[1] == 0 && digito[2] == 1)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[2]);

        if(digito[0] != 0 && digito[0] != 1 && digito[1] == 0 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka";

        if(digito[0] != 0 && digito[0] != 1 && digito[1] == 0 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[2]);

        if(digito[0] != 0 && digito[1] == 1 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka Mari";

        if(digito[0] != 0 && digito[1] == 1 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka Mari " + numeros.get(digito[2]);

        if(digito[0] != 0 && digito[1] != 1 && digito[1] != 0 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[1]) + " Mari";

        if(digito[0] != 0 && digito[1] != 0 && digito[1] != 1 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[1]) + " Mari "
                    + numeros.get(digito[2]);

        return resultado;
    }


    public String cuatroDigitos(int[] digito)
    {
        if(digito[0] == 1)
            resultado = " Waranga " + complementoDigitos(digito[1], digito[2], digito[3]);

        if(digito[0] != 1)
            resultado = numeros.get(digito[0]) + " Waranga "
                    + complementoDigitos(digito[1], digito[2], digito[3]);

        return resultado;
    }


    private String cincoDigitos(int[] digito)
    {
        if(digito[0] == 1 && digito[1] == 0)
            resultado = numeros.get(10) + " " + numeros.get(1000) + " " +
                    complementoDigitos(digito[2], digito[3],digito[4]);

        if(digito[0] == 1 && digito[1] != 0 )
            resultado = "Mari " + numeros.get(digito[1]) + " Waranga " + " " +
                    complementoDigitos(digito[2], digito[3], digito[4]);

        if (digito[0] != 1 && digito[1] == 0)
            resultado = numeros.get(digito[0]) + " Mari Waranga " + " "
                    + complementoDigitos(digito[2], digito[3], digito[4]);

        if(digito[0] != 1 && digito[1] !=0)
            resultado = numeros.get(digito[0]) + " Mari " + numeros.get(digito[1]) + " Waranga "
                    + " " + complementoDigitos(digito[2], digito[3], digito[4]);

        return resultado;
    }


    private String seisDigitos(int[] digito)
    {
        resultado = "";

        if(digito[0] == 1 && digito[1] == 0 && digito[2] == 0)
            resultado = numeros.get(100) + " Waranga" +
                    complementoDigitos(digito[3], digito[4], digito[5]);

        if(digito[0] == 1 && digito[1] == 0 && digito[2] == 1)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[2])
                    + " Waranga " + complementoDigitos(digito[3], digito[4], digito[5]);

        if(digito[0] != 0 && digito[0] != 1 && digito[1] == 0 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka Waranga " +
                    complementoDigitos(digito[3], digito[4], digito[5]);

        if(digito[0] != 0 && digito[0] != 1 && digito[1] == 0 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[2])
                    + " Waranga " + complementoDigitos(digito[3], digito[4], digito[5]);

        if(digito[0] != 0 && digito[1] == 1 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka Mari Waranga "
                    + complementoDigitos(digito[3], digito[4], digito[5]);

        if(digito[0] != 0 && digito[1] == 1 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka Mari " + numeros.get(digito[2])
                    + " Waranga " + complementoDigitos(digito[3], digito[4], digito[5]);

        if(digito[0] != 0 && digito[1] != 1 && digito[1] != 0 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[1])
                    + " Mari Waranga " + complementoDigitos(digito[3], digito[4], digito[5]);

        if(digito[0] != 0 && digito[1] != 0 && digito[1] != 1 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[1])
                    + " Mari " + numeros.get(digito[2]) + " Waranga "
                    + complementoDigitos(digito[3], digito[4], digito[5]);

        return resultado;
    }



    private String complementoDigitos(int digito1, int digito2, int digito3)
    {
        resultado = "";
        if(digito1 == 0 && digito2 == 0 && digito3 == 0)
            resultado = "";

        if(digito1 == 0 && digito2 == 0 && digito3 != 0 )
            resultado = numeros.get(digito3);

        if(digito1 == 0 && digito2 == 1 && digito3 == 0)
            resultado = numeros.get(10);

        if(digito1 == 0 && digito2 == 1 && digito3 != 0)
            resultado = "Mari " + numeros.get(digito3);

        if(digito1 == 0 && digito2 != 1 && digito2 != 0 && digito3 == 0)
            resultado = numeros.get(digito2) + " Mari";

        if(digito1 == 1 && digito2 == 0 && digito3 == 0)
            resultado = numeros.get(100);

        if(digito1 == 1 && digito2 == 0 && digito3 == 1)
            resultado = numeros.get(digito1) + " Pataka " + numeros.get(digito3);

        if(digito1 != 0 && digito1 != 1 && digito2 == 0 && digito3 == 0)
            resultado = numeros.get(digito1) + " Pataka";

        if(digito1 != 0 && digito1 != 1 && digito2 == 0 && digito3 != 0)
            resultado = numeros.get(digito1) + " Pataka " + numeros.get(digito3);

        if(digito1 != 0 && digito2 == 1 && digito3 == 0)
            resultado = numeros.get(digito1) + " Pataka Mari";

        if(digito1 != 0 && digito2 == 1 && digito3 != 0)
            resultado = numeros.get(digito1) + " Pataka Mari " + numeros.get(digito3);

        if(digito1 != 0 && digito2 != 1 && digito2 != 0 && digito3 == 0)
            resultado = numeros.get(digito1) + " Pataka " + numeros.get(digito2) + " Mari";

        if(digito1 != 0 && digito2 != 0 && digito2 != 1 && digito3 != 0)
            resultado = numeros.get(digito1) + " Pataka " + numeros.get(digito2) + " Mari "
                    + numeros.get(digito3);

        return resultado;
    }

    private void limpiarResultado()
    {
        resultado = "";
    }

}
