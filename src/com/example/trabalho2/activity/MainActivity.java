package com.example.trabalho2.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;

import com.example.trabalho2.R;
import com.example.trabalho2.entidade.Usuario;
import com.example.trabalho2.sqlite.UsuarioDao;
import com.example.trabalho2.sqlite.UsuarioSQLHelper;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		UsuarioDao usuarioDAO = new UsuarioDao(this);
		Usuario usuario = new Usuario();
		usuario.setNome("Henrique");
		usuarioDAO.inserir(usuario);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}


	
