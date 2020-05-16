/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.aquilotienes.mapudungun;

import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

/**
 * Created by Germán Riveros S.
 */

class AsistenteBD extends SQLiteOpenHelper
{


    private static final String DB_NAME = "PROYECTO_TENTENVILU";
    private static final int DB_SCHEME_VERSION = 1;

    public AsistenteBD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {

        super(context, name, factory, version);

    }

    public AsistenteBD(Context context)
    {

        super(context, DB_NAME, null, DB_SCHEME_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

        db.execSQL(AdministradorBD.CREATE_TABLE_A);
        db.execSQL(AdministradorBD.CREATE_TABLE_B);
        db.execSQL(AdministradorBD.CREATE_TABLE_C);
        db.execSQL(AdministradorBD.CREATE_TABLE_D);
        db.execSQL(AdministradorBD.CREATE_TABLE_E);
        db.execSQL(AdministradorBD.CREATE_TABLE_F);
        db.execSQL(AdministradorBD.CREATE_TABLE_G);
        db.execSQL(AdministradorBD.CREATE_TABLE_H);
        db.execSQL(AdministradorBD.CREATE_TABLE_I);
        db.execSQL(AdministradorBD.CREATE_TABLE_J);
        //db.execSQL(AdministradorBD.CREATE_TABLE_K);
        db.execSQL(AdministradorBD.CREATE_TABLE_L);
        db.execSQL(AdministradorBD.CREATE_TABLE_M);
        db.execSQL(AdministradorBD.CREATE_TABLE_N);
        //db.execSQL(AdministradorBD.CREATE_TABLE_Ñ);
        db.execSQL(AdministradorBD.CREATE_TABLE_O);
        db.execSQL(AdministradorBD.CREATE_TABLE_P);
        db.execSQL(AdministradorBD.CREATE_TABLE_Q);
        db.execSQL(AdministradorBD.CREATE_TABLE_R);
        db.execSQL(AdministradorBD.CREATE_TABLE_S);
        db.execSQL(AdministradorBD.CREATE_TABLE_T);
        db.execSQL(AdministradorBD.CREATE_TABLE_U);
        db.execSQL(AdministradorBD.CREATE_TABLE_V);
        //db.execSQL(AdministradorBD.CREATE_TABLE_W);
        //db.execSQL(AdministradorBD.CREATE_TABLE_X);
        db.execSQL(AdministradorBD.CREATE_TABLE_Y);
        db.execSQL(AdministradorBD.CREATE_TABLE_Z);

        db.execSQL(Tablas.INSERTAR_LETRA_A);
        db.execSQL(Tablas.INSERTAR_LETRA_B);
        db.execSQL(Tablas.INSERTAR_LETRA_C);
        db.execSQL(Tablas.INSERTAR_LETRA_D);
        db.execSQL(Tablas.INSERTAR_LETRA_E);
        db.execSQL(Tablas.INSERTAR_LETRA_F);
        db.execSQL(Tablas.INSERTAR_LETRA_G);
        db.execSQL(Tablas.INSERTAR_LETRA_H);
        db.execSQL(Tablas.INSERTAR_LETRA_I);
        db.execSQL(Tablas.INSERTAR_LETRA_J);
        //db.execSQL(Tablas.INSERTAR_LETRA_K);
        db.execSQL(Tablas.INSERTAR_LETRA_L);
        db.execSQL(Tablas.INSERTAR_LETRA_M);
        db.execSQL(Tablas.INSERTAR_LETRA_N);
        //db.execSQL(Tablas.INSERTAR_LETRA_Ñ);
        db.execSQL(Tablas.INSERTAR_LETRA_O);
        db.execSQL(Tablas.INSERTAR_LETRA_P);
        db.execSQL(Tablas.INSERTAR_LETRA_Q);
        db.execSQL(Tablas.INSERTAR_LETRA_R);
        db.execSQL(Tablas.INSERTAR_LETRA_S);
        db.execSQL(Tablas.INSERTAR_LETRA_T);
        db.execSQL(Tablas.INSERTAR_LETRA_U);
        db.execSQL(Tablas.INSERTAR_LETRA_V);
        //db.execSQL(Tablas.INSERTAR_LETRA_W);
        //db.execSQL(Tablas.INSERTAR_LETRA_X);
        db.execSQL(Tablas.INSERTAR_LETRA_Y);
        db.execSQL(Tablas.INSERTAR_LETRA_Z);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}

}
