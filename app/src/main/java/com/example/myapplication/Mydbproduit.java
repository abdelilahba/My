package com.example.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Mydbproduit extends SQLiteOpenHelper {

    public static String DB_NAME = "DBProduit.db";
    public static String TABLE_NAME = "PRODUIT";
    public static String COL1 = "ID";
    public static String COL2 = "LIBELLE";
    public static String COL3 = "FAMILLE";
    public static String COL4 = "PRIXACHAT";
    public static String COL5 = "PRIXVENTE";


    public Mydbproduit(@Nullable Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE "+TABLE_NAME+"(id INTEGER PRIMARY KEY AUTOINCREMENT,libelle TEXT,famille TEXT,prixachat double,prixvente double)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

   /* public static ArrayList<Produit_table> getallproduit(SQLiteDatabase db)
    {
        Cursor c = db.rawQuery("SELECT * FROM")
    }*/
}
