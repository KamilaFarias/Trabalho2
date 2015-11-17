package com.example.trabalho2.sqlite;

import com.example.trabalho2.entidade.Usuario;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioDao {
	private UsuarioSQLHelper helper;
	
	public UsuarioDao(Context ctx){
		
		helper = new UsuarioSQLHelper(ctx);
	}
	
	public void inserir(Usuario usuario){
		
		SQLiteDatabase bd = helper.getWritableDatabase();
		
		ContentValues valor = new ContentValues();
		
		valor.put(UsuarioSQLHelper.COLUNA_NOME,usuario.getNome());
		
		bd.insert(UsuarioSQLHelper.TABLE_USUARIO, null, valor);
		
		bd.close();
		
	}
}
