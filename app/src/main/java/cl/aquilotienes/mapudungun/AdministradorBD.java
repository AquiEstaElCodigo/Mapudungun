/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.aquilotienes.mapudungun;

import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.database.Cursor;

/**
 * Created by Germán Riveros S.
 */

class AdministradorBD
{

    public static final String TABLE_LETRA_A = "LETRA_A";
    public static final String TABLE_LETRA_B = "LETRA_B";
    public static final String TABLE_LETRA_C = "LETRA_C";
    public static final String TABLE_LETRA_D = "LETRA_D";
    public static final String TABLE_LETRA_E = "LETRA_E";
    public static final String TABLE_LETRA_F = "LETRA_F";
    public static final String TABLE_LETRA_G = "LETRA_G";
    public static final String TABLE_LETRA_H = "LETRA_H";
    public static final String TABLE_LETRA_I = "LETRA_I";
    public static final String TABLE_LETRA_J = "LETRA_J";
    //public static final String TABLE_LETRA_K = "LETRA_K";
    public static final String TABLE_LETRA_L = "LETRA_L";
    public static final String TABLE_LETRA_M = "LETRA_M";
    public static final String TABLE_LETRA_N = "LETRA_N";
    //public static final String TABLE_LETRA_Ñ = "LETRA_Ñ";
    public static final String TABLE_LETRA_O = "LETRA_O";
    public static final String TABLE_LETRA_P = "LETRA_P";
    public static final String TABLE_LETRA_Q = "LETRA_Q";
    public static final String TABLE_LETRA_R = "LETRA_R";
    public static final String TABLE_LETRA_S = "LETRA_S";
    public static final String TABLE_LETRA_T = "LETRA_T";
    public static final String TABLE_LETRA_U = "LETRA_U";
    public static final String TABLE_LETRA_V = "LETRA_V";
    //public static final String TABLE_LETRA_W = "LETRA_W";
    //public static final String TABLE_LETRA_X = "LETRA_X";
    public static final String TABLE_LETRA_Y = "LETRA_Y";
    public static final String TABLE_LETRA_Z = "LETRA_Z";

    public static final String CN_ID ="_id";
    public static final String CN_ESP = "espanol";
    public static final String CN_MAPU = "mapu";


    public static final String CREATE_TABLE_A = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_A + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";


    public static final String CREATE_TABLE_B = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_B + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";


    public static final String CREATE_TABLE_C = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_C + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";


    public static final String CREATE_TABLE_D = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_D + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_E = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_E + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_F = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_F + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_G = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_G + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_H = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_H + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_I = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_I + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_J = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_J + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";
    /*
    public static final String CREATE_TABLE_K = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_K + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";
    */
    public static final String CREATE_TABLE_L = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_L + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_M = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_M + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_N = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_N + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";
    /*
    public static final String CREATE_TABLE_Ñ = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_Ñ + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";
    */
    public static final String CREATE_TABLE_O = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_O + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_P = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_P + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_Q = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_Q + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_R = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_R + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_S = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_S + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_T = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_T + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_U = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_U + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_V = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_V + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";
    /*
    public static final String CREATE_TABLE_W = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_W + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_X = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_X + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";
    */
    public static final String CREATE_TABLE_Y = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_Y + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";

    public static final String CREATE_TABLE_Z = "CREATE TABLE IF NOT EXISTS " + TABLE_LETRA_Z + " ("
            + CN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CN_ESP + " TEXT NOT NULL,"
            + CN_MAPU + " TEXT NOT NULL);";


    protected SQLiteDatabase sqLiteDatabase;
    private AsistenteBD asistenteBD;


    public AdministradorBD(Context context)
    {

        asistenteBD = new AsistenteBD(context);
        sqLiteDatabase = asistenteBD.getWritableDatabase();

    }

    public Cursor cargarCursorLetras(char caracter)
    {

        String[] columnas = new String[]{CN_ID, CN_ESP,CN_MAPU};

        switch(caracter)
        {

            case 'A': return sqLiteDatabase.query(TABLE_LETRA_A,columnas,null,null,null,null,null);

            case 'B': return sqLiteDatabase.query(TABLE_LETRA_B,columnas,null,null,null,null,null);

            case 'C': return sqLiteDatabase.query(TABLE_LETRA_C,columnas,null,null,null,null,null);

            case 'D': return sqLiteDatabase.query(TABLE_LETRA_D,columnas,null,null,null,null,null);

            case 'E': return sqLiteDatabase.query(TABLE_LETRA_E,columnas,null,null,null,null,null);

            case 'F': return sqLiteDatabase.query(TABLE_LETRA_F,columnas,null,null,null,null,null);

            case 'G': return sqLiteDatabase.query(TABLE_LETRA_G,columnas,null,null,null,null,null);

            case 'H': return sqLiteDatabase.query(TABLE_LETRA_H,columnas,null,null,null,null,null);

            case 'I': return sqLiteDatabase.query(TABLE_LETRA_I,columnas,null,null,null,null,null);

            case 'J': return sqLiteDatabase.query(TABLE_LETRA_J,columnas,null,null,null,null,null);

            //case 'K': return sqLiteDatabase.query(TABLE_LETRA_K,columnas,null,null,null,null,null);

            case 'L': return sqLiteDatabase.query(TABLE_LETRA_L,columnas,null,null,null,null,null);

            case 'M': return sqLiteDatabase.query(TABLE_LETRA_M,columnas,null,null,null,null,null);

            case 'N': return sqLiteDatabase.query(TABLE_LETRA_N,columnas,null,null,null,null,null);

            //case 'Ñ': return sqLiteDatabase.query(TABLE_LETRA_Ñ,columnas,null,null,null,null,null);

            case 'O': return sqLiteDatabase.query(TABLE_LETRA_O,columnas,null,null,null,null,null);

            case 'P': return sqLiteDatabase.query(TABLE_LETRA_P,columnas,null,null,null,null,null);

            case 'Q': return sqLiteDatabase.query(TABLE_LETRA_Q,columnas,null,null,null,null,null);

            case 'R': return sqLiteDatabase.query(TABLE_LETRA_R,columnas,null,null,null,null,null);

            case 'S': return sqLiteDatabase.query(TABLE_LETRA_S,columnas,null,null,null,null,null);

            case 'T': return sqLiteDatabase.query(TABLE_LETRA_T,columnas,null,null,null,null,null);

            case 'U': return sqLiteDatabase.query(TABLE_LETRA_U,columnas,null,null,null,null,null);

            case 'V': return sqLiteDatabase.query(TABLE_LETRA_V,columnas,null,null,null,null,null);

            //case 'W': return sqLiteDatabase.query(TABLE_LETRA_W,columnas,null,null,null,null,null);

            //case 'X': return sqLiteDatabase.query(TABLE_LETRA_X,columnas,null,null,null,null,null);

            case 'Y': return sqLiteDatabase.query(TABLE_LETRA_Y,columnas,null,null,null,null,null);

            case 'Z': return sqLiteDatabase.query(TABLE_LETRA_Z,columnas,null,null,null,null,null);

            default:
                return null;

        }

    }
}
