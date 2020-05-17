package cl.aquilotienes.mapudungun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class NumerosActivity extends AppCompatActivity {

    Button btnNumeros;
    TextView tvResultadoNumeros;
    EditText etNumeros;
    String resultado;
    Map<Integer, String> numeros;
    final String MENSAJE_ERROR = "Ingrese un número entre 1 y 999999";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

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


        btnNumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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


    private void transformacionDeNumeros(int num){

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

    public String dosDigitos(int[] digito){

        //10
        if(digito[0] == 1 && digito[1] == 0)
            resultado = numeros.get(10);

        //11, 12, 13, 14, 15, 16, 17, 18, 19
        if(digito[0] == 1 && digito[1] != 0)
            resultado = "Mari " + numeros.get(digito[1]);

        //20, 30, 40, 50, 60, 70, 80, 90
        if(digito[0] != 0 && digito[0] != 1 && digito[1] == 0)
            resultado = numeros.get(digito[0]) + " Mari";

        //21, 22, 23, 24, 25, 26, 27, 28, 29 = 30, 40, 50, 60, 70, 80
        if(digito[0] != 0 && digito[0] != 1 && digito[1] != 0)
            resultado = numeros.get(digito[0]) + " Mari " + numeros.get(digito[1]);

        return resultado;

    }//fin método dosDigitos

    public String tresDigitos(int[] digito){

        //100
        if(digito[0] == 1 && digito[1] == 0 && digito[2] == 0)
            resultado = numeros.get(100);

        //101
        if(digito[0] == 1 && digito[1] == 0 && digito[2] == 1)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[2]);

        //200, 300, 400, 500, 600, 700, 800, 900
        if(digito[0] != 0 && digito[0] != 1 && digito[1] == 0 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka";

        //201, 202, 203, 204, 205, 206, 207, 208, 209 = 300, 400, 500, 600...
        if(digito[0] != 0 && digito[0] != 1 && digito[1] == 0 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[2]);

        //110, 210, 310, 410, 510, 610, 710, 810, 910
        if(digito[0] != 0 && digito[1] == 1 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka Mari";

        //111, 112, 113, 114, 115, 116, 117, 118, 119 = 200, 300, 400, 500...
        if(digito[0] != 0 && digito[1] == 1 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka Mari " + numeros.get(digito[2]);

        //120, 130, 140, 150, 160, 170, 180, 190 = 200, 300, 400, 500...
        if(digito[0] != 0 && digito[1] != 1 && digito[1] != 0 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[1]) + " Mari";

        //todas las combinaciones
        if(digito[0] != 0 && digito[1] != 0 && digito[1] != 1 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[1]) + " Mari "
                    + numeros.get(digito[2]);

        return resultado;

    }//fin método tresDigitos


    public String cuatroDigitos(int[] digito)
    {
        //1000
        if(digito[0] == 1)
            resultado = " Waranga " + complementoDigitos(digito[1], digito[2], digito[3]);

        //2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000
        if(digito[0] != 1)
            resultado = numeros.get(digito[0]) + " Waranga "
                    + complementoDigitos(digito[1], digito[2], digito[3]);

        return resultado;

    }//fin método cuatroDigitos


    private String cincoDigitos(int[] digito)
    {

        //10.000
        if(digito[0] == 1 && digito[1] == 0)
            resultado = numeros.get(10) + " " + numeros.get(1000) + " " +
                    complementoDigitos(digito[2], digito[3],digito[4]);

        //11.000, 12.000, 13.000, 14.000, 15.000, 16.000, 17.000, 18.000, 19.000
        if(digito[0] == 1 && digito[1] != 0 )
            resultado = "Mari " + numeros.get(digito[1]) + " Waranga " + " " +
                    complementoDigitos(digito[2], digito[3], digito[4]);

        //20.000, 30.000, 40.000, 50.000, 60.000, 70.000, 80.000, 90.000
        if (digito[0] != 1 && digito[1] == 0)
            resultado = numeros.get(digito[0]) + " Mari Waranga " + " "
                    + complementoDigitos(digito[2], digito[3], digito[4]);

        //21.000, 22.000, 23.000, 24.000, 25.000, 26.000, 27.000, 28.000, 29.000 = 30.000, 40.000...
        if(digito[0] != 1 && digito[1] !=0)
            resultado = numeros.get(digito[0]) + " Mari " + numeros.get(digito[1]) + " Waranga "
                    + " " + complementoDigitos(digito[2], digito[3], digito[4]);


        return resultado;
    }//fin método cincoDigitos


    private String seisDigitos(int[] digito)
    {
        resultado = "";

        //100
        if(digito[0] == 1 && digito[1] == 0 && digito[2] == 0)
            resultado = numeros.get(100) + " Waranga" +
                    complementoDigitos(digito[3], digito[4], digito[5]);

        //101
        if(digito[0] == 1 && digito[1] == 0 && digito[2] == 1)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[2])
                    + " Waranga " + complementoDigitos(digito[3], digito[4], digito[5]);


        //200, 300, 400, 500, 600, 700, 800, 900
        if(digito[0] != 0 && digito[0] != 1 && digito[1] == 0 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka Waranga " +
                    complementoDigitos(digito[3], digito[4], digito[5]);


        //201, 202, 203, 204, 205, 206, 207, 208, 209 = 300, 400, 500, 600...
        if(digito[0] != 0 && digito[0] != 1 && digito[1] == 0 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[2])
                    + " Waranga " + complementoDigitos(digito[3], digito[4], digito[5]);


        //110, 210, 310, 410, 510, 610, 710, 810, 910
        if(digito[0] != 0 && digito[1] == 1 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka Mari Waranga "
                    + complementoDigitos(digito[3], digito[4], digito[5]);

        //111, 112, 113, 114, 115, 116, 117, 118, 119 = 200, 300, 400, 500...
        if(digito[0] != 0 && digito[1] == 1 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka Mari " + numeros.get(digito[2])
                    + " Waranga " + complementoDigitos(digito[3], digito[4], digito[5]);


        //120, 130, 140, 150, 160, 170, 180, 190 = 200, 300, 400, 500...
        if(digito[0] != 0 && digito[1] != 1 && digito[1] != 0 && digito[2] == 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[1])
                    + " Mari Waranga " + complementoDigitos(digito[3], digito[4], digito[5]);


        //todas las combinaciones
        if(digito[0] != 0 && digito[1] != 0 && digito[1] != 1 && digito[2] != 0)
            resultado = numeros.get(digito[0]) + " Pataka " + numeros.get(digito[1])
                    + " Mari " + numeros.get(digito[2]) + " Waranga "
                    + complementoDigitos(digito[3], digito[4], digito[5]);


        return resultado;
    }



    private String complementoDigitos(int digito1, int digito2, int digito3)
    {

        resultado = "";
        //000
        if(digito1 == 0 && digito2 == 0 && digito3 == 0)
            resultado = "";

        //001, 002, 003, 004, 005, 006, 007, 008, 009
        if(digito1 == 0 && digito2 == 0 && digito3 != 0 )
            resultado = numeros.get(digito3);

        //010
        if(digito1 == 0 && digito2 == 1 && digito3 == 0)
            resultado = numeros.get(10);

        //011, 012, 013, 014, 015, 016, 017, 018, 019
        if(digito1 == 0 && digito2 == 1 && digito3 != 0)
            resultado = "Mari " + numeros.get(digito3);

        //020, 030, 040, 050, 060, 070, 080, 090
        if(digito1 == 0 && digito2 != 1 && digito2 != 0 && digito3 == 0)
            resultado = numeros.get(digito2) + " Mari";

        //100
        if(digito1 == 1 && digito2 == 0 && digito3 == 0)
            resultado = numeros.get(100);

        //101
        if(digito1 == 1 && digito2 == 0 && digito3 == 1)
            resultado = numeros.get(digito1) + " Pataka " + numeros.get(digito3);

        //200, 300, 400, 500, 600, 700, 800, 900
        if(digito1 != 0 && digito1 != 1 && digito2 == 0 && digito3 == 0)
            resultado = numeros.get(digito1) + " Pataka";

        //201, 202, 203, 204, 205, 206, 207, 208, 209 = 300, 400, 500, 600...
        if(digito1 != 0 && digito1 != 1 && digito2 == 0 && digito3 != 0)
            resultado = numeros.get(digito1) + " Pataka " + numeros.get(digito3);

        //110, 210, 310, 410, 510, 610, 710, 810, 910
        if(digito1 != 0 && digito2 == 1 && digito3 == 0)
            resultado = numeros.get(digito1) + " Pataka Mari";

        //111, 112, 113, 114, 115, 116, 117, 118, 119 = 200, 300, 400, 500...
        if(digito1 != 0 && digito2 == 1 && digito3 != 0)
            resultado = numeros.get(digito1) + " Pataka Mari " + numeros.get(digito3);


        //120, 130, 140, 150, 160, 170, 180, 190 = 200, 300, 400, 500...
        if(digito1 != 0 && digito2 != 1 && digito2 != 0 && digito3 == 0)
            resultado = numeros.get(digito1) + " Pataka " + numeros.get(digito2) + " Mari";

        if(digito1 != 0 && digito2 != 0 && digito2 != 1 && digito3 != 0)
            resultado = numeros.get(digito1) + " Pataka " + numeros.get(digito2) + " Mari "
                    + numeros.get(digito3);


        return resultado;
    }//fin método complementoDigitos


    private void limpiarResultado(){
        resultado = "";
    }



}//.
