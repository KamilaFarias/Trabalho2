package com.example.trabalho2.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UsuarioSQLHelper extends SQLiteOpenHelper {
	
	private static final String Nome_BD = "teste";	
	private static final int Versao_BD = 1;

	public static final String TABLE_USUARIO = "usuario";
	public static final String COLUNA_NOME = "nome";
	public static final String COLUNA_ID = "id";

	public UsuarioSQLHelper(Context ctx) {
		super(ctx, Nome_BD, null, Versao_BD);
	}		

	@Override
	public void onCreate(SQLiteDatabase bd) {
		bd.execSQL(
				" CREATE TABLE " + TABLE_USUARIO 
				+ " (" + COLUNA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
				+  COLUNA_NOME + " TEXT NOT NULL) "
				);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
	}
}
